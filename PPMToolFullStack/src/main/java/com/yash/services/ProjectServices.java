package com.yash.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.domain.Project;
import com.yash.repository.ProjectRepository;

@Service
public class ProjectServices {

	@Autowired
	private ProjectRepository projectRepository;

	public Project saveOrUpdateProject(Project project) {
		return projectRepository.save(project);
	}

	public List<Project> getProjectList() {

		return (List<Project>) projectRepository.findAll();
	}

	public Optional<Project> findById(Long id) {
		// TODO Auto-generated method stub
		return projectRepository.findById(id);
	}

}
