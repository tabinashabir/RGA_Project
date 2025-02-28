package com.lnghealthriskcare.domain;

import java.util.List;

public class Application {
	private List<Applicant> applicants;
	private List<AvocationDisclosure> avocationDisclosures;
	private List<FamilyHistoryDisclosure> familyHistoryDisclosures;
	private List<HabitDisclosure> habitDisclosures;
	private List<MedicalDisclosure> medicalDisclosures;
	private String  productClass = "";
	
	public List<Applicant> getApplicants() {
		return applicants;
	}
	public void setApplicants(List<Applicant> applicants) {
		this.applicants = applicants;
	}
	public List<AvocationDisclosure> getAvocationDisclosures() {
		return avocationDisclosures;
	}
	public void setAvocationDisclosures(List<AvocationDisclosure> avocationDisclosures) {
		this.avocationDisclosures = avocationDisclosures;
	}
	public List<FamilyHistoryDisclosure> getFamilyHistoryDisclosures() {
		return familyHistoryDisclosures;
	}
	public void setFamilyHistoryDisclosures(List<FamilyHistoryDisclosure> familyHistoryDisclosures) {
		this.familyHistoryDisclosures = familyHistoryDisclosures;
	}
	public List<HabitDisclosure> getHabitDisclosures() {
		return habitDisclosures;
	}
	public void setHabitDisclosures(List<HabitDisclosure> habitDisclosures) {
		this.habitDisclosures = habitDisclosures;
	}
	public List<MedicalDisclosure> getMedicalDisclosures() {
		return medicalDisclosures;
	}
	public void setMedicalDisclosures(List<MedicalDisclosure> medicalDisclosures) {
		this.medicalDisclosures = medicalDisclosures;
	}
	public String getProductClass() {
		return productClass;
	}
	public void setProductClass(String productClass) {
		this.productClass = productClass;
	}
	
	
}
