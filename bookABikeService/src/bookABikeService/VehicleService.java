package bookABikeService;

import java.time.LocalDate;

public class VehicleService {

	private String customerName;
	private String bikeNo;
	private Long phoneNo;
	private String serviceType;
	private LocalDate serviceDate;
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getBikeNo() {
		return bikeNo;
	}
	public void setBikeNo(String bikeNo) {
		this.bikeNo = bikeNo;
	}
	public Long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(Long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getServiceType() {
		return serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
	public LocalDate getServiceDate() {
		return serviceDate;
	}
	public void setServiceDate(LocalDate serviceDate) {
		this.serviceDate = serviceDate;
	}
	@Override
	public String toString() {
		return "VehicleService [customerName=" + customerName + ", bikeNo=" + bikeNo + ", phoneNo=" + phoneNo
				+ ", serviceType=" + serviceType + ", serviceDate=" + serviceDate + "]";
	}
	

}
