package br.com.javahero.mercadolivre.dto;

import br.com.javahero.mercadolivre.model.User;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class UserForm {

    @NotNull
    @NotEmpty
    @Email
    private String login;
    @NotEmpty
    @Min(6)
    private String password;

    public User toEntity(){
        return new User(login, password);
    }

}
