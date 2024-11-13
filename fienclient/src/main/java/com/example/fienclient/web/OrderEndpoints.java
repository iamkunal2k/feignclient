package com.example.fienclient.web;

import com.example.fienclient.domain.Orders;
import com.example.fienclient.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
@RequiredArgsConstructor
public class OrderEndpoints {

    private final OrderService orderService;

    @PostMapping
    public Orders addOrder(@RequestBody Orders order) {
        return orderService.addOrder(order);
    }

    @GetMapping
    public List<Orders> getOrders() {
        return orderService.getOrders();
    }
}
