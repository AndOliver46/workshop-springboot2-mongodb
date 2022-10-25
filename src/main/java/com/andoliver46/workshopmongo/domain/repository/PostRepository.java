package com.andoliver46.workshopmongo.domain.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.andoliver46.workshopmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
	
	List<Post> findByTitleContainingIgnoreCase(String text);
	
	@Query("{ title: { $regex: ?0, $options: 'i'}}")//{ campo do objeto(Post) a ser procurado: { $regex: posição do objeto nos parametros do metodo, $options: opções auxiliares}}
	List<Post> findByTitle(String text);
	
}
