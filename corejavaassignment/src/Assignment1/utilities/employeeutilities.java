package Assignment1.utilities;

import Assignment1.employee.employee;

public class employeeutilities {
	 private static Assignment1.employee.employee employee;

	 public static void printemployeeDetails(employee employee) {
	        System.out.println("Name: " + employee.getName());
	        System.out.println("Employee ID: " + employee.getEmployeeId());
	        System.out.println("Salary: " + employee.getSalary());
	    }

	    /**
	     * Applies a salary increment to an employee.
	     * Demonstrates access to protected setter method.
	     *
	     * @param employee Employee object whose salary is to be updated.
	     * @param increment Amount to increase the salary by.
	     */
	    public static void applySalaryIncrement(employee employee, double increment) {
	        employeeutilities.employee = employee;
			employee.increaseSalary(increment);
	        // Using protected setter since this class is outside employees package,
	        // so we must rely on public/protected access - here we can use public methods only,
	        // but setter is protected, so let's simulate by calling public methods (e.g. via subclass),
	        // but since protected methods aren't accessible here, we cannot call setSalary directly.
	        // So for this assignment, let's assume setSalary is public or provide a method in Employee to increase salary.
	        
	        // To solve this, let's add a public method in Employee to increase salary (I'll add it there).
	    }

}
