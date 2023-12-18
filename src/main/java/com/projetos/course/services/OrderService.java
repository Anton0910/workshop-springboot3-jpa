package com.projetos.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetos.course.entities.Order;
import com.projetos.course.entities.User;
import com.projetos.course.repositories.OrderRepository;
import com.projetos.course.repositories.UserRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;
	
	public List<Order> findAll(){
		return orderRepository.findAll();
	}
	
	public Order findById(Long id) {
		 Optional<Order> obj = orderRepository.findById(id);
		 return obj.get();
	}
}
