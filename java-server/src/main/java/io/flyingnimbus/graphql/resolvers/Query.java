package io.flyingnimbus.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLRootResolver;
import io.flyingnimbus.graphql.pojo.Link;
import io.flyingnimbus.graphql.repo.LinkRepository;

import java.util.List;

/**
 * @author Kye
 */
public class Query implements GraphQLRootResolver {

    private final LinkRepository linkRepository;

    public Query(LinkRepository linkRepository) {
        this.linkRepository = linkRepository;
    }

    public List<Link> allLinks() {
        return linkRepository.getAllLinks();
    }

}
