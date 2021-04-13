package br.com.javahero.mercadolivre.controller;

import br.com.javahero.mercadolivre.dto.UserForm;
import br.com.javahero.mercadolivre.repository.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

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
    public ModelAndView newUser(@Valid UserForm userForm, BindingResult bindingResult) {

        if(userRepository.existsByEmail(userForm.getLogin())) {
            bindingResult.addError(new FieldError("userForm", "login",
                    "Email duplicado"));
        }
        if(bindingResult.hasErrors()) {
            return new ModelAndView("user/new", HttpStatus.BAD_REQUEST);
        }

        this.userRepository.save(userForm.toEntity());
        return new ModelAndView("user/created");

    }
}
