package com.exist;

import io.micronaut.http.annotation.*;

@Controller("/discover")
public class DiscoverController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}