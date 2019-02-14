package lab5.com.cg.eis.service;

import lab5.com.cg.eis.bean.Employee;

public class Service implements EmployeeService{
	Employee employees[] = new Employee[10];
	int count = 0;
	
	@Override
	public String creatEmployee(int id, String name, double salary) {
		
		String designation ;
		String insuranceScheme;
		if(salary <5000) {
			designation = "Clerk";
			insuranceScheme = "No Scheme";
		}
		else if(salary <20000) {
			designation = "System Associate";
			insuranceScheme = "C Scheme";
		}
		else if(salary <40000) {
			designation = "Programmer";
			insuranceScheme = "B Scheme";
		}
		else {
			designation = "Manager";
			insuranceScheme = "A Scheme";
		}
		
		Employee emp = new Employee(id, name, salary, designation, insuranceScheme);
		employees[count++] = emp;
		return "Employee added Successfully";
	}

	@Override
	public String display(int id) {
		Employee emp=null;
		for(int i=0;i<count;i++) {
			if(id == employees[i].getId()) {
				emp = employees[i];
				break;
			}
		}
		if(emp != null) {
			return "Employee Name : " + emp.getName() + '\n' 
					+ "Employee Salary : "+ emp.getSalary() + '\n' 
					+ "Employee Designation : " + emp.getDesignation() + '\n' 
					+ "Employee Insurance Scheme : " + emp.getInsuranceScheme();
		}
		return "Employee id doesn't match to our Database";
	}

	@Override
	public String getInsuranceScheme(int id) {
		Employee emp=null;
		for(int i=0;i<count;i++) {
			if(id == employees[i].getId()) {
				emp = employees[i];
				break;
			}
		}
		if(emp != null) {
			return "Employee Insurance Scheme : " + emp.getInsuranceScheme();
		}
		return "Employee id doesn't match to our Database";
	}
 
	
	
}
