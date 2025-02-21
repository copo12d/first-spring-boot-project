package com.copo12d.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class FirstController {


    @GetMapping
    public String sayHello() {
        return "Hello World";

    }
   @PostMapping("/post")
    public String Post(@RequestBody Map<String, Object> message) {
        return "Request accepted and message is: " + message.get("message");
   }
    @PostMapping("/post-order")
    public String order(@RequestBody OrderDTO order) {
        return "Request accepted and order is: " + order.toString();
    }
}
