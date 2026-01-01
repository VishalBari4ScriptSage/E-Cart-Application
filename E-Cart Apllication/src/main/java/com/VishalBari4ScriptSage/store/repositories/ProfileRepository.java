package com.VishalBari4ScriptSage.store.repositories;

import com.VishalBari4ScriptSage.store.entities.Profile;
import org.springframework.data.repository.CrudRepository;

public interface ProfileRepository extends CrudRepository<Profile, Long> {
}