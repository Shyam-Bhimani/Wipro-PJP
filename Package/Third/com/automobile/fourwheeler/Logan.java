package com.automobile.fourwheeler;
import com.automobile.*;
public class Logan extends Vehicle {
	public int speed(){
		int speed=120;
		return speed;
	}
	public int gps() {
		int gps=1;
		return gps;
	}
	@Override
	public String getModelName() {
		 String ModelNo="logan001";
		 return ModelNo;
	}

	@Override
	public String getRegistrationNumber() {
		 String RegNo="GJ4AP6064";
		 return RegNo;
	}

	@Override
	public String getOwnerName() {
		 String ownername="Shyam";
		 return ownername;
	}

}
