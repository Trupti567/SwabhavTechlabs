package com.techlabs.setforobjects;



public class StudentForHashset {
	private int studentId;
	private String studentName;
	private String studentBranch;
	public StudentForHashset(int studentId,String studentName,String studentBranch)
	{
		this.studentId=studentId;
		this.studentName=studentName;
		this.studentBranch=studentBranch;
	}
	
	public String getStudentName()
	{
		return studentName;
	}

	public int getStudentId() {
		return studentId;
	}

	public String getStudentBranch() {
		return studentBranch;
	}
	
	public void setName(String studentName)
	{
		this.studentName=studentName;
	}
	public void setStudentId(int studentId)
	{
		this.studentId=studentId;
	}
	
	public void setStudentBranch(String studentBranch)
	{
		this.studentBranch=studentBranch;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + studentId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentForHashset other = (StudentForHashset) obj;
		if (studentId != other.studentId)
			return false;
		return true;
	}
	

}
