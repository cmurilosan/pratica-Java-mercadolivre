package br.com.javahero.mercadolivre.model;
import java.time.LocalDateTime;

// Model
public class User {

    private LocalDateTime dataCriacao;
    private String email;
    private String senha;

    public User(String email, String senha) {
        this.email = email;
        this.senha = senha;
        this.dataCriacao = LocalDateTime.now();
    }

}
