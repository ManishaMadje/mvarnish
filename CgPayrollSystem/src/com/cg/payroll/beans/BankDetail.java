package com.cg.payroll.beans;

public class BankDetail {

	private int accountNo;
private String bankName,IFSCode;

//******** default constructor must
public BankDetail(){}

public BankDetail(int accountNo, String bankName, String iFSCode) {
	super();
	this.accountNo = accountNo;
	this.bankName = bankName;
	IFSCode = iFSCode;
}
public int getAccountNo() {
	return accountNo;
}
public void setAccountNo(int accountNo) {
	this.accountNo = accountNo;
}
public String getBankName() {
	return bankName;
}
public void setBankName(String bankName) {
	this.bankName = bankName;
}
public String getIFSCode() {
	return IFSCode;
}
public void setIFSCode(String iFSCode) {
	IFSCode = iFSCode;
}

	

}
