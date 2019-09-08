package com.automobile.fourwheeler;

import com.automobile.Vehicle;


public class MainClass {

	public static void main(String[] args) {
			Logan l=new Logan();
			Ford f=new Ford();
			Vehicle vl=new Logan();
			Vehicle vf=new Ford();
			System.out.println("LOGAN DETAIL");
			System.out.println("Model No : "+vl.getModelName());
			System.out.println("Registration No : "+vl.getRegistrationNumber());
			System.out.println("Owne Name : "+vl.getOwnerName());
			System.out.println("Speed : "+l.speed());
			if(l.gps()==1) {
				System.out.println("Provide GPS");
			}else {
				System.out.println("Not Provide GPS");
			}
			System.out.println();
			System.out.println("FORD DETAIL");
			System.out.println("Model No : "+vf.getModelName());
			System.out.println("Registration No : "+vf.getRegistrationNumber());
			System.out.println("Owne Name : "+vf.getOwnerName());
			System.out.println("Speed : "+f.speed());
			if(f.tempControl()==1) {
				System.out.println("Provide Auto Temp. Control");
			}else {
				System.out.println("Not Provide Auto Temp. Control");
			}
	}

}
