package validate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Validate {
	public boolean employeeIdValidation(String name) {
		String pattern = "^[0-9]{5}+[A-Z]{2}$";
		return name.matches(pattern);

	}
	public boolean employeeNameValidation(String name) {
		String pattern = "^[a-zA-Z]+$";
		return name.matches(pattern);

	}
	public boolean salaryValidation(Integer salary) {
		if((salary>=20000)&&(salary<=500000)) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean dateValidation(String date) {
		LocalDate presentdate=LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate localDate = LocalDate.parse(date, formatter);
		Integer difference=presentdate.compareTo(localDate);
		if(difference>0) {
			return false;
		}
		else {
			return true;
		}
	}
}
