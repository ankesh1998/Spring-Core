package com.spring.test.springcore.dependencyCheck;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

public class Prescription {
	
	@Override
	public String toString() {
		return "Prescription [id=" + id + ", patientName=" + patientName + ", medicines=" + medicines + "]";
	}
	private int id;
	private String patientName;
	private List<String> medicines;
	
	public int getId() {
		return id;
	}
	
	@Required
	public void setId(int id) {
		this.id = id;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public List<String> getMedicines() {
		return medicines;
	}
	public void setMedicines(List<String> medicines) {
		this.medicines = medicines;
	}

}
