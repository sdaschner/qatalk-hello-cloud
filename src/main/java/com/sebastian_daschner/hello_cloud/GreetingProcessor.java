package com.sebastian_daschner.hello_cloud;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

public class GreetingProcessor {

    private Client client;
    private WebTarget target;

    @PostConstruct
    private void initClient() {
        client = ClientBuilder.newClient();
        target = client.target("http://greeting-processor:8080/greeting-processor/resources/greetings");
    }

    @FailureToNull
    public String processGreeting(String duke) {
        return target.path(duke).request().get(String.class);
    }

    @PreDestroy
    public void closeClient() {
        client.close();
    }

}
