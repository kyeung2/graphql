package io.flyingnimbus.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLRootResolver;
import graphql.GraphQLException;
import graphql.schema.DataFetchingEnvironment;
import io.flyingnimbus.graphql.AuthContext;
import io.flyingnimbus.graphql.pojo.AuthData;
import io.flyingnimbus.graphql.pojo.Link;
import io.flyingnimbus.graphql.pojo.SigninPayload;
import io.flyingnimbus.graphql.pojo.User;
import io.flyingnimbus.graphql.repo.LinkRepository;
import io.flyingnimbus.graphql.repo.UserRepository;

/**
 * @author Kye
 */
public class Mutation implements GraphQLRootResolver {


    private final LinkRepository linkRepository;
    private final UserRepository userRepository;

    public Mutation(LinkRepository linkRepository, UserRepository userRepository) {
        this.linkRepository = linkRepository;
        this.userRepository = userRepository;
    }

    public Link createLink(String url, String description, DataFetchingEnvironment env) {
        AuthContext context = env.getContext();


        System.out.println("does the context contain a user?"+ context.getUser());

        Link newLink = new Link(url, description, context.getUser().getId());
        linkRepository.saveLink(newLink);
        return newLink;
    }

    public User createUser(String name, AuthData auth) {
        User newUser = new User(name, auth.getEmail(), auth.getPassword());
        return userRepository.saveUser(newUser);
    }


    public SigninPayload signinUser(AuthData auth) {
        User user = userRepository.findByEmail(auth.getEmail());
        if (user.getPassword().equals(auth.getPassword())) {
            return new SigninPayload(user.getId(), user);
        }
        throw new GraphQLException("Invalid credentials");
    }
}
