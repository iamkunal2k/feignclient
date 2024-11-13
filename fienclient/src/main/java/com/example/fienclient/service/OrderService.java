package com.example.fienclient.service;

import com.example.fienclient.domain.Orders;
import com.example.fienclient.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;

    public Orders addOrder(Orders order) {
        return orderRepository.save(order);
    }

    public List<Orders> getOrders() {
        return orderRepository.findAll();
    }
}
