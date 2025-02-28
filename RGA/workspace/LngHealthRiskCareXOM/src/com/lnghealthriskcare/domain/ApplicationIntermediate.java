package com.lnghealthriskcare.domain;

import java.util.ArrayList;
import java.util.List;

public class ApplicationIntermediate {
	private List<AvocationDisclosuresIntermediate> avocationDisclosuresIntermediate = new ArrayList<AvocationDisclosuresIntermediate>();
	private List<FamilyHistoryDisclosuresIntermediate> familyHistoryDisclosuresIntermediate = new ArrayList<FamilyHistoryDisclosuresIntermediate>();
	private List<HabitDisclosuresIntermediate> habitDisclosuresIntermediate = new ArrayList<HabitDisclosuresIntermediate>();
	private List<MedicalDisclosuresIntermediate> medicalDisclosuresIntermediate = new ArrayList<MedicalDisclosuresIntermediate>();
	private String riskTypes = "";
	
	
	public List<AvocationDisclosuresIntermediate> getAvocationDisclosuresIntermediate() {
		return avocationDisclosuresIntermediate;
	}
	public void setAvocationDisclosuresIntermediate(
			List<AvocationDisclosuresIntermediate> avocationDisclosuresIntermediate) {
		this.avocationDisclosuresIntermediate = avocationDisclosuresIntermediate;
	}
	public List<FamilyHistoryDisclosuresIntermediate> getFamilyHistoryDisclosuresIntermediate() {
		return familyHistoryDisclosuresIntermediate;
	}
	public void setFamilyHistoryDisclosuresIntermediate(
			List<FamilyHistoryDisclosuresIntermediate> familyHistoryDisclosuresIntermediate) {
		this.familyHistoryDisclosuresIntermediate = familyHistoryDisclosuresIntermediate;
	}
	public List<HabitDisclosuresIntermediate> getHabitDisclosuresIntermediate() {
		return habitDisclosuresIntermediate;
	}
	public void setHabitDisclosuresIntermediate(List<HabitDisclosuresIntermediate> habitDisclosuresIntermediate) {
		this.habitDisclosuresIntermediate = habitDisclosuresIntermediate;
	}
	public List<MedicalDisclosuresIntermediate> getMedicalDisclosuresIntermediate() {
		return medicalDisclosuresIntermediate;
	}
	public void setMedicalDisclosuresIntermediate(List<MedicalDisclosuresIntermediate> medicalDisclosuresIntermediate) {
		this.medicalDisclosuresIntermediate = medicalDisclosuresIntermediate;
	}
	public String getRiskTypes() {
		return riskTypes;
	}
	public void setRiskTypes(String riskTypes) {
		this.riskTypes = riskTypes;
	}
	
	
	
}
