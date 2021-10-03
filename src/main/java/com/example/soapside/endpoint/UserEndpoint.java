package com.example.soapside.endpoint;

import com.example.soapside.service.User;
import com.soap_side.GetUserRequest;//User from client is the USer XML
import com.soap_side.GetUserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import com.example.soapside.service.UserService;


@Endpoint
public class UserEndpoint {
    @Autowired
    private final UserService userService;

    public UserEndpoint(UserService userService) {
        this.userService = userService;
    }
    @PayloadRoot(namespace = "http://soap-side.com",
            localPart = "getUserRequest")
    @ResponsePayload
    public GetUserResponse getUserRequest(@RequestPayload GetUserRequest request){
        GetUserResponse response = new GetUserResponse();
        User u = userService.getUser(request.getEmpId());
        com.soap_side.User us = new com.soap_side.User();
        us.setName(u.getName());
        us.setEmpId(u.getEmpId());
        us.setSalary(u.getSalary());
        response.setUser(us);

        return  response;
    }

}