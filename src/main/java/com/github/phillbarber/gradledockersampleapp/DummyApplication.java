package com.github.phillbarber.gradledockersampleapp;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class DummyApplication extends Application<AppConfig> {


    @Override
    public void initialize(Bootstrap<AppConfig> bootstrap) {  }

    @Override
    public void run(AppConfig appConfig, Environment environment) throws Exception {
        environment.jersey().register(new HelloWorldResource(appConfig.getMessageToTheWorld()));
    }

    public static void main(String[] args) throws Exception{
        new DummyApplication().run(args);
    }
}
