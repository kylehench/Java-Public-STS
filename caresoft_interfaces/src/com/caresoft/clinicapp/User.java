package com.caresoft.clinicapp;

public class User {
	protected Integer id;
    protected int pin;
    
    public int getPin() {
    	return pin;
    }
    public void setPin(int pin) {
    	this.pin = pin;
    }
    public int getId() {
    	return id;
    }
    public void setId(Integer id) {
    	this.id = id;
    }
}