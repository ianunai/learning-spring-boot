package io.javabrains.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Each controller class has an annotation that lets Spring know what its purpose is.
 * For example, the HelloController is a REST controller.
 */

@RestController
public class HelloController {

    /**
     * Each method that handles a request takes in the @RequestMapping annotation
     * The parameter passed is the path to the request that invokes the method.
     * By default, @RequestMapping maps to a GET request. For other requests, it has to
     * be explicitly stated.
     */

    @RequestMapping("/hello")
    public String sayHello() {
        return "Hello!";
    }

}
