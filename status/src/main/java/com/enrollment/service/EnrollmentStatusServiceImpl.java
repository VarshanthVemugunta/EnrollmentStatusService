package com.enrollment.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.enrollment.dao.EnrollmentStatusDao;
import com.enrollment.model.Dependent;
import com.enrollment.model.Enrollee;

public class EnrollmentStatusServiceImpl implements EnrollmentStatusService{
	
	@Autowired
	private EnrollmentStatusDao enrollmentStatusDao;

	public void addEnrollee(Enrollee enrollee) {
		enrollmentStatusDao.save(enrollee);
	}

	public void modifyExistingEnrollee(Enrollee enrollee) {
		enrollmentStatusDao.save(enrollee);
	}

	public void removeEnrollee(Enrollee enrollee) {
		enrollmentStatusDao.delete(enrollee);
	}

	public void addDependentToEnrollee(Dependent dependent) {
		enrollmentStatusDao.addDependentToEnrollee(dependent);
	}

	public void removeDependentFromEnrollment(Dependent dependent) {
		//enrollmentStatusDao.removeDependentFromEnrollment(dependent);
	}

	public void modifyExistingDependent(Dependent dependent) {
		enrollmentStatusDao.modifyExistingDependent(dependent);
		
	}

}
