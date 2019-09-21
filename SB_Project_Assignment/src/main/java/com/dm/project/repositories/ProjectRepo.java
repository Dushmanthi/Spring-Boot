package com.dm.project.repositories;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dm.project.model.Project;

@Repository
public interface ProjectRepo  extends JpaRepository<Project, Long> {

	/*public void save(Project project) {
		// TODO Auto-generated method stub
		
	}

	public List<Project> findAll() {
		// TODO Auto-generated method stub
		return null;
	}*/
	
	

}
