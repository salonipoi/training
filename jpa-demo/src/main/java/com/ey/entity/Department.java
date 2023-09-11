package com.ey.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "dept")

public class Department {
	@Id
	@Column(name = "dept_no")
	private int deptNo;
	@Column(name = "dname", length = 20)
	private String deptName;
	@OneToMany(mappedBy = "dept", fetch = FetchType.EAGER,cascade = CascadeType.REMOVE)
	private List<Employee> emps;

	public Department() {
	}

	public Department(int deptNo, String deptName, List<Employee> emps) {
		super();
		this.deptNo = deptNo;
		this.deptName = deptName;
		this.emps = emps;
	}

	public int getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public List<Employee> getEmps() {
		return emps;
	}

	public void setEmps(List<Employee> emps) {
		this.emps = emps;
	}

	@Override
	public String toString() {
		return "Department [deptNo=" + deptNo + ", deptName=" + deptName + "]";
	}

}
