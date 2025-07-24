package day3.constructor;

public class customer {
	
	int customerId;
	String customerName;
	String customerCity;
	
	//default
	public customer() {
		
		
	}
	
	//parametrised
	public customer(int customerId,String customerName,String customerCity) {
		
		this.customerId=customerId;
		this.customerName=customerName;
		this.customerCity=customerCity;	
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerCity() {
		return customerCity;
	}

	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}

	@Override
	public String toString() {
		return "customer [customerId=" + customerId + ", customerName=" + customerName + ", customerCity="
				+ customerCity + "]";
	}
	
	

}
