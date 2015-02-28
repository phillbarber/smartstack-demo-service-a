package com.github.phillbarber.gradledockersampleapp;

import io.dropwizard.Configuration;

public class AppConfig extends Configuration {


    public String messageToTheWorld;

    public String getMessageToTheWorld() {
        return messageToTheWorld;
    }
}
