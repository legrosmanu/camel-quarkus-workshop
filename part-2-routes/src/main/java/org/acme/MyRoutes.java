package org.acme;

import jakarta.enterprise.context.ApplicationScoped;

import org.apache.camel.builder.RouteBuilder;

@ApplicationScoped
public class MyRoutes extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("timer:myTimer")
                .setBody(constant("Transformed message content"))
                .to("log:myLogCategory");
    }
}
