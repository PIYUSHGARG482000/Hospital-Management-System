
import java.util.*;
public class MainClass {
	
	static Patient pt = new Patient();  //Reason for making static is to execute first in the Programme execution 
	static Doctor dr = new Doctor();
	static ArrayList<Doctor> dr1 = new ArrayList<>();
	static ArrayList<Patient> pt1 = new ArrayList<>();
	public static void main(String[] args) {
		//FORMATTING OF OUTPUT WINDOW
		System.out.println();
		System.out.println("******************************************** WELCOME TO THE HOSPITAL ********************************************\n");
		System.out.println("___________________________________________  SAVE LIFE SAVE HUMANITY ____________________________________________");
		System.out.println("");		
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.println("                         Enter Your Choice of Operation\n ");
			System.out.println("1. ADD DOCTOR");
			System.out.println("2. ADD PATIENT");
			System.out.println("3. SHOW STAFF");
			System.out.println("4. SHOW PATIENT");
			System.out.println("5. DISCHARGE PATIENT");
			System.out.println("6. EXIT");
			int choice = input.nextInt();
			switch(choice) {
			case 1: 
				{
				Scanner drinput = new Scanner(System.in);
				System.out.println("Enter Information of a doctor");
				System.out.print("Enter the Name of Doctor: ");
				dr.name  = drinput.nextLine();
				
				
				System.out.print("Enter the Qualification of a Doctor: ");
				dr.qualification = drinput.nextLine();
				
				
				System.out.print("Enter the Experience of a Doctor: ");
				dr.experience = drinput.nextLine();
				
				
				System.out.print("Enter the Salary of a Doctor: ");
				dr.salary = drinput.nextInt();

				dr1.add(dr);
				
				System.out.println("-----------------------------------------------------------");
				continue;
				}
			case 2:
				{
				Scanner ptinput = new Scanner(System.in);
				System.out.println("Enter Information of a Patient");
				System.out.print("Enter the Name of Patient: ");
				pt.ptname = ptinput.nextLine();
				
				System.out.print("Enter the Ill-ness of a Patient: ");
				pt.illness = ptinput.nextLine();
				
				
				System.out.print("Enter the BloodGroup of a Patient: ");
				pt.bloodgrp = ptinput.nextLine();
				
				
				System.out.print("Enter the Age of a Patient: ");
				pt.ptage = ptinput.nextInt();			
				
				pt1.add(pt);
				System.out.println("-----------------------------------------------------------");
				continue;
				}
			case 3:
				{
				System.out.println("DOCTOR-NAME QUALIFICATION  EXPERIENCE SALARY " );
				System.out.println(dr.DoctorData());
				System.out.println("-----------------------------------------------------------");
				continue;
				}
			case 4:
				{
				System.out.println("PATIENT-NAME  ILL-NESS  BLOODGRP  AGE  ");
				System.out.println(pt.patientData());	
				System.out.println("-----------------------------------------------------------");
				continue;
				}				
			case 5:
				System.out.println("____________  COMING SOON ________________"); 
				
				System.out.println("-----------------------------------------------------------");
			case 6: System.out.println("______________ Saving the Current data of Hospital________________");
					break;
			default:
				System.out.println("Enter a Valid Choice");
				
				System.out.println("-----------------------------------------------------------");
								
			}
		}
		
		

	}

}
