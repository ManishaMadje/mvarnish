package com.cg.payroll.beans;

public class Employee {
	private int id;
		private String firstName,lastName,designation,pancardNo,emailID;
		private Salary salary;
		private BankDetail  bankdetail;
		public Employee(){}
		public Employee(int id, String firstName, String lastName, String designation, String pancardNo,
				String emailID, Salary salary, BankDetail bankdetail) {
			super();
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.designation = designation;
			this.pancardNo = pancardNo;
			this.emailID = emailID;
			this.salary = salary;
			this.bankdetail = bankdetail;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getDesignation() {
			return designation;
		}
		public void setDesignation(String designation) {
			this.designation = designation;
		}
		public String getPancardNo() {
			return pancardNo;
		}
		public void setPancardNo(String pancardNo) {
			this.pancardNo = pancardNo;
		}
		public String getEmailID() {
			return emailID;
		}
		public void setEmailID(String emailID) {
			this.emailID = emailID;
		}
		public Salary getSalary() {
			return salary;
		}
		public void setSalary(Salary salary) {
			this.salary = salary;
		}
		public BankDetail getBankdetail() {
			return bankdetail;
		}
		public void setBankdetail(BankDetail bankdetail) {
			this.bankdetail = bankdetail;
		};
	
	
	

}
