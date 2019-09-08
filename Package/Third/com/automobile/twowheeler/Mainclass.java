package com.automobile.twowheeler;

import com.automobile.Vehicle;

public class Mainclass {
	public static void main(String[]arg) {
		Hero he=new Hero();
		Honda ho=new Honda();
		Vehicle v=new Hero();
		Vehicle vh=new Honda();
		System.out.println("HERO DETAIL");
		System.out.println("Model No : "+v.getModelName());
		System.out.println("Registration No : "+v.getRegistrationNumber());
		System.out.println("Owne Name : "+v.getOwnerName());
		System.out.println("Speed : "+he.getSpeed());
		he.radio();
		System.out.println();
		System.out.println("HONDA DETAIL");
		System.out.println("Model No : "+vh.getModelName());
		System.out.println("Registration No : "+vh.getRegistrationNumber());
		System.out.println("Owne Name : "+vh.getOwnerName());
		System.out.println("Speed : "+ho.getSpeed());
		ho.cdplayer();
	}
}
