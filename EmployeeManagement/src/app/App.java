package app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import beans.Address;
import beans.Department;
import beans.Employee;
import repo.Database;
import validate.Validate;


public class App {
	
	public static void main(String[] args) {
		Database database = new Database();
		Scanner sc=new Scanner(System.in);
		Validate validate=new Validate();
		outer:while (true) {
			
			
			System.out.println("Enter your choice: \n 1.Add Employee \n 2.Sort by empid"
					+ " \n 3.Sort by first name \n 4.Sort by last name\n 5.Sort by salary\n 6.Sort by address\n 7.Sort by dept"
					+ "\n 8.Exit ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				Employee emp=new Employee();
				Department dept=new Department();
				Address address=new Address();
				System.out.println("enter employee id");
				while (true) {
					String employeeid=sc.next();
					if (validate.employeeIdValidation(employeeid)) {
						if(!database.map.containsKey(employeeid)) {
						emp.setEmployeeID(employeeid);
						break;
						}
						else {
							System.out.println("enter unique employee id");
						}
					}
					else
						System.out.println("enter valid employee id");
				}
				System.out.println("enter first name");
				while (true) {
					String firstname=sc.next();
					if (validate.employeeNameValidation(firstname)) {
							emp.setFirstName(firstname);
						break;
					}
					else
						System.out.println("enter name in alphabets");
				}
				System.out.println("enter last name");
				while (true) {
					String lastname=sc.next();
					if (validate.employeeNameValidation(lastname)) {
						emp.setLastName(lastname);
						break;
					}
					else
						System.out.println("enter name in alphabets");
				}
				System.out.println("employee salary");
				while (true) {
					int salary=sc.nextInt();
					if (validate.salaryValidation(salary)) {
						emp.setSalary(salary);
						break;
					}
					else
						System.out.println("enter salary between 20000 and 5L");
				}
				System.out.println("enter the date of joining");
				while (true) {
					String doj=sc.next();
					if (validate.dateValidation(doj)) {
						emp.setDateOfJoining(doj);
						break;
					}
					else
						System.out.println("previous dates are not allowed");
				}
				System.out.println("enter department id");
				dept.setDepartmentId(sc.nextInt());
				System.out.println("enter department name");
				dept.setDepartmentName(sc.next());
				System.out.println("enter location");
				dept.setLocation(sc.next());
				emp.setDepartment(dept);
				System.out.println("enter address id");
				address.setAddressId(sc.nextInt());
				System.out.println("enter address line");
				address.setAddressLine1(sc.next());
				System.out.println("enter city");
				address.setCity(sc.next());
				System.out.println("enter state");
				address.setState(sc.next());
				emp.setAddress(address);
				database.map.put(emp.getEmployeeID(), emp);
				System.out.println("employee created"+database.map);
				break;
			
			case 2:
				Set<Entry<String,Employee>>entrySet1=database.map.entrySet();
				List<Entry<String,Employee>> list1=new ArrayList<Map.Entry<String,Employee>>(entrySet1);
				Collections.sort(list1, new Comparator<Entry<String,Employee>>() {

					@Override
					public int compare(Entry<String, Employee> o1, Entry<String, Employee> o2) {
						
						return o1.getValue().getEmployeeID().compareTo(o2.getValue().getEmployeeID());
					}
				});
				System.out.println("sorted based on emp id");
				list1.forEach(s->{
					System.out.println("\t"+s.getValue().getEmployeeID()+"\t"+s.getValue().getFirstName());
				});
				 break;
			case 3:{
				Set<Entry<String,Employee>>entrySet=database.map.entrySet();
				List<Entry<String,Employee>> list=new ArrayList<Map.Entry<String,Employee>>(entrySet);
				Collections.sort(list, new Comparator<Entry<String,Employee>>() {

					@Override
					public int compare(Entry<String, Employee> o1, Entry<String, Employee> o2) {
						
						return o1.getValue().getFirstName().compareTo(o2.getValue().getFirstName());
					}
				});
				System.out.println("sorted based on first name");
				list.forEach(s->{
					System.out.println(s.getKey()+"\t"+s.getValue().getFirstName());
				});
				break; 
			}
			case 4:{
				Set<Entry<String,Employee>>entrySet=database.map.entrySet();
				List<Entry<String,Employee>> list=new ArrayList<Map.Entry<String,Employee>>(entrySet);
				Collections.sort(list, new Comparator<Entry<String,Employee>>() {

					@Override
					public int compare(Entry<String, Employee> o1, Entry<String, Employee> o2) {
						
						return o1.getValue().getLastName().compareTo(o2.getValue().getLastName());
					}
				});
				System.out.println("sorted based on last name");
				list.forEach(s->{
					System.out.println(s.getKey()+"\t"+s.getValue().getLastName());
				});
				break; 
			}
			case 5:{
				Set<Entry<String,Employee>>entrySet=database.map.entrySet();
				List<Entry<String,Employee>> list=new ArrayList<Map.Entry<String,Employee>>(entrySet);
				Collections.sort(list, new Comparator<Entry<String,Employee>>() {

					@Override
					public int compare(Entry<String, Employee> o1, Entry<String, Employee> o2) {
						
						return o1.getValue().getSalary().compareTo(o2.getValue().getSalary());
					}
				});
				System.out.println("sorted based on salary");
				list.forEach(s->{
					System.out.println(s.getKey()+"\t"+s.getValue().getFirstName()+"\t"+s.getValue().getSalary());
				});
				break; 
			}
			case 6:{
				Set<Entry<String,Employee>>entrySet=database.map.entrySet();
				List<Entry<String,Employee>> list=new ArrayList<Map.Entry<String,Employee>>(entrySet);
				Collections.sort(list, new Comparator<Entry<String,Employee>>() {

					@Override
					public int compare(Entry<String, Employee> o1, Entry<String, Employee> o2) {
						
						return o1.getValue().getAddress().getAddressId().compareTo(o2.getValue().getAddress().getAddressId());
					}
				});
				System.out.println("sorted based on address id");
				list.forEach(s->{
					System.out.println(s.getKey()+"\t"+s.getValue().getAddress());
				});
				break; 
			}
			case 7:{
				Set<Entry<String,Employee>>entrySet=database.map.entrySet();
				List<Entry<String,Employee>> list=new ArrayList<Map.Entry<String,Employee>>(entrySet);
				Collections.sort(list, new Comparator<Entry<String,Employee>>() {

					@Override
					public int compare(Entry<String, Employee> o1, Entry<String, Employee> o2) {
						
						return o1.getValue().getDepartment().getDepartmentId().compareTo(o2.getValue().getDepartment().getDepartmentId());
					}
				});
				System.out.println("sorted based on dept id");
				list.forEach(s->{
					System.out.println(s.getKey()+"\t"+s.getValue().getDepartment());
				});
				break; 
			}
			case 8:System.out.println("thank you...visit again");
			break outer;

	}

}
	}
	 
}
