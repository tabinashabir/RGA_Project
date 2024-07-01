package com.lnghealthriskcare.domain;

public class HabitDisclosure {
	private String habitType;
	private boolean everUsedTobaccoProduct;
	private String typeofTobaccoProduct;
	private int lastTimeTobaccoUsed;
	private int tobaccoUsageFrequency;
	
	public String getHabitType() {
		return habitType;
	}
	public void setHabitType(String habitType) {
		this.habitType = habitType;
	}
	public boolean isEverUsedTobaccoProduct() {
		return everUsedTobaccoProduct;
	}
	public void setEverUsedTobaccoProduct(boolean everUsedTobaccoProduct) {
		this.everUsedTobaccoProduct = everUsedTobaccoProduct;
	}
	public String getTypeofTobaccoProduct() {
		return typeofTobaccoProduct;
	}
	public void setTypeofTobaccoProduct(String typeofTobaccoProduct) {
		this.typeofTobaccoProduct = typeofTobaccoProduct;
	}
	public int getLastTimeTobaccoUsed() {
		return lastTimeTobaccoUsed;
	}
	public void setLastTimeTobaccoUsed(int lastTimeTobaccoUsed) {
		this.lastTimeTobaccoUsed = lastTimeTobaccoUsed;
	}
	public int getTobaccoUsageFrequency() {
		return tobaccoUsageFrequency;
	}
	public void setTobaccoUsageFrequency(int tobaccoUsageFrequency) {
		this.tobaccoUsageFrequency = tobaccoUsageFrequency;
	}
}
