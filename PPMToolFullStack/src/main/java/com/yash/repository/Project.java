package com.yash.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Project extends CrudRepository<Project, Long> {
	@Override
	Iterable<Project> findAllById(Iterable<Long> iterable);
	

}
