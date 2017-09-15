import java.util.ArrayList;

public class PatientTester {
	
	public static void main(String[] args) {
		
		ArrayList<Patient> patientList = new ArrayList<Patient>();
		patientList.add(new Patient("Ada Lovelace", 45));
		patientList.add(new Patient("Charles Babbage", 21));
		patientList.add(new ChildPatient("Pebbles Flintstone", 2, "Fred"));
		
		Patient thisPatient;
		double patientBMI;
		
		thisPatient = patientList.get(0);
		patientBMI = thisPatient.bmi(1.5, 75.0);
		System.out.println(thisPatient.getName() + "'s BMI is " + patientBMI);
		
		thisPatient = patientList.get(1);
		patientBMI = thisPatient.bmi(65.0, "in", 130.0, "lbs");
		System.out.println(thisPatient.getName() + "'s BMI is " + patientBMI);
		
		thisPatient = patientList.get(2);
		patientBMI = thisPatient.bmi(95.0, "cm", 4.5, "stone");
		System.out.println(thisPatient.getName() + "'s BMI is " + patientBMI);
		
		for (Patient currentPatient : patientList) {
			System.out.println(currentPatient.toString());
			System.out.println("Dosage: " + currentPatient.dosage());
		}
	}
}
