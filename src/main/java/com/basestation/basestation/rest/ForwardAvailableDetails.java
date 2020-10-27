package com.basestation.basestation.rest;

import com.basestation.basestation.model.AvailableChannelReq;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.persistence.GeneratedValue;

@RestController
@RequestMapping("forwardDetails")
public class ForwardAvailableDetails{
    @PostMapping()
    public JsonNode details(@RequestBody JsonNode jsonNode){
        System.out.println("Received JSON:"+jsonNode.toString());
        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<JsonNode> request = new HttpEntity<>(jsonNode);

        String url = "https://safe-basin-01006.herokuapp.com/api/avail_spectrum";
        ResponseEntity<JsonNode> response =
                restTemplate.exchange(url,
                        HttpMethod.POST,
                        request,
                        JsonNode.class);
        JsonNode responsePayload = response.getBody();
        return responsePayload;


    }
    @GetMapping()
    public String getty(){
        return "eqweqw";
    }
}
