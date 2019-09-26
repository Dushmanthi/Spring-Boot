package com.dm.project.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "project")
public class Project implements Serializable  {


		private static final long serialVersionUID = 1L;

		
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Long id;

		private String projectName;

		private String description;
		
		@OneToMany(fetch=FetchType.EAGER,cascade= {CascadeType.ALL})
		private List<Issues> issues;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getProjectName() {
			return projectName;
		}

		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public List<Issues> getIssues() {
			return issues;
		}

		public void setIssues(List<Issues> issues) {
			this.issues = issues;
		}
		
		

		

		
	
}
