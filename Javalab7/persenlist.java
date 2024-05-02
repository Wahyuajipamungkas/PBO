package Javalab7;
import java.util.Scanner;
import Javalab7.Studen;

public class persenlist {

	public static void Studen(String[] args) {
		String name, address, nim, hobi;
		int bayar, sks, spp, modul, jumlah;
		  Scanner keyi = new Scanner(System.in);
		  
		  System.out.println("Data Identitas Mahasiswa");
		  System.out.println("Nama Mahasiswa: ");
		  name = keyi.nextLine();
		  System.out.println("Nim Mahasiswa: ");
		  nim = keyi.nextLine();
		  System.out.println("Alamat: ");
		  address = keyi.nextLine();
		  System.out.println("Hobi: ");
		  hobi = keyi.nextLine();
		  System.out.println("SKS: ");
		  sks = keyi.nextInt();
		  System.out.println("SPP: ");
		  spp = keyi.nextInt();
		  System.out.println("Modul: ");
		  modul = keyi.nextInt();
		  
		  System.out.println("--------------------");
	        System.out.println("Nama Mahasiswa: " + name);
	        System.out.println("Nim Mahasiswa: " + nim);
	        System.out.println("Alamat: " + address);
	        System.out.println("Hobi: " + hobi);
	        System.out.println("Jumlah SKS: " + sks);
	        System.out.println("Biaya SPP: " + spp);
	        System.out.println("Harga Modul: " + modul);
	        System.out.identity();
		// TODO Auto-generated method stub

	}

}
