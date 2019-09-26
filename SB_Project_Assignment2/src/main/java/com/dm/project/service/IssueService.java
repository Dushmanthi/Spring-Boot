package com.dm.project.service;

import java.util.List;

import com.dm.project.model.Issues;
import com.dm.project.model.Project;

public interface IssueService {
	
	public Issues saveIssue(Issues issues);
	
	List<Issues> findByProjectId(Long projectId);
	
	List<Project> getProject();
	void saveProject(Project project);

}
