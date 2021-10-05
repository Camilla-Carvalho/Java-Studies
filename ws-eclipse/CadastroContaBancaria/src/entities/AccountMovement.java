package entities;

public class AccountMovement {
	
	private int accountNumber;
	public String accountHolder;
	public char option;
	public double initialDeposit; 
	private double credit, debit;
	

	ScreenArtifacts artifact = new ScreenArtifacts();	
public AccountMovement() {
	
}

public AccountMovement(String accountHolder, int accountNumber, char option) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.option = option;		
	}


public AccountMovement(double credit, double debit) {
	this.credit = credit;
	this.debit = debit;
}


public void setCredit(double credit) {
	this.credit = credit + this.initialDeposit;
}

public double getCredit() {
	return credit;
}


public void setDebit(double debit) {
	this.debit = ((this.initialDeposit + this.credit) - debit) - 5;
	
}

public double getDebit() {
	return debit;
}



public String toString() {
	return "Account: "
           + this.accountNumber
           +", Holder: "
           + this.accountHolder
           +", Balance: $ ";       
	}

}
