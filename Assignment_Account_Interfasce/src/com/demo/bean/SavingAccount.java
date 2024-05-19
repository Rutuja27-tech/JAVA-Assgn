package com.demo.bean;

import com.demo.doa.IATM;

public class SavingAccount extends Account implements IATM {
private int PIN;
	
	public SavingAccount() {
		super();
		setIntrestRate(3.6f);
		//System.out.println("Saving Account");


	}

	public SavingAccount(String name, double balance, int pin) {
		super(name, balance);
		super.setIntrestRate(3.6f);
		PIN=pin;
		//System.out.println("Saving Account");

	}
	
	public int ViewPin() {
		return PIN;
	}
	
	public int getPIN() {
		return PIN;
	}

	public void setPIN(int pIN) {
		PIN = pIN;
	}

	public void CheckBalance() {
		System.out.println("Balance is :"+getBalance());
	}

	

	
	
	
	@Override
	public String toString() {
		//System.out.println("Account is :"+getAccountNum());

		return super.toString()+"SavingAccount [IntrestRate=" + getIntrestRate() + "Intrest ="+getIntrest()+ "]";
	}


}
