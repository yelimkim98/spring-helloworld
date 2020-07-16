package wooteco.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String helloWorld() {
        return "helloWorld";
    }

    @RequestMapping("/helloworld")
    public String hello() {
        return "hello";
    }
}
