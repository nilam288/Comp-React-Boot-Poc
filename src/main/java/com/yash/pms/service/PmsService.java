package com.yash.pms.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yash.pms.model.Project;

public interface PmsService extends JpaRepository<Project, Integer>{

}
