package com.projetos.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetos.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
