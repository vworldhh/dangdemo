package cn.tedu.entity;
/*  t_address±Ì£∫µÿ÷∑±Ì
           id
           name 
           address
           email
           phone_all
           phonenumber 
 * */

public class T_Address {
    private int id;
    private String name;
    private String address;
    private String postalCode;
    
    private String phone_all;
    private String phonenumber;
	public T_Address(String name, String address, String postalCode,
			  String phoneAll, String phonenumber) {
		super();
		 
		this.name = name;
		this.address = address;
		this.postalCode = postalCode;
		 
		phone_all = phoneAll;
		this.phonenumber = phonenumber;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	 
	public String getPhone_all() {
		return phone_all;
	}
	public void setPhone_all(String phoneAll) {
		phone_all = phoneAll;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public T_Address() {
		super();
	}
	 
   
    
    
	 
}
