package com.dm.project.service;

import java.util.List;

import com.dm.project.model.Project;

public interface ProjectService {

	//void saveProject(Project project);

	List<Project> getAllProject();

	//void saveProject(Project project);

	boolean deleteProject(Long id);

}
