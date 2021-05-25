package capg;

import java.util.Scanner;

public class Employees{
	private int empId;
	private String empName;

	public Employees() {
		super();
	}
	public Employees(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public void displayEmpDetails() {
		// TODO Auto-generated method stub
		System.out.println("empId = " + empId + "Emp name = " + empName);
		System.out.println();
	}

	//displayEmpDetails with Employee Object as argument 
	public void displayEmpDetails(Employees emp) {
		// TODO Auto-generated method stub
		System.out.println("empId = " + emp.getEmpId() + "Emp name = " + emp.getEmpName());
		System.out.println();
	}

	//overloaded the method displayEmpDetails by Employee[] object as argument
	public void displayEmpDetails(Employees[] emp) {
		for(int i=0;i<emp.length;i++) {
			System.out.println("empId = " + emp[i].getEmpId() + "Emp name = " + emp[i].getEmpName());
			System.out.println();
		}
	}
	//find an employee by id
	public void findEmployeeById(Employees[] emp,int id) {
		for(int i=0;i<emp.length;i++) {
			if(emp[i].getEmpId() == id)
			{
				System.out.println("employee found at " + i);
				System.out.println("empId = " + emp[i].getEmpId() + "Emp name = " + emp[i].getEmpName());
				break;
			}else {
				System.out.println("No employee found");
			}
		}
		System.out.println();
	}
	
	//creating the list of employees using array and returning an array
	   Scanner sc = new Scanner(System.in);
	   Employees[] empList1 = new Employees[3];
	public Employees[] createEmpList() {
		   for(int i=0;i<empList1.length;i++) {
			   System.out.println("Enter the employee details for  "+ i + " emp object");
			   empList1[i] = new Employees();
			   empList1[i].setEmpId(sc.nextInt());
			   empList1[i].setEmpName(sc.next());
		   }
		   return empList1;
	}

	//find an employee by id
	public void updateEmployeeById(Employees[] emp,int id) {
		for(int i=0;i<emp.length;i++) {
			if(emp[i].getEmpId() == id)
			{
				System.out.println("employee found at " + i);
				System.out.println("Enter new name to update for the employee");
				String updatedname=sc.next();
				emp[i].setEmpName(updatedname);
				System.out.println("empId = " + emp[i].getEmpId() + "Emp name = " + emp[i].getEmpName());
				break;
			}else {
				System.out.println("No employee found");
			}
		}
		System.out.println();
	}
	
	//delete an employee by id
		public Employees[] deleteEmployeeById(Employees[] emp,int id) {
			int originalLength = emp.length;
			for(int i=0;i<originalLength;i++) {
				if(emp[i].getEmpId() == id)
				{
					System.out.println("employee found at " + i);
					emp[i] = emp[originalLength-1];
					originalLength--;
					break;
				}else {
					System.out.println("No employee found");
				}
			}
			System.out.println();
			return emp;
		}
}
