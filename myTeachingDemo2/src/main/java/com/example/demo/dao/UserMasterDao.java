package com.example.demo.dao;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.example.demo.vo.UserMasterVo;

@Component
public interface UserMasterDao  extends JpaRepository<UserMasterVo, UUID> {

}
