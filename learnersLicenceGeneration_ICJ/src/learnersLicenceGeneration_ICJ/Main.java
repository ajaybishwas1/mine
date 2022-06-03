package learnersLicenceGeneration_ICJ;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Long phoneNo =input.nextLong();
		String fName = input.next();
		String lName = input.next();
		String DOB = input.next();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
		LocalDate dob = LocalDate.parse(DOB,formatter);
		String state = input.next();
		String district = input.next();
		Person person = new Person(phoneNo, fName, lName, dob, state, district);
		
		List<String> learnerLicenceDetails = new Person().generateLearnerLicense(person);
		System.out.println(learnerLicenceDetails);
		input.close();
		
		
		
		
	}
}
