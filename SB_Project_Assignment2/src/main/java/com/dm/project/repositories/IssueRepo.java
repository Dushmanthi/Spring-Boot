package com.dm.project.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dm.project.model.Issues;

@Repository
public interface IssueRepo extends JpaRepository<Issues,Long> {

	//List<Issues> findByProjectId(Long projectId);


	//void deleteIssue(Long id);

}
