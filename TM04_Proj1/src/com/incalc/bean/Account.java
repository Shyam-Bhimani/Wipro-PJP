package com.incalc.bean;

abstract class Account {
	double interestRate;
	double amount;
	
	abstract double calculateInterest();
}
