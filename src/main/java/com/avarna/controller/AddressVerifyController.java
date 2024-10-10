package com.avarna.controller;

import com.avarna.model.Record;
import com.avarna.model.RecordRequest;
import com.avarna.model.RecordResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v3/WEB/ContactVerify")
public class AddressVerifyController {

    @PostMapping("/doContactVerify")
    public RecordResponse processRecords(@RequestBody RecordRequest recordRequest) {
        // Create the response
        RecordResponse response = new RecordResponse();
        List<RecordResponse.RecordResponseData> responseDataList = new ArrayList<>();

        // Iterate through the incoming records and generate the response
        for (Record record : recordRequest.getRecords()) {
            var responseData = getRecordResponseData(record);
            responseDataList.add(responseData);
        }

        // Set the response details
        response.setRecords(responseDataList);
        response.setTotalRecords(String.valueOf(recordRequest.getRecords().size()));
        response.setTransmissionReference(recordRequest.getTransmissionReference());
        response.setTransmissionResults("GE21");
        response.setVersion("8.4.0.1310");

        return response;
    }

    private static RecordResponse.RecordResponseData getRecordResponseData(Record record) {
        RecordResponse.RecordResponseData responseData = new RecordResponse.RecordResponseData();

        // Set the same address fields from the request
        responseData.setRecordID(record.getRecordID());
        responseData.setAddressLine1(record.getAddressLine1());
        responseData.setAddressLine2(record.getAddressLine2());
        responseData.setCity(record.getCity());
        responseData.setState(record.getState());
        responseData.setPostalCode(record.getPostalCode());
        responseData.setCountry(record.getCountry());
        return responseData;
    }
}
