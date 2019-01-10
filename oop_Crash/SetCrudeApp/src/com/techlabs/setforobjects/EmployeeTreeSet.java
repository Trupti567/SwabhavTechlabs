package com.techlabs.setforobjects;

public class EmployeeTreeSet implements Comparable<EmployeeTreeSet> {
	private int empid;
	private String empName;
	private String empDepartMent;
	public EmployeeTreeSet(int empid,String empName,String empDepartMent)
	{
		this.empid=empid;
		this.empName=empName;
		this.empDepartMent=empDepartMent;
	}
	public int getEmpid() {
		return empid;
	}
	public String getEmpName() {
		return empName;
	}
	public String getEmpDepartMent() {
		return empDepartMent;
	}
	@Override
	public int compareTo(EmployeeTreeSet emp)
	{
	if(empid>emp.empid){  
        return 1;  
    }else if(empid<emp.empid){  
        return -1;  
    }else{  
    return 0;  
    }  

	}
}
