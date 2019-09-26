package com.dm.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dm.project.model.Issues;
import com.dm.project.repositories.IssueRepo;

@RestController
@RequestMapping("/api/v1")
public class IssueController {
	@Autowired
	IssueRepo issueRepo;
	
	@PostMapping(value="/project/{projectId}/issues")
	public ResponseEntity<?> createNote(@RequestBody Issues issues){
		issueRepo.save(issues);
		return new ResponseEntity<Object>(HttpStatus.OK);
	}
	
	@GetMapping(value="/project/{projectId}/issues")
//	public List<Issues> getIssues(){
//		return issueRepo.findAll();
	public List<Issues> getAllIssuesById(@PathVariable (value="projectId") Long projectId ){
		return issueRepo.findByProjectId(projectId);
	}
	
//	@GetMapping(value="project/{projectId}/issues")
//	public String editIssues(@PathVariable("id") long id, Model model) {
//	    Issues issue = issueRepo.findById(id)
//	      .orElseThrow(() -> new IllegalArgumentException("Invalid issue Id:" + id));
//	}
//	@DeleteMapping(value="/issues/{id}")
//	public ResponseEntity<Long> deleteIssue(@PathVariable Long id){
//		issueRepo.deleteIssue(id);
//		
//		return new ResponseEntity<>(id,HttpStatus.OK);
//	}
}
