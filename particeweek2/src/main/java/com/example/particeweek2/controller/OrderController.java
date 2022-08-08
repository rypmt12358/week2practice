package com.example.particeweek2.controller;

import com.example.particeweek2.model.Order;
import com.example.particeweek2.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    OrderService orderService;

    @GetMapping()
    public List<Order> getAllOrders() {
        List<Order> getedAllOrders = this.orderService.getAllOrders();
        return getedAllOrders;
    }

    @GetMapping("/{seq}")
    public Order getOrder(@PathVariable int seq) {
        Order getedOrder = this.orderService.getOrder(seq);
        return getedOrder;
    }

    @PostMapping()
    public Order creatOrder(@RequestBody Order order) {
        Order createdOrder = this.orderService.creatOrder(order);
        return createdOrder;
    }

    @PutMapping("/{seq}")
    public Order updateOrder(@PathVariable int seq, @RequestBody Order order) {
        Order updateOrder = this.orderService.updateOrder(seq, order);
        return updateOrder;
    }

    @DeleteMapping("/{seq}")
    public Order deleteOrder(@PathVariable int seq) {
        Order deleteOrder = this.orderService.deleteOrder(seq);
        return deleteOrder;
    }


}
