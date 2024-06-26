package br.com.animal.api.integration;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class IntegrationResponse {

	private String label;
	
	public IntegrationResponse(){}
	
	public IntegrationResponse(String label){
		this.label = label;
	}
	
	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
}