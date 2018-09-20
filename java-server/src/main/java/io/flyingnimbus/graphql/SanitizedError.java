package io.flyingnimbus.graphql;

import com.fasterxml.jackson.annotation.JsonIgnore;
import graphql.ExceptionWhileDataFetching;

/**
 * @author Kye
 */
public class SanitizedError extends ExceptionWhileDataFetching {

    public SanitizedError(ExceptionWhileDataFetching inner) {
        super(inner.getException());
    }



    @JsonIgnore
    @Override
    public Throwable getException() {
        return super.getException();
    }
}
