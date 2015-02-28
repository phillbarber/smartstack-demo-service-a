package com.github.phillbarber.gradledockersampleapp;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/helloworld")
public class HelloWorldResource {


    private String messageToTheWorld;

    public HelloWorldResource(String messageToTheWorld) {
        this.messageToTheWorld = messageToTheWorld;
    }

    @GET
    public String getMessageToTheWorld() {
        return messageToTheWorld;
    }
}
