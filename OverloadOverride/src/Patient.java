import java.util.Scanner;

public class Patient {

	private String name;
	private int age;
	
	public Patient(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public double dosage() {
		return 600.0;
	}
	
	public double bmi(double heightInMeters, double weightInKilograms) {
		double bodyMassIndex = weightInKilograms / Math.pow(heightInMeters, 2);
		return bodyMassIndex;
	}
	
	public double bmi(double height, String heightUnits, double weight, String weightUnits) {	
		if (heightUnits.equals("cm")) {
			height *= 0.01; 
		}		
		if (heightUnits.equals("in")) {
			height *= 0.0254;
		}		
		if (weightUnits.equals("lbs")) {
			weight *= 0.453592;
		}		
		if (weightUnits.equals("stone")) {
			weight *= 6.35029;
		}		
		double bodyMassIndex = weight / Math.pow(height, 2);
		return bodyMassIndex;
	}
	
	public String toString() {
		return "Patient " + name + " is " + age + " years old.";
	}
}
