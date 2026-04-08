package com.example.course.resources;

import com.example.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//esse e um controlador REST de responde no caminho users
@RestController
@RequestMapping(value = "/users")
public class UserResources {

    @GetMapping//para indicar que esse metodo responde a uma requisição do tipo GET do HTTP
    //o tipo da resposta vai ser a classe user
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "Maria", "maria@gmail.com", "999999999", "12345");
        return ResponseEntity.ok().body(u);
    }
}
