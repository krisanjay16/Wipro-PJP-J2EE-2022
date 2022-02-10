public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee("Kris", 99999, 2022, "123456789");
		
		System.out.println("Details of Employee:");
		System.out.println("Name: " + e.getName());
		System.out.println("Year Of Starting: " + e.getYearOfStart());
		System.out.println("Annual Salary: " + e.getAnnualSalary());
		System.out.println("Insurance Number: " + e.getNationalInsuranceNo());
	}

}
