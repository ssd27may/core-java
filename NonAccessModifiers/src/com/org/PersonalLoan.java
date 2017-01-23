package com.org;
/**
 * Final class so cannot be subclassed
 *
 */
public final class PersonalLoan {

	private int loanAmnt;
	private String accntOwnerName;
	public static final String BANK_NAME = "HDFC";
	
	public PersonalLoan(int loanAmnt, String accntOwnerName) {
		this.loanAmnt = loanAmnt;
		this.accntOwnerName = accntOwnerName;
	}

	public int getLoanAmnt() {
		return loanAmnt;
	}

	public void setLoanAmnt(int loanAmnt) {
		this.loanAmnt = loanAmnt;
		// cannot reassing another value to a final variable
		//this.BANK_NAME = "icici";
	}

	public String getAccntOwnerName() {
		return accntOwnerName;
	}

	public void setAccntOwnerName(String accntOwnerName) {
		this.accntOwnerName = accntOwnerName;
	}
	
	
}
