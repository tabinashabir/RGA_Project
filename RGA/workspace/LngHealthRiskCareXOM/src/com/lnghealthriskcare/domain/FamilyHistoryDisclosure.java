package com.lnghealthriskcare.domain;

public class FamilyHistoryDisclosure {
	private String familyHistoryConditionType;
	private int diagnosedRelativeAge;
	private int numberofDiagnosedRelatives;
	private int totalFamilityMembersDiagnosed;
	private boolean familityDeseaseRelatedInvestigation;
	
	public String getFamilyHistoryConditionType() {
		return familyHistoryConditionType;
	}
	public void setFamilyHistoryConditionType(String familyHistoryConditionType) {
		this.familyHistoryConditionType = familyHistoryConditionType;
	}
	public int getDiagnosedRelativeAge() {
		return diagnosedRelativeAge;
	}
	public void setDiagnosedRelativeAge(int diagnosedRelativeAge) {
		this.diagnosedRelativeAge = diagnosedRelativeAge;
	}
	public int getNumberofDiagnosedRelatives() {
		return numberofDiagnosedRelatives;
	}
	public void setNumberofDiagnosedRelatives(int numberofDiagnosedRelatives) {
		this.numberofDiagnosedRelatives = numberofDiagnosedRelatives;
	}
	public int getTotalFamilityMembersDiagnosed() {
		return totalFamilityMembersDiagnosed;
	}
	public void setTotalFamilityMembersDiagnosed(int totalFamilityMembersDiagnosed) {
		this.totalFamilityMembersDiagnosed = totalFamilityMembersDiagnosed;
	}
	public boolean isFamilityDeseaseRelatedInvestigation() {
		return familityDeseaseRelatedInvestigation;
	}
	public void setFamilityDeseaseRelatedInvestigation(boolean familityDeseaseRelatedInvestigation) {
		this.familityDeseaseRelatedInvestigation = familityDeseaseRelatedInvestigation;
	}
	
	
}
