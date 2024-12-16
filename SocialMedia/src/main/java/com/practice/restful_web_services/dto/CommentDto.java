package com.practice.restful_web_services.dto;

import java.time.LocalDateTime;

public class CommentDto {
	    private String id;
	    private String content;
	    private LocalDateTime createdDate;
	    private String userId;
	    private String postId;
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
		public String getUserId() {
			return userId;
		}
		public void setUserId(String userId) {
			this.userId = userId;
		}
		public String getPostId() {
			return postId;
		}
		public void setPostId(String postId) {
			this.postId = postId;
		}

	
	    
}
