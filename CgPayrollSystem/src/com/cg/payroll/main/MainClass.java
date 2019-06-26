package com.cg.payroll.main;

import java.io.ObjectInputStream.GetField;
import java.util.concurrent.ForkJoinPool;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import com.cg.payroll.beans.BankDetail;
import com.cg.payroll.beans.Employee;
import com.cg.payroll.beans.Salary;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Employee emp=new Employee(1, "Manisha","Madje"," developer"," fsc1234"," manishavrmadje1997@gmail.com");

int eid=emp.getId();
emp.setFirstName("Monika");
//System.out.println(emp.getDesignation());
// 16/6/019....Array
Employee[] empList=new Employee[10];
empList[0]=new Employee(3542, "tanisha","Madje"," tester"," DFRGH1234"," tanisha@gmail.com");
empList[1]=new Employee(4233, "Nisha","Kakde"," tester"," FGHFC122"," kaomal@gmail.com");
empList[2]=new Employee(40008, "Alka","Yadni"," designer"," DFRGH1234"," alka@gmail.com");
empList[3]=new Employee(5054, "neha","kale"," Coder"," DERFL987"," neha@gmail.com");
empList[4]=new Employee(60064, "Abhijit","Jadhav"," Manager"," AFGR1234","abhijit@gmail.com");
empList[5]=new Employee(7405, "suraj","jadhav"," Developer"," WQGJ87659"," suraj@gmail.com");
empList[6]=new Employee(8345, "Bhakti","Patil"," designer"," DFR90097"," bhakiti@gmail.com");
empList[7]=new Employee(329, "Katrina","Kaif","Coder","RGTH1234"," katrina@gmail.com");
empList[8]=new Employee(100, "madhuri","Dikshit"," tester"," AWRG1864"," madhuri@gmail.com");
empList[9]=new Employee(10, "Mahendra singh","Dhoni"," Hacher"," JGTK789"," msdhoni@gmail.com");


for(int i=0;i<empList.length;i++){
if(empList[i].getId()!=0 &&empList[i].getId()==100||empList[i].getId()==10)
System.out.println(empList[i].getFirstName()+" "+empList[i].getLastName());

}
*/
	//6/17/19.......contentment type 
		Employee emp=new Employee(101, "Manisha"," Madje", "Developer", "DSEF234", "manishavrmadje@gmail.com", new Salary(50000,1000,1000,1000,1000,100,1000,1000,43000),new BankDetail(200365,"HDFC","FDS123"));

System.out.println("Employee ID = "+emp.getId());
System.out.println("BankName = "+ emp.getBankdetail().getBankName()+"   Net salary = "+emp.getSalary().getNetSalary());
	}


}
	
