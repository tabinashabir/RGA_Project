package com.lnghealthriskcare.domain;

public class Applicant {
    private int age = 0;
    private String gender = "";
    private boolean identicalTwin = false;
    private String diagnosedConditions = "";
    private boolean relatedSymptomsPresent = false;
    
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDiagnosedConditions() {
		return diagnosedConditions;
	}
	public void setDiagnosedConditions(String diagnosedConditions) {
		this.diagnosedConditions = diagnosedConditions;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public boolean isIdenticalTwin() {
		return identicalTwin;
	}
	public void setIdenticalTwin(boolean identicalTwin) {
		this.identicalTwin = identicalTwin;
	}
	public boolean isRelatedSymptomsPresent() {
		return relatedSymptomsPresent;
	}
	public void setRelatedSymptomsPresent(boolean relatedSymptomsPresent) {
		this.relatedSymptomsPresent = relatedSymptomsPresent;
	}
    
}
