package com.lnghealthriskcare.model;

import com.lnghealthriskcare.process.LngHealthRiskCareIntermediateResult;
import com.lnghealthriskcare.process.LngHealthRiskCareRequest;
import com.lnghealthriskcare.process.LngHealthRiskCareResponse;

public class LngHealthRiskCareModel {
	private LngHealthRiskCareRequest lngHealthRiskCareRequest;
	private LngHealthRiskCareResponse lngHealthRiskCareResponse;
	private LngHealthRiskCareIntermediateResult lngHealthRiskCareIntermediateResult;
	
	public LngHealthRiskCareRequest getLngHealthRiskCareRequest() {
		return lngHealthRiskCareRequest;
	}
	public void setLngHealthRiskCareRequest(LngHealthRiskCareRequest lngHealthRiskCareRequest) {
		this.lngHealthRiskCareRequest = lngHealthRiskCareRequest;
	}
	public LngHealthRiskCareResponse getLngHealthRiskCareResponse() {
		return lngHealthRiskCareResponse;
	}
	public void setLngHealthRiskCareResponse(LngHealthRiskCareResponse lngHealthRiskCareResponse) {
		this.lngHealthRiskCareResponse = lngHealthRiskCareResponse;
	}
	public LngHealthRiskCareIntermediateResult getLngHealthRiskCareIntermediateResult() {
		return lngHealthRiskCareIntermediateResult;
	}
	public void setLngHealthRiskCareIntermediateResult(
			LngHealthRiskCareIntermediateResult lngHealthRiskCareIntermediateResult) {
		this.lngHealthRiskCareIntermediateResult = lngHealthRiskCareIntermediateResult;
	}
	
}
