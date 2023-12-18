package com.projetos.course.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetos.course.entities.Order;
import com.projetos.course.services.OrderService;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {
	@Autowired
	private OrderService service;
	
	//ResponseEntity retorna resposa de requisições web
	//Classe que recebe todas as requisições do usuario
	@GetMapping
	public ResponseEntity<List<Order>> findAll(){
		List <Order> list = service.findAll();
		return ResponseEntity.ok().body(list); //da um ok para o retorno e retorna o corpo da resposta
		
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> GetOrder(@PathVariable Long id){
		Order obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
