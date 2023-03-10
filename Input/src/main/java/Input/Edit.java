package Input;

public class Edit {
	
	private  String Name;
	private  String PhNo;
	private  String Email;
	private  String City;
	private  String Gender;
	private  String Pincode;
	private  String EmpType;
	public String getemail() {
		return Email;
	}
	public void setemail(String Email) {
		this.Email = Email;
	}
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	public String getPhone() {
		return PhNo;
	}
	public void setPhone(String PhNo) {
		this.PhNo = PhNo;
	}
	public String getCity() {
		return City;
	}
	public void setcity(String empcity) {
		this.City = empcity;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String empgender) {
		this.Gender = empgender;
	}
	public String getPin() {
		return Pincode;
	}
	public void setPin(String emppin) {
		this.Pincode =emppin;
	}
	public String getEmptype() {
		return EmpType;
	}
	public void setEmptype(String emptype) {
		this.EmpType = emptype;
	}
	
}