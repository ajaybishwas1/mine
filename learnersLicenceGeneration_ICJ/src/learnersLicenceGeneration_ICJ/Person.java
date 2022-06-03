package learnersLicenceGeneration_ICJ;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Person {

	private long phoneNo;
	private String firstName;
	private String lastName;
	private LocalDate DOB;
	private String state;
	private String district;
	
	public Person() {
	
	}

	public Person(long phoneNo, String firstName, String lastName, LocalDate dOB, String state, String district) {
		super();
		this.phoneNo = phoneNo;
		this.firstName = firstName;
		this.lastName = lastName;
		DOB = dOB;
		this.state = state;
		this.district = district;
	}
	
	

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getDOB() {
		return DOB;
	}

	public void setDOB(LocalDate dOB) {
		DOB = dOB;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}
	
	@Override
	public String toString() {
		return "Person [phoneNo=" + phoneNo + ", firstName=" + firstName + ", lastName=" + lastName + ", DOB=" + DOB
				+ ", state=" + state + ", district=" + district + "]";
	}

	private static Map<String,String> stateCodeDetails(){
		Map<String,String> stateCodeMap = new HashMap<>();
		stateCodeMap.put("Karnataka", "KA");
		stateCodeMap.put("Kerla", "KL");
		stateCodeMap.put("Maharastra", "MH");
		stateCodeMap.put("Tamilnadu", "TN");
		stateCodeMap.put("Andhrapradesh", "AP");
		stateCodeMap.put("Odisha", "OD");
		return stateCodeMap;
	}

	private static int calculateAge(LocalDate DOB) {
		return Period.between(DOB, LocalDate.now()).getYears();
	}
	
	public List<String> generateLearnerLicense(Person person){
		List<String> learnerLicenceDetails = new ArrayList<String>();
		int age = calculateAge(person.DOB);
		if(age<18)
		{
			String error= "Learner License can't be generated as age is less than 18";
			learnerLicenceDetails.add(error);
			return learnerLicenceDetails;
		}
		else
		{
			String fullName=person.firstName +" "+person.lastName;
			learnerLicenceDetails.add(fullName);
			learnerLicenceDetails.add(Integer.toString(age));
			
			Map<String,String> stateCodeDetails = stateCodeDetails();
			String stateCodeOfThePerson = null;
			
			Iterator it = stateCodeDetails.entrySet().iterator();
			while(it.hasNext()) {
				Map.Entry map = (Map.Entry)it.next();
				if(person.getState().equals(map.getKey()))
				{
					stateCodeOfThePerson = (String) map.getValue();
				}
			}
			if(stateCodeOfThePerson==null)
			{
				String error = "Your state not found in our DB, So the LL can't be generated";
				learnerLicenceDetails.removeAll(learnerLicenceDetails);
				learnerLicenceDetails.add(error);
				return learnerLicenceDetails;
			}
			
			String districtCode = person.getDistrict().substring(0,2).toUpperCase();
			String learnerLicenseNumber = stateCodeOfThePerson +"-"+districtCode +"-"+person.getPhoneNo();
			learnerLicenceDetails.add(learnerLicenseNumber);
		}
		
		LocalDate validity = person.DOB.plusYears(40);
		learnerLicenceDetails.add(validity.toString());
		String success ="Your driving test will be scheduled within next 7 days.";
		learnerLicenceDetails.add(success);
		return learnerLicenceDetails;
	}
	
}
