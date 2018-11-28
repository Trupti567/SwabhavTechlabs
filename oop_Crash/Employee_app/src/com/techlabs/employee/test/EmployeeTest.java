package com.techlabs.employee.test;

import com.techlabs.employee.Employee;

public class EmployeeTest {
	public static void main(String args[]) {
		Employee employee1 = new Employee();
		
		
		
		employee1.setFname("Trupti");
		employee1.setLname("Mahale");
		employee1.setId(101);
		employee1.setSalary(100000);
		employee1.setCommision(0.10f);
		
		
		
		Employee employee2=new Employee();
		
		employee2.setFname("Manju");
		employee2.setLname("Mahale");
		employee2.setId(102);
        employee2.setSalary(12000);
        employee2.setCommision(0.10f);
        
        Employee employee3=new Employee();
        
        employee3.setFname("Tushar");
        employee3.setLname("Jadhav");
        employee3.setId(103);
        employee3.setSalary(30000);
        employee3.setCommision(0.20f);
      
        
        Employee employee[]=new Employee[3];
        employee[0]=employee1;
        employee[1]=employee2;
        employee[2]=employee3;
        for(int i=0;i<employee.length;i++)
        {
        	printDetails(employee[i]);
        }
        
        
       
        
        
	}
	public static void printDetails(Employee e) {
		System.out.println(e.getFname() + " " + e.getLname() + " " + e.getId()
				+ " having annual salary " +e.calculateAnnualSalary()); 
	

}
}