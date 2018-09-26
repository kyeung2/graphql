package io.flyingnimbus.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLRootResolver;
import io.flyingnimbus.graphql.pojo.LinkFilter;
import io.flyingnimbus.graphql.pojo.Link;
import io.flyingnimbus.graphql.pojo.User;
import io.flyingnimbus.graphql.repo.LinkRepository;
import io.flyingnimbus.graphql.repo.UserRepository;

import java.util.List;

/**
 * @author Kye
 */
public class Query implements GraphQLRootResolver {

    private final LinkRepository linkRepository;

    private final UserRepository userRepository;

    public Query(LinkRepository linkRepository, UserRepository userRepository) {
        this.linkRepository = linkRepository;
        this.userRepository = userRepository;
    }

    public List<Link> allLinks(LinkFilter filter, Number skip, Number first) {
        return linkRepository.getAllLinks(filter, skip.intValue(), first.intValue());
    }

    public List<User> getUsers(){
        return userRepository.getAllUsers();
    }

}