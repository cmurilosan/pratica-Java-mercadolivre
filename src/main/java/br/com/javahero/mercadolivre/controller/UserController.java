package br.com.javahero.mercadolivre.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @GetMapping("/user")
    public String newUserForm() {
        return "user/new";
    }

    @PostMapping("/user")
    public void newUser(String login, String password) {
        System.out.println(login);
        System.out.println(password);
    }
}
