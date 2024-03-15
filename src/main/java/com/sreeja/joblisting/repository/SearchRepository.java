package com.sreeja.joblisting.repository;

import java.util.List;

import com.sreeja.joblisting.Model.Post;

public interface SearchRepository {

	List<Post> searchByData(String text);
	

}
