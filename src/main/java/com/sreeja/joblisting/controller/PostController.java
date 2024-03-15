package com.sreeja.joblisting.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.collect.Lists;
import com.sreeja.joblisting.Model.Post;
import com.sreeja.joblisting.repository.PostRepository;
import com.sreeja.joblisting.repository.SearchRepository;

import springfox.documentation.annotations.ApiIgnore;

@RestController


public class PostController {
	@Autowired
	PostRepository repo;
	@Autowired
	SearchRepository srepo;
	

	@ApiIgnore
	@RequestMapping(value="/")
	public void redirect(HttpServletResponse response) throws IOException {
		response.sendRedirect("/swagger-ui.html");
	}
	@GetMapping("/posts")
	public List<Post> getAllPosts(){
		return repo.findAll();

}
	@GetMapping("/posts/{text}")
	public List<Post> search(@PathVariable String text){
		return srepo.searchByData(text);
		
	}
	
	@PostMapping("/post")
	public Post addPost(@RequestBody Post post) {
		return repo.save(post);
		
	}
}
