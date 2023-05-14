package hashMapLearningPackage;

public class EmployeeAccountClass {
	private int employeeId;
	private String employeeName;
	private String employeeDesignation;
	private int employeeSalary;
	private String employeeDepartment;

	public EmployeeAccountClass(int employeeId, String employeeName, String employeeDesignation, int employeeSalary,
			String employeeDepartment) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeDesignation = employeeDesignation;
		this.employeeSalary = employeeSalary;
		this.employeeDepartment = employeeDepartment;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public String getEmployeeDesignation() {
		return employeeDesignation;
	}

	public int getEmployeeSalary() {
		return employeeSalary;
	}

	public String getEmployeeDepartment() {
		return employeeDepartment;
	}

	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}

	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

}
