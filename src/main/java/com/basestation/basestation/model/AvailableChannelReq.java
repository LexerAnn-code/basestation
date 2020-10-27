package com.basestation.basestation.model;

import com.fasterxml.jackson.databind.JsonNode;

public class AvailableChannelReq {
    private JsonNode deviceDesc;
    private  JsonNode location;

    public JsonNode getDeviceDesc() {
        return deviceDesc;
    }

    public void setDeviceDesc(JsonNode deviceDesc) {
        this.deviceDesc = deviceDesc;
    }

    public JsonNode getLocation() {
        return location;
    }

    public void setLocation(JsonNode location) {
        this.location = location;
    }
}
