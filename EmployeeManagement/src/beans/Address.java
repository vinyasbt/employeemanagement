package beans;

public class Address {
private Integer addressId;
private String addressLine1;
private String city;
private String state;
public Integer getAddressId() {
	return addressId;
}
public void setAddressId(Integer addressId) {
	this.addressId = addressId;
}
public String getAddressLine1() {
	return addressLine1;
}
public void setAddressLine1(String addressLine1) {
	this.addressLine1 = addressLine1;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
@Override
public String toString() {
	return "Address [addressId=" + addressId + ", addressLine1=" + addressLine1 + ", city=" + city + ", state=" + state
			+ "]";
}

}
