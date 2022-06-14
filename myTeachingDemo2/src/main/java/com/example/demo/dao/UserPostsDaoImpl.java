package com.example.demo.dao;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.vo.UserPosts;

public interface UserPostsDaoImpl extends JpaRepository<UserPosts, UUID> {

}
