package br.com.javahero.mercadolivre.dto;

import br.com.javahero.mercadolivre.model.User;
import br.com.javahero.mercadolivre.security.PasswordEncoder;

import javax.validation.constraints.*;

public class UserForm {

    @NotBlank
    @Email
    private String login;

    @NotBlank
    @Size(min = 6)
    private String password;

    public User toEntity() {
        return new User(login, password);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = PasswordEncoder.encode(password);
    }
}
