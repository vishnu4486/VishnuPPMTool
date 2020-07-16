package com.yash.repository;

import org.springframework.data.repository.CrudRepository;

import com.yash.domain.Project;

public interface ProjectRepository extends CrudRepository<Project, Long> {
//	Iterable<ProjectRepository> findAllById(Iterable<Long> iterable);
	
}
