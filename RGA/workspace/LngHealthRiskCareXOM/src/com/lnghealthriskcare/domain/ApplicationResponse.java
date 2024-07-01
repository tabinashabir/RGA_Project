package com.lnghealthriskcare.domain;

import java.util.List;

public class ApplicationResponse {
	private List<AvocationDisclosureEvent> avocationDisclosureEvents;
	private List<MedicalDisclosureEvent> medicalDisclosureEvents;
	private String underwtitingSTP;
	
	public List<AvocationDisclosureEvent> getAvocationDisclosureEvents() {
		return avocationDisclosureEvents;
	}
	public void setAvocationDisclosureEvents(List<AvocationDisclosureEvent> avocationDisclosureEvents) {
		this.avocationDisclosureEvents = avocationDisclosureEvents;
	}
	public List<MedicalDisclosureEvent> getMedicalDisclosureEvents() {
		return medicalDisclosureEvents;
	}
	public void setMedicalDisclosureEvents(List<MedicalDisclosureEvent> medicalDisclosureEvents) {
		this.medicalDisclosureEvents = medicalDisclosureEvents;
	}
	public String getUnderwtitingSTP() {
		return underwtitingSTP;
	}
	public void setUnderwtitingSTP(String underwtitingSTP) {
		this.underwtitingSTP = underwtitingSTP;
	}
	
}
