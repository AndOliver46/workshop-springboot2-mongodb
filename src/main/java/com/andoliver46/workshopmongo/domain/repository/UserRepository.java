package com.andoliver46.workshopmongo.domain.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.andoliver46.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
