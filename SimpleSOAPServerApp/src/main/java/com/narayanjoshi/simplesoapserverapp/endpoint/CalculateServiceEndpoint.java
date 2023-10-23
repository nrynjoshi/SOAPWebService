package com.narayanjoshi.simplesoapserverapp.endpoint;

import com.narayanjoshi.simplesoapserverapp.gs_ws.*;
import com.narayanjoshi.simplesoapserverapp.service.CalculateServiceImpl;
import com.narayanjoshi.simplesoapserverapp.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint("calc")
@Component
public class CalculateServiceEndpoint {

    private static final String NAMESPACE_URI = "com.narayanjoshi.simplesoapserverapp.gs_ws";

    @Autowired
    private CalculateServiceImpl calculateService;

    public CalculateServiceEndpoint(CalculateServiceImpl calculateService) {
        this.calculateService = calculateService;
    }

    @PayloadRoot(namespace = NAMESPACE_URI,
    	    localPart = "AddRequest")
    	    @ResponsePayload
    public ResponseResult add(@RequestPayload AddRequest addRequest) {
        RequestOperand requestOperand = addRequest.getItem();
        double result = requestOperand.getValue1()+ requestOperand.getValue2();
        ResponseResult responseResult = new ResponseResult();
        responseResult.setResult(result);
        return responseResult;
    }

    @PayloadRoot(namespace = NAMESPACE_URI,
            localPart = "SubtractRequest")
    @ResponsePayload
    public ResponseResult subtract(@RequestPayload SubtractRequest subtractRequest) {
        RequestOperand requestOperand = subtractRequest.getItem();
        double result = requestOperand.getValue1()- requestOperand.getValue2();
        ResponseResult responseResult = new ResponseResult();
        responseResult.setResult(result);
        return responseResult;
    }

    @PayloadRoot(namespace = NAMESPACE_URI,
            localPart = "DivideRequest")
    @ResponsePayload
    public ResponseResult divide(@RequestPayload DivideRequest divideRequest) {
        RequestOperand requestOperand = divideRequest.getItem();
        double result = requestOperand.getValue1()/ requestOperand.getValue2();
        ResponseResult responseResult = new ResponseResult();
        responseResult.setResult(result);
        return responseResult;
    }

    @PayloadRoot(namespace = NAMESPACE_URI,
            localPart = "MultipleRequest")
    @ResponsePayload
    public ResponseResult multiple(@RequestPayload MultipleRequest multipleRequest) {
        RequestOperand requestOperand = multipleRequest.getItem();
        double result = requestOperand.getValue1() * requestOperand.getValue2();
        ResponseResult responseResult = new ResponseResult();
        responseResult.setResult(result);
        return responseResult;
    }

}
