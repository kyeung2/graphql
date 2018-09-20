package io.flyingnimbus.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import io.flyingnimbus.graphql.pojo.Link;
import io.flyingnimbus.graphql.pojo.User;
import io.flyingnimbus.graphql.repo.UserRepository;

/**
 * @author Kye
 */
public class LinkResolver implements GraphQLResolver<Link> {

    private final UserRepository userRepository;

    public LinkResolver(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User postedBy(Link link) {
        if (link.getUserId() == null) {
            return null;
        }
        return userRepository.findById(link.getUserId());
    }
}
