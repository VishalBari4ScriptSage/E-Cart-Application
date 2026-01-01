package com.VishalBari4ScriptSage.store.repositories;

import com.VishalBari4ScriptSage.store.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
