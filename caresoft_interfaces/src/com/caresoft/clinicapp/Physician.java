package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class Physician extends User implements HIPAACompliantUser {
	private ArrayList<String> patientNotes;
	
	public Physician(Integer id) {
		this.setId(id);
	}
	
	public boolean assignPin(int pin) {
		if (Integer.toString(pin).length()==4) {
			this.setPin(pin);
			return true;
		} else {
			return false;
		}
	}
	public boolean accessAuthorized(Integer id) {
		if (this.getId()==id) {
			return true;
		} else {
			return false;
		}
	}
	
    public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }
}