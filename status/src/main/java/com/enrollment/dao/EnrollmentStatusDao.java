package com.enrollment.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.enrollment.model.Dependent;
import com.enrollment.model.Enrollee;

public interface EnrollmentStatusDao extends JpaRepository<Enrollee,Long>{

	void addDependentToEnrollee(Dependent dependent);

	//@Query("")
	//void removeDependentFromEnrollment(Dependent dependent);

	void modifyExistingDependent(Dependent dependent);

}
