package com.example.order.domain

import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service

@Service
class OrderService(val orderRepository: OrderRepository) {

    private val log = LoggerFactory.getLogger(this::class.java)

    fun create(customerId: String, status: OrderStatus, value: Double) : Order {
        val order = Order(customerId, status, value)
        log.info("Creating $order")
        orderRepository.save(order)
        log.info("Created $order")
        return order
    }

    fun getAll() = orderRepository.findAll()

}