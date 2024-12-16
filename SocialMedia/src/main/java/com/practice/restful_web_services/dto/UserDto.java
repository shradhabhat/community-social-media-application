package com.practice.restful_web_services.dto;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.DBRef;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.practice.restful_web_services.entity.Post;
import com.practice.restful_web_services.entity.User;

public class UserDto {

    private String id;
    private String name;
    private String email;
    private String password;
    private LocalDate birthDate;
    private LocalDate joinedDate;
    private String role;
    private List<String> followerIds;
    private List<String> followingIds;
    private List<String> postIds;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	public LocalDate getJoinedDate() {
		return joinedDate;
	}
	public void setJoinedDate(LocalDate joinedDate) {
		this.joinedDate = joinedDate;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public List<String> getFollowerIds() {
		return followerIds;
	}
	public void setFollowerIds(List<String> followerIds) {
		this.followerIds = followerIds;
	}
	public List<String> getFollowingIds() {
		return followingIds;
	}
	public void setFollowingIds(List<String> followingIds) {
		this.followingIds = followingIds;
	}
	public List<String> getPostIds() {
		return postIds;
	}
	public void setPostIds(List<String> postIds) {
		this.postIds = postIds;
	}
    
}
