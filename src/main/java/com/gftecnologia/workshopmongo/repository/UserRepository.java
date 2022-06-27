package com.gftecnologia.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.gftecnologia.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
