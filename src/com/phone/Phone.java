package com.phone;

public abstract class Phone {
	private String versionNumber;
	private int batteryPercentage;
    private String carrier;
    private String ringTone;
    public Phone(String versionNumber, int batteryPercentage, String carrier, String ringTone){
        this.versionNumber = versionNumber;
        this.batteryPercentage = batteryPercentage;
        this.carrier = carrier;
        this.ringTone = ringTone;
    }
    
    // abstract method. This method will be implemented by the subclasses
    public abstract void displayInfo();
    
    // getters and setters removed for brevity. Please implement them yourself
    public void setVersionNumber(String number) {
    	this.versionNumber = number;
    }
    
    public String getVersionNumber() {
    	return versionNumber;
    }
    
    public void setBatteryPercentage(int percentage) {
    	this.batteryPercentage = percentage;
    }
    
    public int getBatteryPercentage() {
    	return batteryPercentage;
    }
    
    public void setCarrier(String carrier) {
		this.carrier = carrier;
	}
    
	public String getCarrier() {
		return carrier;
	}
	
	public void setRingTone(String ringTone) {
		this.ringTone = ringTone;
	}
	
	public String getRingTone() {
		return ringTone;
	}
}
