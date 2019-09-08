package com.automobile.twowheeler ;
import com.automobile.Vehicle;
public class Honda extends Vehicle{
	public int getSpeed() {
		int speed=90;
		return speed;
	}
	public void cdplayer() {
		System.out.println("Provide cdplayer");
	}

	@Override
	public String getModelName() {
		 String ModelNo="honda001";
		 return ModelNo;
	}

	@Override
	public String getRegistrationNumber() {
		 String RegNo="GJ6AP6064";
		 return RegNo;
	}

	@Override
	public String getOwnerName() {
		 String ownername="Shyam";
		 return ownername;
	}
}
