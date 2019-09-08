package com.automobile.fourwheeler;
import com.automobile.*;
public class Ford extends Vehicle{
	public int speed() {
		int speed=100;
		return speed;
	}
	public int tempControl() {
		int tempControl=1;
		return tempControl;
	}
	@Override
	public String getModelName() {
		 String ModelNo="ford001";
		 return ModelNo;
	}

	@Override
	public String getRegistrationNumber() {
		 String RegNo="GJ7AP6064";
		 return RegNo;
	}

	@Override
	public String getOwnerName() {
		 String ownername="Shyam";
		 return ownername;
	}
}
