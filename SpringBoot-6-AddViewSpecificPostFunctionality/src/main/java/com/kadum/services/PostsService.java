package com.kadum.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.kadum.entity.Post;

@Service
public class PostsService {
	List<Post> posts = new ArrayList<>();

	public PostsService() {
		posts.add(new Post(1, "DataType", "Sample text"));
		posts.add(new Post(2, "Classes", "Sample text"));
		posts.add(new Post(3, "Object", "Sample text"));
		posts.add(new Post(4, "Access specifiers", "Sample text"));
		posts.add(new Post(5, "OOPS overview", "Sample text"));
	}
	public List<Post> getPosts(){
		return posts;
	}
	public Post getPost(int id) {
		for(Post post: posts) {
			if(post.getPostId() == id) {
				return post;
			}
		}
		return null;
	}

}
