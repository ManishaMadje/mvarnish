package com.cg.payroll.beans;

public class Salary {
	private int basicSalary,hra,conveyenceAllowance,otherAllowance,personalAllowance,monthalyTax,epf,companyPf,netSalary;
	
	//******** default constructor must
	public Salary(){}
	
	public Salary(int basicSalary, int hra, int conveyenceAllowance, int otherAllowance, int personalAllowance,
			int monthalyTax, int epf, int companyPf, int netSalary) {
		super();
		this.basicSalary = basicSalary;
		this.hra = hra;
		this.conveyenceAllowance = conveyenceAllowance;
		this.otherAllowance = otherAllowance;
		this.personalAllowance = personalAllowance;
		this.monthalyTax = monthalyTax;
		this.epf = epf;
		this.companyPf = companyPf;
		this.netSalary = netSalary;
	}

	public int getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(int basicSalary) {
		this.basicSalary = basicSalary;
	}

	public int getHra() {
		return hra;
	}

	public void setHra(int hra) {
		this.hra = hra;
	}

	public int getConveyenceAllowance() {
		return conveyenceAllowance;
	}

	public void setConveyenceAllowance(int conveyenceAllowance) {
		this.conveyenceAllowance = conveyenceAllowance;
	}

	public int getOtherAllowance() {
		return otherAllowance;
	}

	public void setOtherAllowance(int otherAllowance) {
		this.otherAllowance = otherAllowance;
	}

	public int getPersonalAllowance() {
		return personalAllowance;
	}

	public void setPersonalAllowance(int personalAllowance) {
		this.personalAllowance = personalAllowance;
	}

	public int getMonthalyTax() {
		return monthalyTax;
	}

	public void setMonthalyTax(int monthalyTax) {
		this.monthalyTax = monthalyTax;
	}

	public int getEpf() {
		return epf;
	}

	public void setEpf(int epf) {
		this.epf = epf;
	}

	public int getCompanyPf() {
		return companyPf;
	}

	public void setCompanyPf(int companyPf) {
		this.companyPf = companyPf;
	}

	public int getNetSalary() {
		return netSalary;
	}

	public void setNetSalary(int netSalary) {
		this.netSalary = netSalary;
	}

	
	


	

}
