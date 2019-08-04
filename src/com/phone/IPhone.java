package com.phone;

public class IPhone extends Phone implements Ringable {
	public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
	}

	@Override
	public String ring() {
		String str = String.format("%s from %s sounds %s", getPhoneBrand(), super.getCarrier(), super.getRingTone());
		return str;
	}

	@Override
	public String unlock() {
		String str = String.format("%s from %s is %s", getPhoneBrand(), super.getCarrier(), "unlocking via facial recognition");
		return str;
	}

	@Override
	public void displayInfo() {
		String str = String.format("%s %s from %s", getPhoneBrand(), super.getVersionNumber(), super.getCarrier());
		System.out.println(str);
	}
	
	private String getPhoneBrand() {
		return "iPhone";
	}
}
