package br.com.javahero.mercadolivre.dto;

import br.com.javahero.mercadolivre.model.User;

public class UserForm {

    private String login;
    private String password;

    public User toUser(){
        User user = new User(login, password);

    }

}
