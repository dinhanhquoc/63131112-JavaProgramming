import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
	        SanPham sp = new SanPham("Áo thun", 200, 20); // Khởi tạo một sản phẩm mới

	        
	       
	        SanPham sp1 = new SanPham("Áo thun", 2300, 20);
	        SanPham sp2 = new SanPham("Áo thun", 2400, 20);

	      
	        System.out.println("Nhập thông tin cho sản phẩm 1:");
	        sp1.nhap();

	     
	        System.out.println("Nhập thông tin cho sản phẩm 2:");
	        sp2.nhap();

	       
	        System.out.println("\nThông tin của sản phẩm 1:");
	        sp1.xuat();

	       
	        System.out.println("\nThông tin của sản phẩm 2:");
	        sp2.xuat();

	      
	    }
}
