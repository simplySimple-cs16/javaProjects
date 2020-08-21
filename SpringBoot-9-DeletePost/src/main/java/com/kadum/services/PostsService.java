package com.kadum.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.kadum.entity.Post;

@Service
public class PostsService {
	static List<Post> posts = new ArrayList<>(
			Arrays.asList(
					new Post(1, "DataType", "Sample text"),
					new Post(2, "Classes", "Sample text"),
					new Post(3, "Object", "Sample text"),
					new Post(4, "Access specifiers", "Sample text"),
					new Post(5, "OOPS overview", "Sample text")
			));
   
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
	public void addPost(Post listElement) {
		posts.add(listElement);
		
	}
	public void updatePost(Post updatedPost, int id) {
		for(int i = 0; i <posts.size(); i++) {
			Post tempPost = posts.get(i);
			if(tempPost.getPostId() == id) {
				posts.set(i, updatedPost);
				return;
				
			}
		}	
	}
	
	public void deletePost(int id) {
		for(int i = 0; i <posts.size(); i++) {
			Post tempPost = posts.get(i);
			if(tempPost.getPostId() == id) {
				posts.remove(i);
				return;
				
			}
		}
		
	}

}
