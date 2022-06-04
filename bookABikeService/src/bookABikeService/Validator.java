package bookABikeService;

import java.time.LocalDate;

public class Validator {
	
	public static void validate(VehicleService vehicleService) {
		System.out.println(isValidCustomerName(vehicleService.getCustomerName()));
		System.out.println(isValidBikeNo(vehicleService.getBikeNo()));
		System.out.println(isValidPhoneNo(vehicleService.getPhoneNo()));
		System.out.println(isValidServiceType(vehicleService.getServiceType()));
		System.out.println(isValidServiceDate(vehicleService.getServiceDate()));
	}
	
	public static Boolean isValidCustomerName(String customerName) {
		String regex = "[A-Z][a-z]*";
		if(customerName.matches(regex))
			return true;
		return false;
	}

	public static Boolean isValidBikeNo(String bikeNo) {
		String regex = "[A-Z]{2}[0-9]{2}[A-Z]{2}[0-9]{4}";
		if(bikeNo.matches(regex))
			return true;
		return false;
	}
	
	public static Boolean isValidPhoneNo(Long phoneNo) {
		String regex1 ="[1-9][0-9]{9}";
        String regex2 = "(\\d)\\1{9}";
		if(phoneNo.toString().matches(regex1) && !phoneNo.toString().matches(regex2))
			return true;
		return false;
	}
	public static Boolean isValidServiceType(String serviceType) {
		if(serviceType.equalsIgnoreCase("General")|| serviceType.equalsIgnoreCase("Express"))
			return true;
		return false;
	}
	public static Boolean isValidServiceDate(LocalDate lastServiceDate) {
		LocalDate today = LocalDate.now();
		if(lastServiceDate.isAfter(today)!=true && !lastServiceDate.equals(today))
			return true;
		return false;
	}
}
