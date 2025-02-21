package com.copo12d.example;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class FirstController {

    //GET METHODS
    @GetMapping
    public String sayHello() {
        return "Hello World";
    }
    //http://localhost:8080/hello/(What ever ypu want).
    @GetMapping("/hello/{user-name}")
    public String pathVar(@PathVariable("user-name") String username) {
        return "my value: " + username;
    }
    //http://localhost:8080/hello?param_name=param_value&param_name2=param_value
    @GetMapping("/hello2")
    public String paramVar(@RequestParam("user-name") String username, @RequestParam("password") String password) {
        return "my value: " + username + " " + password;
    }

    //POST METHODS
   @PostMapping("/post")
    public String Post(@RequestBody Map<String, Object> message) {
        return "Request accepted and message is: " + message.get("message");
   }

    @PostMapping("/post-order")
    public String order(@RequestBody OrderDTO order) {
        return "Request accepted and order is: " + order.toString();
    }

    @PostMapping("/post-order-record")
    public String record(@RequestBody OrderRecord order) {
        return "Request accepted and order is: " + order.toString();
    }

}
