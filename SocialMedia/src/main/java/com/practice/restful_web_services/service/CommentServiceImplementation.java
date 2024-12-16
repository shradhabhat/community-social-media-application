package com.practice.restful_web_services.service;


import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.practice.restful_web_services.dto.CommentDto;
import com.practice.restful_web_services.dto.PostDto;
import com.practice.restful_web_services.entity.Comment;
import com.practice.restful_web_services.entity.Post;
import com.practice.restful_web_services.entity.User;
import com.practice.restful_web_services.exception.ApplicationException;
import com.practice.restful_web_services.repository.UserRepository;
import com.practice.restful_web_services.repository.CommentRepository;
import com.practice.restful_web_services.repository.PostRepository;
@Component
public class CommentServiceImplementation implements CommentService{
	@Autowired
	public PostRepository postRepository;
	@Autowired
	public UserRepository userRepository;
	@Autowired
	public CommentRepository commentRepository;


	@Override
	public Comment findOne(String id) {
		return commentRepository.findById(id).orElseThrow(()->new ApplicationException("Comment Not Found"));
	}
	@Override
	public Comment save(CommentDto commentDto) {
		Post post= postRepository.findById(commentDto.getPostId()).orElseThrow(()->new ApplicationException("Post Not Found"));
		Comment comment=new Comment();
		comment.setAuthor(post.getUser());
		comment.setPost(post);
		comment.setContent(commentDto.getContent());
		comment.setCreatedDate(commentDto.getCreatedDate());
		commentRepository.save(comment);
		return comment;
	}
	@Override
	public void deleteComment(String id) {
		commentRepository.findById(id).orElseThrow(()->new ApplicationException("Comment Not Found"));
		commentRepository.deleteById(id);
	}

	@Override
	public List<Comment> findPostComments(String id) {
		if(postRepository.findById(id) == null){
			 throw new ApplicationException("User Not Found");
		}
		return commentRepository.findCommentsByPostId(id);
	}
}
