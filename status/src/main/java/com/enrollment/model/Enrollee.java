package com.enrollment.model;



import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;


@Entity
@Table(name = "enrollee")
public class Enrollee implements Serializable{
	
	


    /**
	 * 
	 */
	private static final long serialVersionUID = -2259521799158483685L;
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long enrolleeId;
    @Column(name="name",nullable = false)
    private String enrolleeName;
    @Column(name="actvitation_status",nullable = false)
    private boolean activationStatus;
    @Column(name="birthDate",nullable = true)
    private Date birthDate ;
    @Column(name="phoneNumber",nullable = true)
    private long phoneNumber;
    
    @OneToMany(mappedBy="dependent")
    private List<Dependent> depenedntsList;

	public Long getEnrolleeId() {
		return enrolleeId;
	}

	public void setEnrolleeId(Long enrolleeId) {
		this.enrolleeId = enrolleeId;
	}

	public String getEnrolleeName() {
		return enrolleeName;
	}

	public void setEnrolleeName(String enrolleeName) {
		this.enrolleeName = enrolleeName;
	}

	public boolean isActivationStatus() {
		return activationStatus;
	}

	public void setActivationStatus(boolean activationStatus) {
		this.activationStatus = activationStatus;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public List<Dependent> getDepenedntsList() {
		return depenedntsList;
	}

	public void setDepenedntsList(List<Dependent> depenedntsList) {
		this.depenedntsList = depenedntsList;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
    
}

