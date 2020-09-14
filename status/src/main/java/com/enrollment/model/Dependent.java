package com.enrollment.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

public class Dependent {
	
	  /**
		 * 
		 */
		private static final long serialVersionUID = -2259521799158483685L;
		@Id @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long dependentId;
	    @Column(name="dependent_name",nullable = false)
	    private String dependentName;
	    
	    @Column(name="birthDate",nullable = true)
	    private Date birthDate ;
	   
	    
	    @ManyToOne(cascade=CascadeType.ALL)
	    private List<Enrollee> depenedntsList;


		public Long getDependentId() {
			return dependentId;
		}


		public void setDependentId(Long dependentId) {
			this.dependentId = dependentId;
		}


		public String getDependentName() {
			return dependentName;
		}


		public void setDependentName(String dependentName) {
			this.dependentName = dependentName;
		}


		public Date getBirthDate() {
			return birthDate;
		}


		public void setBirthDate(Date birthDate) {
			this.birthDate = birthDate;
		}


		public List<Enrollee> getDepenedntsList() {
			return depenedntsList;
		}


		public void setDepenedntsList(List<Enrollee> depenedntsList) {
			this.depenedntsList = depenedntsList;
		}
	    
	    
	    
	    

}
