package com.example.fienclient2.service;

import com.example.fienclient2.domain.Orders;
import com.example.fienclient2.feign.OrderClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final OrderClient orderClient;

    public List<Orders> getOrders() {
        return orderClient.getOrders();
    }

    public Orders createOrder(Orders order) {
        return orderClient.createOrder(order);
    }
}
