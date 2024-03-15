package com.sreeja.joblisting.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sreeja.joblisting.Model.Post;

public interface PostRepository extends MongoRepository<Post,String> {

}
