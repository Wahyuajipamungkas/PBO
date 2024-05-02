package Javalab7;

public class Studen extends peson{
	String nim;
	int bayar, spp, sks, modul, jumlah;
	public Studen() {
		System.out.println("Inside Student:Constructor");
		super.name="Anda";
	}
	public Studen(String nim, int bayar) {
		this.nim = nim;
		this.spp = spp;
		this.sks = sks;
		this.modul = modul;
		gettagihan(bayar);
	}
	
	public void gettagihan(int bayar) {
		jumlah = spp + sks + modul;
	}
	
	public String getNim()
	{
		return nim;
	}
	
	public String gettaguhan() {
		System.out.println("Jumlah yang harus dibayar: " + jumlah);
		return jumlah;
	}
	
	@Override
	public void identity()
	{
		System.out.println("NIM: "+getNim());
		System.out.println("Nama: "+super.name);
		System.out.println("Alamat: "+super.address);
		System.out.gettotal();
	}
	
	public void job()
	{
		System.out.println("Pekerjaan : Mahasiswa");
	}
	
	public String getName() {
		System.out.println("Student name: "+name);
		return name;
	}
		

}
