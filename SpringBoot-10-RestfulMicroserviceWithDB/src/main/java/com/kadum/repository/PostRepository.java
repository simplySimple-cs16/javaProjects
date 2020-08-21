package com.kadum.repository;

import org.springframework.data.repository.CrudRepository;

import com.kadum.entity.Post;


public interface PostRepository extends CrudRepository<Post, Integer> {
	

}
