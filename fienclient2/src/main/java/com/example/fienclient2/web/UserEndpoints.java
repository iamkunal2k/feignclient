package com.example.fienclient2.web;


import com.example.fienclient2.domain.Orders;
import com.example.fienclient2.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserEndpoints {

    private final UserService userService;

    @GetMapping("/feinclient2/orders")
    public List<Orders> getOrders() {
        return userService.getOrders();
    }

    @PostMapping("/feinclient2/orders")
    public Orders addOrder(@RequestBody Orders orders) {
        return userService.createOrder(orders);
    }
}
