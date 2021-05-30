package com.atguigu.crud.component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.atguigu.crud.entity.Department;
import com.atguigu.crud.entity.Employee;

@Repository
public class EmpDao {
	
	private static Map<String, Employee> dataMap;
	
	static {
		dataMap = new HashMap<>();
		
		String empId = UUID.randomUUID().toString();
		dataMap.put(empId, new Employee(empId, "乔峰", "SSN001", DeptDao.getDeptByName("市场部")));
		
		empId = UUID.randomUUID().toString();
		dataMap.put(empId, new Employee(empId, "虚竹", "SSN002", DeptDao.getDeptByName("市场部")));
		
		empId = UUID.randomUUID().toString();
		dataMap.put(empId, new Employee(empId, "段誉", "SSN003", DeptDao.getDeptByName("市场部")));
		
		empId = UUID.randomUUID().toString();
		dataMap.put(empId, new Employee(empId, "鸠摩智", "SSN004", DeptDao.getDeptByName("技术部")));
		
		empId = UUID.randomUUID().toString();
		dataMap.put(empId, new Employee(empId, "萧远山", "SSN005", DeptDao.getDeptByName("技术部")));
		
		empId = UUID.randomUUID().toString();
		dataMap.put(empId, new Employee(empId, "慕容复", "SSN006", DeptDao.getDeptByName("技术部")));
		
		empId = UUID.randomUUID().toString();
		dataMap.put(empId, new Employee(empId, "段正淳", "SSN007", DeptDao.getDeptByName("公关部")));
		
		empId = UUID.randomUUID().toString();
		dataMap.put(empId, new Employee(empId, "段延庆", "SSN008", DeptDao.getDeptByName("公关部")));
		
		empId = UUID.randomUUID().toString();
		dataMap.put(empId, new Employee(empId, "丁春秋", "SSN009", DeptDao.getDeptByName("销售部")));
		
		empId = UUID.randomUUID().toString();
		dataMap.put(empId, new Employee(empId, "无崖子", "SSN010", DeptDao.getDeptByName("人事部")));
		
		empId = UUID.randomUUID().toString();
		dataMap.put(empId, new Employee(empId, "慕容博", "SSN011", DeptDao.getDeptByName("人事部")));
	}
	
	public void saveEmp(Employee employee) {
		
		String empId = UUID.randomUUID().toString();
		employee.setEmpId(empId);
		
		String deptId = employee.getDepartment().getDeptId();
		Department department = DeptDao.getDeptById(deptId);
		employee.setDepartment(department);
		
		dataMap.put(empId, employee);
	}
	
	public void removeEmp(String empId) {
		dataMap.remove(empId);
	}
	
	public void updateEmp(Employee employee) {
		
		String deptId = employee.getDepartment().getDeptId();
		Department department = DeptDao.getDeptById(deptId);
		employee.setDepartment(department);
		
		dataMap.put(employee.getEmpId(), employee);
	}
	
	public Employee getEmpById(String empId) {
		return dataMap.get(empId);
	}
	
	public List<Employee> getEmpList() {
		return new ArrayList<>(dataMap.values());
	}

}
