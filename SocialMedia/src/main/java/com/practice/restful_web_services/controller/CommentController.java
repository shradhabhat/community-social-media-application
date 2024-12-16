package com.practice.restful_web_services.controller;


import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.restful_web_services.dto.CommentDto;
import com.practice.restful_web_services.entity.Comment;
import com.practice.restful_web_services.service.CommentService;


@RestController
@RequestMapping("/comments")
public class CommentController {

	@Autowired
	private CommentService service;
	
	public CommentController(CommentService service) {
		this.service = service;
	}
	//post /
	@PostMapping("/addComment/{postId}")
	public Comment createComment(@RequestBody CommentDto commentDto,@PathVariable("postId") String postId,@RequestHeader("loggedInUser") String Userid) {
		commentDto.setPostId(postId);
		commentDto.setUserId(Userid);
		commentDto.setCreatedDate(LocalDateTime.now());
		return service.save(commentDto);
	}
	// GET /Comments
	@GetMapping("/getbypostid/{postId}")
	public List<Comment> retrieveAllComments(@PathVariable String postId) {
		return service.findPostComments(postId);
	}	
	// GET /Comment
	@GetMapping("/{commentId}")
	public Comment retrieveComment(@PathVariable String commentId) {
		return service.findOne(commentId);
	}
	
	@DeleteMapping("/{commentId}")
	public void deleteComment(@PathVariable String commentId) {
		service.deleteComment(commentId);
	}
	
}
