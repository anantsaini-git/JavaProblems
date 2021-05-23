package com.practise.java8.interfaces;

public class TestInterface implements Bank, Loan {

	public static void main(String[] args) {
		Bank b = new TestInterface();
		System.out.println(b.getBankName());
		System.out.println(Bank.getLoanAmount(10000, "home"));
	}

	// if we don't override then we will get compile time exception
	// because both Interface have same default method
	@Override
	public String getBankName() {
		// TODO Auto-generated method stub
		return Bank.super.getBankName();
	}
}