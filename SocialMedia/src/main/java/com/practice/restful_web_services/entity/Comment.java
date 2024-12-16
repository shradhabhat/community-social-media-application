package com.practice.restful_web_services.entity;

import java.time.LocalDateTime;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;
@Document(collection="comments")
public class Comment {
		@Id
	    private String id;
	    private String content;
	    private LocalDateTime createdDate;

	    @DBRef
	    private User user;

	    @DBRef
	    private Post post;

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getContent() {
			return content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public LocalDateTime getCreatedDate() {
			return createdDate;
		}

		public void setCreatedDate(LocalDateTime createdDate) {
			this.createdDate = createdDate;
		}

		public User getAuthor() {
			return user;
		}

		public void setAuthor(User author) {
			this.user = author;
		}

		public Post getPost() {
			return post;
		}

		public void setPost(Post post) {
			this.post = post;
		}
	    
}
