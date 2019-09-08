package com.automobile.twowheeler ;
import com.automobile.Vehicle;
public class Hero extends Vehicle{
	public int getSpeed() {
		int speed=60;
		return speed;
	}
	public void radio() {
		System.out.println("Provide radio");
	}

	@Override
	public String getModelName() {
		 String ModelNo="hero001";
		 return ModelNo;
	}

	@Override
	public String getRegistrationNumber() {
		 String RegNo="GJ3AP6064";
		 return RegNo;
	}

	@Override
	public String getOwnerName() {
		 String ownername="Shyam";
		 return ownername;
	}
}
