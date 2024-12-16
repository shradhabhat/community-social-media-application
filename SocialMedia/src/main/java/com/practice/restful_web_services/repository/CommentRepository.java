package com.practice.restful_web_services.repository;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.practice.restful_web_services.entity.Comment;

@Repository
public interface CommentRepository extends MongoRepository<Comment, String> {
	@Query("{'post.id':?0}")
    List<Comment> findCommentsByPostId(String id);
}