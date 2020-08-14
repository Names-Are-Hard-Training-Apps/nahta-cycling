//This is if the user wants to import a local file. We start with the Garmin tcx format.

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@Component
public class MyRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        // this obviously needs to not be a local folder eventually
        // this is just a test to see if Camel works at all with the current import (no idea what I am doing)
        from("file:/Users/dougwhitfield/Downloads/Personal?recursive=true&include=*.tcx").to("file:/Users/dougwhitfield/Downloads?recursive=true&include=*.tcx");
    }
}