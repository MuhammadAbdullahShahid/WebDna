package com.example.webDna.util.response;

import java.util.HashMap;
import java.util.Map;

public class Response {
    private String code;
    private String message;
    private Map<String, Object> responseData;
    public Response() { }

    Response(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public Response(Response response, Map<String, Object> responseData) {
        this.code = response.getCode();
        this.message = response.getMessage();
        this.responseData = responseData;
    }



    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public Map<String, Object> getResponseData() {
        return responseData;
    }
    public void setResponseData(Map<String, Object> responseData) {
        this.responseData = responseData;
    }
    public void setResponse(WebDnaResponse response) {
        this.code = response.getCode();
        this.message = response.getMessage();
    }


    public void setData(String key, Object obj) {
        Map<String, Object> responseData = new HashMap<>();
        responseData.put(key, obj);
        this.responseData = responseData;
    }
}
