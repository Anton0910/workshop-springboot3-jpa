package com.projetos.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetos.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	
	//ResponseEntity retorna resposa de requisições web
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L,"Antonio", "antonio@gmail", "1234", "1661");
		return ResponseEntity.ok().body(u); //da um ok para o retorno e retorna o corpo da resposta
		
	}
	
}
