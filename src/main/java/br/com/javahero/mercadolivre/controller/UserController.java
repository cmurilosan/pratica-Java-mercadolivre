package br.com.javahero.mercadolivre.controller;

import br.com.javahero.mercadolivre.model.User;
import br.com.javahero.mercadolivre.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    private final UserRepository userRepository;

    public UserController (UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/user")
    public String newUserForm() {
        return "user/new";
    }

    @PostMapping("/user")
    public String newUser(String login, String password) {
        User user = new User(login, password);
        this.userRepository.save(user);
        return "user/created";
    }
}
