package com.org.client;

import com.org.PersonalLoan;


public class PersonalLoanDemo {

	public static void main(String[] args) {
		
		// final class can be instantiated but cannot be subclassed
		// final class need to be used when class structure should not be changed.
		PersonalLoan loan = new PersonalLoan(100000, "Sidhesh");
		System.out.println(loan.getAccntOwnerName());

	}

}
