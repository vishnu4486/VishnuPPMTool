package com.yash.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yash.domain.Project;
import com.yash.services.ProjectServices;

@RestController
@RequestMapping("/api/projects")
public class ProjectController {

	@Autowired
	private ProjectServices projectServices;

	@PutMapping("/{id}")
	public ResponseEntity<Project> updateProject(@PathVariable("id") Long id,@RequestBody Project project){
		project.setId(id);
		Project p =projectServices.saveOrUpdateProject(project);
		return new ResponseEntity<Project>(project,HttpStatus.CREATED);
	}

	@PostMapping("/save")
	public ResponseEntity<Project> addProject(@RequestBody Project project) {
		Project p = projectServices.saveOrUpdateProject(project);
		return new ResponseEntity<Project>(p, HttpStatus.CREATED);
	}

	@GetMapping("/")
	public List<Project> getProjects() {

		return projectServices.getProjectList();
	}
	@GetMapping("/{id}")
	public Project getProject(@PathVariable("id") long id) {
		
		return projectServices.findById(id).orElse(new Project());
		
		
	}
}
