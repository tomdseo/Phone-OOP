package com.phone;

public class Galaxy extends Phone implements Ringable {
	public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
	}
	
	@Override
	public String ring() {
		String str = String.format("%s from %s sounds %s", getPhoneBrand(), super.getCarrier(), super.getRingTone());
		return str;
	}
	
	@Override
	public String unlock() {
		String str = String.format("%s from %s is %s", getPhoneBrand(), super.getCarrier(), "unlocking via finger print");
		return str;
		
	}
	
	@Override
	public void displayInfo() {
		String str = String.format("%s %s from %s", getPhoneBrand(), super.getVersionNumber(), super.getCarrier());
		System.out.println(str);
	}
	
	private String getPhoneBrand() {
		return "Galaxy";
	}

}
