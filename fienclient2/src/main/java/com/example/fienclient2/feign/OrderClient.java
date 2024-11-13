package com.example.fienclient2.feign;

import com.example.fienclient2.domain.Orders;
import org.hibernate.query.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "fienclient", url = "http://localhost:8081/api/orders")
public interface OrderClient {

    @GetMapping
    List<Orders> getOrders();

    @PostMapping
    Orders createOrder(@RequestBody Orders order);
}
