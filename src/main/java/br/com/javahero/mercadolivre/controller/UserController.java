package br.com.javahero.mercadolivre.controller;

import br.com.javahero.mercadolivre.dto.UserForm;
import br.com.javahero.mercadolivre.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

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
    public String newUser(@Valid UserForm userForm) {
        this.userRepository.save(userForm.toEntity());
        return "user/created";
    }
}
