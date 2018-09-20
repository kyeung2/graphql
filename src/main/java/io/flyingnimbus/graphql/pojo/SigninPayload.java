package io.flyingnimbus.graphql.pojo;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Kye
 */
@Getter
@Setter
public class SigninPayload {

    private final String token;
    private final User user;

    public SigninPayload(String token, User user) {
        this.token = token;
        this.user = user;
    }

}