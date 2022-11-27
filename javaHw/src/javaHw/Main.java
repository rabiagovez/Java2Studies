package javaHw;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer();
		Employee employee= new Employee();
		System.out.println(customer.age);
		System.out.println(employee.id);
		
		EmployeeManager employeeManager = new EmployeeManager();
		CustomerManger customerManger = new CustomerManger();
		customerManger.Add();
		employeeManager.BestEmployee();
	}

}
