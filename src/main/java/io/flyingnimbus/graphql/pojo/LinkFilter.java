package io.flyingnimbus.graphql.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Kye
 */
@Setter
public class LinkFilter {

    private String descriptionContains;
    private String urlContains;

    @JsonProperty("description_contains")
    public String getDescriptionContains() {
        return descriptionContains;
    }

    @JsonProperty("url_contains")
    public String getUrlContains() {
        return urlContains;
    }
}
