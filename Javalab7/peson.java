package Javalab7;

public class peson {
	protected String name;
	protected String address;
	protected String hobi;
	
	//Default Constructor
	public peson() {
		System.out.println("Inside Person:Constructor");
		name="";
		address="";
	}
	
	//Constructor dengan parameter
	public peson(String name,String address) {
		this.name = name;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setHobi(String hobi)
	{
		System.out.println("Pekerjaan "+hobi);
	}
	
	public void identity()
	{
		System.out.println("Nama: "+name);
		System.out.println("Alamat: "+address);
	}
}
