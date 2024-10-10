package com.avarna.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Record {

    @JsonProperty(value = "AddressLine1")
    private String AddressLine1;
    @JsonProperty(value = "AddressLine2")
    private String AddressLine2;
    @JsonProperty(value = "City")
    private String City;
    @JsonProperty(value = "Country")
    private String Country;
    @JsonProperty(value = "PostalCode")
    private String PostalCode;
    @JsonProperty(value = "RecordID")
    private String RecordID;
    @JsonProperty(value = "State")
    private String State;
}
