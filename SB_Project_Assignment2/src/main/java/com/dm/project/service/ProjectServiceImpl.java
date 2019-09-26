package com.dm.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dm.project.model.Project;
import com.dm.project.repositories.ProjectRepo;

@Service
public abstract class ProjectServiceImpl implements ProjectService {
	@Autowired
	ProjectRepo projectRepo;
	
//	@Override
//	public void saveProject(Project project) {
//		projectRepo.save(project);
//	}
	
	@Override 
	public List<Project> getAllProject(){
		return projectRepo.findAll();
	}
	
	@Override 
	public boolean deleteProject(Long id) {
		projectRepo.deleteById(id);
		return true;
	}
}
