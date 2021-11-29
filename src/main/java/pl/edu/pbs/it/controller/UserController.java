package pl.edu.pbs.it.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.edu.pbs.it.model.User;
import pl.edu.pbs.it.service.UserService;

import java.time.LocalDateTime;

@RestController // for mapping http requests
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/")        // for mapping get request on address: localhost:8080/
    public String helloSpring(){
        return "Hello Spring";
    }
    @PostMapping("/user")   // for mapping get request on address: localhost:8080/
    public User registerUser(
            @RequestParam("login") String login,
            @RequestParam("password") String password
    ){
        return userService.registerUser(login,password);
    }

}
