package com.avarna.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class RecordRequest {

    @JsonProperty(value = "TransmissionReference")
    private String TransmissionReference;
    @JsonProperty(value = "Actions")
    private String Actions;
    @JsonProperty(value = "Columns")
    private String Columns;
    @JsonProperty(value = "CustomerID")
    private String CustomerID;
    @JsonProperty(value = "Options")
    private String Options;
    @JsonProperty(value = "Records")
    private List<Record> Records;
}
