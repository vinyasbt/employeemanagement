package beans;

import java.util.Date;

public class Employee {
private String employeeID;
private String firstName;
private String lastName;
private Integer salary;
private String dateOfJoining;
private Department department;
private Address address;
public String getEmployeeID() {
	return employeeID;
}
public void setEmployeeID(String employeeID) {
	this.employeeID = employeeID;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public Integer getSalary() {
	return salary;
}
public void setSalary(Integer salary) {
	this.salary = salary;
}
public String getDateOfJoining() {
	return dateOfJoining;
}
public void setDateOfJoining(String dateOfJoining) {
	this.dateOfJoining = dateOfJoining;
}
public Department getDepartment() {
	return department;
}
public void setDepartment(Department department) {
	this.department = department;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
@Override
public String toString() {
	return "Employee [employeeID=" + employeeID + ", firstName=" + firstName + ", lastName=" + lastName + ", salary="
			+ salary + ", dateOfJoining=" + dateOfJoining + ", department=" + department + ", address=" + address + "]";
}

}
