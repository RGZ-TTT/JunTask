package org.rgz_ttt.juntask.repository;

import org.rgz_ttt.juntask.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {
    List<User> findByUsername(String username);
}
