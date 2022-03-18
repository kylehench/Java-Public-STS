package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class AdminUser extends User implements HIPAACompliantUser, HIPAACompliantAdmin {
	private String role;
    private ArrayList<String> securityIncidents = new ArrayList<String>();
    
    // TO DO: Implement a constructor that takes an ID and a role
    public AdminUser(Integer ID, String role) {
    	this.setId(ID);
    	this.role = role;
    }
    // TO DO: Implement HIPAACompliantUser!
    // TO DO: Implement HIPAACompliantAdmin!
    

    public void newIncident(String notes) {
        String report = String.format(
            "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
            new Date(), this.id, notes
        );
        securityIncidents.add(report);
    }
    public void authIncident() {
        String report = String.format(
            "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", 
            new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
        );
        securityIncidents.add(report);
    }
    
    public boolean assignPin(int pin) {
    	if (Integer.toString(pin).length()==6) {
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
    		this.authIncident();
    		
    		return false;
    	}
    }
    public ArrayList<String> reportSecurityIncidents() {
    	return this.securityIncidents;
    }
}