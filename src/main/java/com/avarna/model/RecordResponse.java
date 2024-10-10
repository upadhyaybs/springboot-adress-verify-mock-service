package com.avarna.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class RecordResponse {

    @JsonProperty(value = "Records")
    private List<RecordResponseData> Records;
    @JsonProperty(value = "TotalRecords")
    private String TotalRecords;
    @JsonProperty(value = "TransmissionReference")
    private String TransmissionReference;
    @JsonProperty(value = "TransmissionResults")
    private String TransmissionResults;
    @JsonProperty(value = "Version")
    private String Version;

    @Getter
    @Setter
    public static class RecordResponseData {
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
}
