package br.com.javahero.mercadolivre.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/user")
    public String newUserForm() {
        return "user/new";
    }

}
