package com.neoteric.springbootdocker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {
    @GetMapping(value = "/docker")
    public String getDocker(){
        return "Hello from docker";
    }
}
