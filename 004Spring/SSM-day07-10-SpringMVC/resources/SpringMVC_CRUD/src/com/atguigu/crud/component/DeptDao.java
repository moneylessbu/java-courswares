package com.atguigu.crud.component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.atguigu.crud.entity.Department;

@Repository
public class DeptDao {
	
	private static Map<String, Department> dataMap;
	private static Map<String, Department> namedMap;
	
	static {
		dataMap = new HashMap<>();
		namedMap = new HashMap<>();
		
		Department 
		department = new Department(UUID.randomUUID().toString(), "市场部");
		dataMap.put(department.getDeptId(), department);
		namedMap.put(department.getDeptName(), department);
		
		department = new Department(UUID.randomUUID().toString(), "销售部");
		dataMap.put(department.getDeptId(), department);
		namedMap.put(department.getDeptName(), department);
		
		department = new Department(UUID.randomUUID().toString(), "行政部");
		dataMap.put(department.getDeptId(), department);
		namedMap.put(department.getDeptName(), department);
		
		department = new Department(UUID.randomUUID().toString(), "人事部");
		dataMap.put(department.getDeptId(), department);
		namedMap.put(department.getDeptName(), department);
		
		department = new Department(UUID.randomUUID().toString(), "技术部");
		dataMap.put(department.getDeptId(), department);
		namedMap.put(department.getDeptName(), department);
		
		department = new Department(UUID.randomUUID().toString(), "公关部");
		dataMap.put(department.getDeptId(), department);
		namedMap.put(department.getDeptName(), department);
		
	}
	
	public static Department getDeptByName(String deptName) {
		return namedMap.get(deptName);
	}
	
	public static Department getDeptById(String uuid) {
		return dataMap.get(uuid);
	}
	
	public List<Department> getDeptList() {
		return new ArrayList<>(dataMap.values());
	}
	
}
