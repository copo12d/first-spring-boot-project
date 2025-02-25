package com.copo12d.example;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
public class FirstController {

    //GET METHODS
    @GetMapping("/")
    public String sayHello() {
        return "Hello World";
    }
    //POST METHODS
   @PostMapping("/post")
    public String Post(@RequestBody Map<String, Object> message) {
        return "Request accepted and message is: " + message.get("message");
   }
}
