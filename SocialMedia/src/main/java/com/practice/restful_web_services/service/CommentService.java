package com.practice.restful_web_services.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.practice.restful_web_services.dto.CommentDto;
import com.practice.restful_web_services.dto.PostDto;
import com.practice.restful_web_services.entity.Comment;
import com.practice.restful_web_services.entity.Post;

@Service
public interface CommentService {
	public Comment findOne(String id);
	public Comment save(CommentDto commentDto);
	public void deleteComment(String id);
	public List<Comment> findPostComments(String id);
}
