package com.atguigu.crud.component;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.atguigu.crud.entity.Department;
import com.atguigu.crud.entity.Employee;

@Controller
public class EmpHandler {
	
	@Autowired
	private EmpDao empDao;
	
	@Autowired
	private DeptDao deptDao;
	
	@ModelAttribute
	public Employee getEmployee(@RequestParam(value="empId", required=false) String empId) {
		if(empId == null) {
			return new Employee();
		}else{
			return empDao.getEmpById(empId);
		}
	}
	
	@RequestMapping(value="/emp", method=RequestMethod.PUT)
	public String updateEmp(Employee employee) {
		
		empDao.updateEmp(employee);
		
		return "redirect:/emp/showList";
	}
	
	@RequestMapping(value="/emp/{empId}", method=RequestMethod.GET)
	public String editEmp(@PathVariable("empId") String empId, Map<String,Object> map) {
		
		Employee employee = empDao.getEmpById(empId);
		map.put("employee", employee);
		
		List<Department> deptList = deptDao.getDeptList();
		map.put("deptList", deptList);
		
		return "empEdit";
	}
	
	@RequestMapping(value="/emp/{empId}", method=RequestMethod.DELETE)
	public String removeEmp(@PathVariable("empId") String empId) {
		
		empDao.removeEmp(empId);
		
		return "redirect:/emp/showList";
	}
	
	@RequestMapping(value="/emp", method=RequestMethod.POST)
	public String saveEmp(Employee employee) {
		
		empDao.saveEmp(employee);
		
		return "redirect:/emp/showList";
	}
	
	@RequestMapping("/emp/toAddUI")
	public String toAddUI(Map<String, Object> map) {
		
		List<Department> deptList = deptDao.getDeptList();
		map.put("deptList", deptList);
		
		return "empCreate";
	}
	
	@RequestMapping("/emp/showList")
	public String showEmpList(Map<String, Object> map) {
		
		List<Employee> empList = empDao.getEmpList();
		map.put("empList", empList);
		
		return "empList";
	}

}
