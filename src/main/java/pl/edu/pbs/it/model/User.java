package pl.edu.pbs.it.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

// model class determines data structure
@Data               // add getters/setters and toString
@AllArgsConstructor // add all args constructor
public class User {
    private String login;
    private String password;
    private LocalDateTime registrationDateTime;
    private boolean status;
}
