package com.atguigu.crud.entity;

public class Employee {
	
	private String empId;
	private String empName;
	private String ssn;
	private Department department;
	
	public Employee() {
		
	}

	public Employee(String empId, String empName, String ssn,
			Department department) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.ssn = ssn;
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", ssn="
				+ ssn + ", department=" + department.getDeptName() + "]";
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

}
