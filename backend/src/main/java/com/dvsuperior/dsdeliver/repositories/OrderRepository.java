package com.dvsuperior.dsdeliver.repositories;


import com.dvsuperior.dsdeliver.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}