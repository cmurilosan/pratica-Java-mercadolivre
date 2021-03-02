package br.com.javahero.mercadolivre.model;
import java.time.LocalDateTime;

// Model
public class User {

    private LocalDateTime createdAt;
    private String email;
    private String password;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
        this.createdAt = LocalDateTime.now();
    }

}
