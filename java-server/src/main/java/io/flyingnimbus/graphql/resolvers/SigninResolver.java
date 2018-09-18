package io.flyingnimbus.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import io.flyingnimbus.graphql.pojo.SigninPayload;
import io.flyingnimbus.graphql.pojo.User;

/**
 * @author Kye
 */
public class SigninResolver implements GraphQLResolver<SigninPayload> {

    public User user(SigninPayload payload) {
        return payload.getUser();
    }
}
