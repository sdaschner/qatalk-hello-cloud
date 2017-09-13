package com.sebastian_daschner.hello_cloud;

import javax.inject.Inject;

public class Greetings {

    @Inject
    GreetingProcessor greetingProcessor;

    public String getGreeting() {
        return "Hello";
    }

    public String getGreeting(String duke) {
        return greetingProcessor.processGreeting(duke);
    }

}
