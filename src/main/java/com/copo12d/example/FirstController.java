package com.copo12d.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class FirstController {
    private final List<OrderDTO> orders = new ArrayList<>();

    @GetMapping
    public String sayHello() {
        return "Hello World";

    }
    @GetMapping("/products")
    public List<OrderDTO> getProductName() {
        return orders;
    }
   @PostMapping("/post")
    public String Post(@RequestBody Map<String, Object> message) {
        return "Request accepted and message is: " + message.get("message");
   }
    @PostMapping("/post-order")
    public String order(@RequestBody OrderDTO order) {
        orders.add(order);
        return "Request accepted and order is: " + order.getCustomerName();
    }
    @PostMapping("/post-order-record")
    public String record(@RequestBody OrderRecord order) {
        return "Request accepted and order is: " + order.toString();
    }
}
