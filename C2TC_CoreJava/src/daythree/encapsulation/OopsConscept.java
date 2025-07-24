package daythree.encapsulation;

public class OopsConscept{

	private String companyName;
	private String companyAddress;
	private int companyId;
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyAddress() {
		return companyAddress;
	}
	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	@Override
	public String toString() {
		return "Encapsulation [companyName=" + companyName + ", companyAddress=" + companyAddress + ", companyId="
				+ companyId + "]";
	}
}
