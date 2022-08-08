package com.example.particeweek2.service;

import com.example.particeweek2.model.Meal;
import com.example.particeweek2.model.Order;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

    private List<Order> orderList = new ArrayList<>();

    public OrderService() {
        List<Meal> mealList1 = new ArrayList<>();
        mealList1.add(new Meal("Hamburger", 100, "good"));
        mealList1.add(new Meal("Sandwitch", 200, "good"));
        List<Meal> mealList2 = new ArrayList<>();
        mealList2.add(new Meal("Hamburger", 100, "good"));
        this.orderList.add(new Order(1, 300, "seq1Waiter", mealList1));
        this.orderList.add(new Order(2, 100, "seq2Waiter", mealList2));
    }

    public List<Order> getAllOrders() {
        return this.orderList;
    }

    public Order getOrder(int seq) {
        for (Order order : this.orderList) {
            if (seq == order.getSeq()) {
                return order;
            }
        }
        return null;
    }

    public Order creatOrder(Order order) {
        this.orderList.add(order);
        return order;
    }

    public Order updateOrder(int seq, Order order) {
        for (Order updatedOrder : this.orderList) {
            if (seq == updatedOrder.getSeq()) {
                updatedOrder.setWaiter(order.getWaiter());
                updatedOrder.setMealList(order.getmealList());
                return updatedOrder;
            }
        }
        return null;
    }

    public Order deleteOrder(int id) {
        for (Order deletedOrder : this.orderList) {
            if (id == deletedOrder.getSeq()) {
                this.orderList.remove(deletedOrder);
                return deletedOrder;
            }
        }
        return null;
    }
}