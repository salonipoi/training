package com.ey.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.ey.dao.EmpDeptDao;
import com.ey.entity.Department;
import com.ey.entity.Employee;

public class TestEmpDeptDao {
	private static EmpDeptDao dao;

	@BeforeAll
	public static void setup() {
		dao = new EmpDeptDao();
	}

	@Test
	public void testSaveDept() {
		Department dept = new Department();
		dept.setDeptNo(20);
		dept.setDeptName("Accounts");
		dao.addDept(dept);
	}

	@Test
	public void testSaveEmp() {
		Employee emp = new Employee();
		emp.setEmpNo(202);
		emp.setEmpName("Ramesh");
		emp.setSalary(5500);
		
		dao.addEmp(emp, 20);
	}

	@Test
	public void testFindDept() {
		Department dept = dao.findDept(10);
		System.out.println(dept);
		assertNotNull(dept);
		//dept.getEmps().forEach(System.out::println);
	}

	@Test
	public void testRemoveDept() {
		dao.removeDept(20);
	}
	@Test
	public void testRemoveEmp() {
		dao.removeEmp(201);
	}
	@Test
	public void testFindEmp() {
		dao.findEmp(201);
	}

	@Test
	public void testListEmp() {
		dao.listEmp();
	}
}