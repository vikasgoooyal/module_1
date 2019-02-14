package lab5.com.cg.eis.service;

public interface EmployeeService {
	
	String creatEmployee(int id, String name, double salary);
	
	String display(int id);
	
	String getInsuranceScheme(int id);
}
