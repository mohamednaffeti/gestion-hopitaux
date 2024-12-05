package com.microservices.userservice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class controller {
    private final UserRepo userRepo;
    public controller(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @GetMapping("/get")
    public String get(){
        return "hello from user ms";
    }




    // Méthode POST pour créer un nouvel utilisateur
    @PostMapping("/add")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        // Enregistrer l'utilisateur dans la base de données
        User savedUser = userRepo.save(user);

        // Retourner une réponse avec l'utilisateur créé
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }
}
