package coms.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AirtableResponse {
    @JsonProperty("id")
    private String id;

    @JsonProperty("fields")
    private AirtableUserRecord fields;

}
