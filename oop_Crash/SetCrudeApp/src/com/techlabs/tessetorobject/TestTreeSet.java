package com.techlabs.tessetorobject;

import java.util.Set;
import java.util.TreeSet;

import com.techlabs.setforobjects.EmployeeTreeSet;

public class TestTreeSet {
	public static void main(String args[])
	{
		Set<EmployeeTreeSet> setemployee=new TreeSet<EmployeeTreeSet>();
		EmployeeTreeSet employee=new EmployeeTreeSet(101, "trupti", "technical");
		EmployeeTreeSet employee1=new EmployeeTreeSet(101, "Manisha", "technical");
		EmployeeTreeSet employee2=new EmployeeTreeSet(103, "Anisha", "non-technical");
		EmployeeTreeSet employee3=new EmployeeTreeSet(102, "leena", "Hr");
		setemployee.add(employee);
		setemployee.add(employee1);
		setemployee.add(employee2);
		setemployee.add(employee3);
		for(EmployeeTreeSet temp:setemployee)
		{
			System.out.println(" ID : = "+temp.getEmpid()+" Name : = "+temp.getEmpName()+" Department : = "+temp.getEmpDepartMent());
		}
		
	}

}
