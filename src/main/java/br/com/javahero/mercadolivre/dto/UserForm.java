package br.com.javahero.mercadolivre.dto;

import br.com.javahero.mercadolivre.model.User;
import br.com.javahero.mercadolivre.security.PasswordEncoder;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserForm {

    @NotBlank
    @Email
    private String login;

    @NotBlank
    @Size(min = 6)
    private String password;

    public User toEntity() {
        return new User(login, PasswordEncoder.encode(password));
    }

    public String getLogin() {
        return login;
    }
    public String getPassword() { return password; }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
