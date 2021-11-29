package pl.edu.pbs.it.service;

import org.springframework.stereotype.Service;
import pl.edu.pbs.it.model.User;

import java.time.LocalDateTime;

@Service
public class UserService {
    public User registerUser(String login, String password){
        return new User(login, password, LocalDateTime.now(), false);
    }
}
