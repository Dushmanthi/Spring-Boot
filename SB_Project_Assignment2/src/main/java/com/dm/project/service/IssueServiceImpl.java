package com.dm.project.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dm.project.model.Issues;
import com.dm.project.model.Project;
import com.dm.project.repositories.IssueRepo;
import com.dm.project.repositories.ProjectRepo;

@Service
public abstract class IssueServiceImpl implements IssueService  {
	@Autowired
	IssueRepo issueRepo;
	
	@Autowired
	ProjectRepo projectRepo;
	
	@Override
	@Transactional
	public void saveProject(Project project) {
		projectRepo.save(project);
	} 
	
	@Override
	@Transactional
	public List<Project> getProject(){
		return projectRepo.findAll();
	} 
	
	@Override
	@Transactional
	public Issues saveIssue(Issues issues) {
		System.out.println("service");
		return issueRepo.save(issues);
	}
	
}
