package com.enrollment.service;

import com.enrollment.model.Dependent;
import com.enrollment.model.Enrollee;

public interface EnrollmentStatusService {

	public void addEnrollee(Enrollee enrollee);

	public void modifyExistingEnrollee(Enrollee enrollee);

	public void removeEnrollee(Enrollee enrolleeId);

	public void addDependentToEnrollee(Dependent dependent);

	public void removeDependentFromEnrollment(Dependent dependent);

	public void modifyExistingDependent(Dependent dependent);

}
