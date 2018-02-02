package com.byteshaper.zastr.domain.repository;

import com.byteshaper.zastr.domain.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}
