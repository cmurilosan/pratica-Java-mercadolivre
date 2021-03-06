package br.com.javahero.mercadolivre.repository;

import br.com.javahero.mercadolivre.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    boolean existsByEmail(String login);
}
