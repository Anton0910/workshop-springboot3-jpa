package com.projetos.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetos.course.entities.User;

//Nao precisa de registrar por ja extende um component registrado
//Classe que todos os metodos do jpa
public interface UserRepository extends JpaRepository<User, Long> {

}
