package com.github.phillbarber.gradledockersampleapp;

import com.sun.jersey.api.client.Client;
import io.dropwizard.testing.junit.DropwizardAppRule;
import org.hamcrest.CoreMatchers;
import org.junit.Rule;
import org.junit.Test;

import java.net.URI;
import static org.hamcrest.MatcherAssert.assertThat;


public class HelloWorldAcceptanceTest {


    @Rule
    public final DropwizardAppRule<AppConfig> appRule = new DropwizardAppRule<AppConfig>(DummyApplication.class, ResourceFileUtils.getFileFromClassPath("config.yml").getAbsolutePath());


    @Test
    public void whenHelloWorldResourceCalled_thenMessageReturned()throws Exception{
        Client client = Client.create();
        assertThat(client.resource(getURI()).get(String.class), CoreMatchers.is("Hello to you!"));
    }

    private URI getURI() throws Exception {
        return new URI("http://localhost:" + appRule.getLocalPort() + "/helloworld");
    }
}
