package com.dm.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dm.project.model.Project;
import com.dm.project.repositories.ProjectRepo;

@RestController
@RequestMapping("/api/v1")
public class ProjectController {
	@Autowired
	 ProjectRepo projectRepo;
	
	
	@PostMapping(value = "/project")
	public ResponseEntity<?> createNote(@RequestBody Project project) {
		projectRepo.save(project);
		return new ResponseEntity<Object>(HttpStatus.OK);
	}
	@GetMapping("/project")
	  public List<Project> getProject() {
		return projectRepo.findAll();

	}
	
//	@DeleteMapping("/api/v1/project/{id}")
//	public ResponseEntity<Long> deleteProject(@PathVariable Long id){
//		projectRepo.deleteProject(id);
//		
//		return new ResponseEntity<>(id,HttpStatus.OK);
//	}
	
	
}
