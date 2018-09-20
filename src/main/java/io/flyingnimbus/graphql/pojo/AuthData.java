package io.flyingnimbus.graphql.pojo;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Kye
 */
@Getter
@Setter
public class AuthData {


    private String email;
    private String password;

    public AuthData() {
    }

    public AuthData(String email, String password) {
        this.email = email;
        this.password = password;
    }
}
