
public class Patient {
	String ptname;			//Patient Name
	String illness;			//Illness of Patient
	String bloodgrp;		//Patient blood group
	int ptage;				//Patient age
	
	public Patient() {
		ptname = null;
		illness = null;
		bloodgrp = null;
		ptage = 0;
	}
	
	//Parameterised constructor for patient class
	public Patient(String patname,String ptill,String bldgrp, int patage) {
		this.ptname = patname;
		this.illness = ptill;
		this.bloodgrp = bldgrp;
		this.ptage = patage;
	}
	//It returns the Patient data in a string format
	public String patientData() {
		return "" + ptname + " , " + ptage + " , " + illness + " , " + bloodgrp;
	}
}
