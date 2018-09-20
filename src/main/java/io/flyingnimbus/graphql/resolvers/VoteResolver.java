package io.flyingnimbus.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import io.flyingnimbus.graphql.pojo.Link;
import io.flyingnimbus.graphql.pojo.User;
import io.flyingnimbus.graphql.pojo.Vote;
import io.flyingnimbus.graphql.repo.LinkRepository;
import io.flyingnimbus.graphql.repo.UserRepository;

/**
 * @author Kye
 */
public class VoteResolver implements GraphQLResolver<Vote> {

    private final LinkRepository linkRepository;
    private final UserRepository userRepository;

    public VoteResolver(LinkRepository linkRepository, UserRepository userRepository) {
        this.linkRepository = linkRepository;
        this.userRepository = userRepository;
    }

    public User user(Vote vote) {
        return userRepository.findById(vote.getUserId());
    }

    public Link link(Vote vote) {
        return linkRepository.findById(vote.getLinkId());
    }


}
