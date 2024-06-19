/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaConek;
import java.sql.*;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Koneksi {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/pbo";
    static final String USER = "root";
    static final String PASS = "";
    
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;
    
public static void main(String[] args) {
        
        insert();
        show();
        edit();
        delete();
        
    }

public static void insert()
	{
		int n;
                Scanner inp = new Scanner(System.in);
                n = inp.nextInt();
                
                int id;
                String Judul_buku;
                int tahun_terbit;
                int stok;
                int penulis;
                
                System.out.println("Masukkan ID Buku: ");
                id = inp.nextInt();
                System.out.println("Masukkan Judul Buku: ");
                Judul_buku = inp.next();
                System.out.println("Masukkan Tahun Terbit Buku: ");
                tahun_terbit = inp.nextInt();
                System.out.println("Masukkan Stok Buku: ");
                stok = inp.nextInt();
                System.out.println("Masukkan Penulis Buku: ");
                penulis = inp.nextInt();
		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL,USER,PASS);
			stmt = conn.createStatement();
			
			String sql = "INSERT INTO buku (id,Judul_buku,tahun_terbit,stok,penulis) VALUES (?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setInt(1, id);
			ps.setString(2, Judul_buku);
			ps.setInt(3, tahun_terbit);
			ps.setInt(4, stok);
			ps.setInt(5, penulis);
			
			ps.execute();
			
			stmt.close();
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void show()
	{
		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL,USER,PASS);
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery("SELECT * FROM buku");
			int i = 1;
			while(rs.next())
			{
				System.out.println("Data ke-"+i);
				System.out.println("ID: " + rs.getString("id"));
				System.out.println("Judul Buku: "+rs.getString("Judul_buku"));
				System.out.println("Tahun Terbit: "+rs.getString("tahun_terbit"));
				System.out.println("Stok: "+rs.getString("stok"));
				System.out.println("Penulis: "+rs.getString("penulis"));
				i++;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
        public static void delete(){
        
        }
        
        public static void edit(){
            
        }

}
