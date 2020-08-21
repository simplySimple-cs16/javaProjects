package com.kadum.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="posts")
public class Post {
	@Id
	@Column(name="id")
	private int postId;
	@Column(name="title")
	private String title;
	@Column(name="body")
	private String body;
	
    public Post() {}
	public Post(int postId, String title, String body) {

		this.postId = postId;
		this.title = title;
		this.body = body;
	}

	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "Post [postId=" + postId + ", title=" + title + ", body=" + body + "]";
	}

}
