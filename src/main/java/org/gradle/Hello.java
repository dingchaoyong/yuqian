package org.gradle;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "hello")
public class Hello {
    @RequestMapping(value = "say", method = RequestMethod.GET)
    public String sayHello() {
        return "hello";
    }
}
