
public class Doctor {
	String name;			//Name of Doctor
	String qualification;	//Qualification of Doctor
	String experience;		//Work Experience of Doctor
	int salary;				//Salary of Doctor
	
	
	public Doctor() {
		name = null;
		qualification = null;
		experience = null;
		salary = 0;
	}
	
	//Parameterized Constructor to set Values of a Field in a class
	public Doctor(String drname, String qual, String exp, int salry) {
		this.name = drname;
		this.qualification = qual;
		this.experience = exp;
		this.salary = salry;
	}
	public String DoctorData() {
		return "" + name + " , " + qualification + " , " + experience + " , " + salary;
	}
}
