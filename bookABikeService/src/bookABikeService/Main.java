package bookABikeService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		VehicleService vehicleService = new VehicleService();
		
		String customerName = sc.nextLine();
		vehicleService.setCustomerName(customerName);
		
		String bikeNo =sc.nextLine();
		vehicleService.setBikeNo(bikeNo);
		
		Long phoneNo = sc.nextLong();
		vehicleService.setPhoneNo(phoneNo);
		
		String serviceType = sc.next();
		vehicleService.setServiceType(serviceType);
		
		String serviceDateInString = sc.next();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
		LocalDate serviceDate = LocalDate.parse(serviceDateInString,formatter);
		vehicleService.setServiceDate(serviceDate);
		
		Validator.validate(vehicleService);
		sc.close();
	}

}
