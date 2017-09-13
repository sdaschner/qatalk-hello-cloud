package com.sebastian_daschner.hello_cloud;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("hello")
public class HelloResource {

    @Inject
    Greetings greetings;

    @GET
    public String hello() {
        return greetings.getGreeting();
    }

    @GET
    @Path("duke")
    public String helloDuke() {
        return greetings.getGreeting("Duke");
    }

}
