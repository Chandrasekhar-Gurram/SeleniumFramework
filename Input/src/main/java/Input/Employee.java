package Input;

import javax.sound.midi.MidiDevice.Info;

public class Employee {
private String userName;
private Long PhNo;
private String Gender;
private String EmpType;
private int Pincode;
public String getGender() {
	return Gender;
}
public void setGender(String gender) {
	Gender = gender;
}
public String getEmpType() {
	return EmpType;
}
public void setEmpType(String EmpType) {
	EmpType = EmpType;
}
public int getPincode() {
	return Pincode;
}
public void setPhNo(Long phNo) {
	PhNo = phNo;
}
public Long getPhNo() {
	return PhNo;
}
public void setPhNo(long l) {
	PhNo = l;
}
private String email;
private String city;
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public void setPincode(int int1) {
	// TODO Auto-generated method stub
	
}
}
