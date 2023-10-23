package com.narayanjoshi.simplesoapserverapp.endpoint;

import com.narayanjoshi.simplesoapserverapp.gs_ws.RequestCredential;
import com.narayanjoshi.simplesoapserverapp.gs_ws.ResponseProfile;
import com.narayanjoshi.simplesoapserverapp.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;


@Endpoint("user")
@Component
public class UserServiceEndpoint {

    private static final String NAMESPACE_URI = "com.narayanjoshi.simplesoapserverapp.gs_ws";
    @Autowired
    private UserServiceImpl userService;

    public UserServiceEndpoint(UserServiceImpl userService) {
        this.userService = userService;
    }



    @PayloadRoot(namespace = NAMESPACE_URI,
    	    localPart = "authenticateRequest")
    	    @ResponsePayload
    public void authenticate(@RequestPayload RequestCredential requestCredential) {

        return;
    }

    @PayloadRoot(namespace = NAMESPACE_URI,
            localPart = "registerRequest")
    @ResponsePayload
    public void register(@RequestPayload RequestCredential requestCredential) {

        return;
    }

    @PayloadRoot(namespace = NAMESPACE_URI,
            localPart = "whoamiRequest")
    @ResponsePayload
    public ResponseProfile whoami() {

        return null;
    }

    @PayloadRoot(namespace = NAMESPACE_URI,
            localPart = "updateProfileRequest")
    @ResponsePayload
    public void updateProfile(@RequestPayload ResponseProfile responseProfile) {

    }

}