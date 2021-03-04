package br.com.javahero.mercadolivre.dto;

import br.com.javahero.mercadolivre.model.User;

import javax.validation.constraints.*;

public class UserForm {

    @NotBlank
    @Email
    private String login;

    @NotBlank
    @Min(6)
    private String password;

    public User toEntity(){
        return new User(login, password);
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}
