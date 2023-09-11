package com.example.backendfinal.Controller;

import com.example.backendfinal.Model.User;

import com.example.backendfinal.repo.Userrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    Userrepo userRepository;

    @PostMapping("/save")
    @CrossOrigin(origins = "http://localhost:4200")
    public boolean saveUser(@RequestBody User user) {
        userRepository.save(user);
        return true;
    }

    @GetMapping("/getall")
    @CrossOrigin(origins = "http://localhost:4200")
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok(userRepository.findAll());
    }

    @GetMapping("/get")
    @CrossOrigin(origins = "http://localhost:4200")
    public Optional<User> getUser(@RequestParam("id") Long id) {

        return userRepository.findById(id);
    }
//    getallvideos
//    getallbookmarksbyid
//
//            bookmar
//
// }
}
