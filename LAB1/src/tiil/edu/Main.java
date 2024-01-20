package tiil.edu;
import java.util.Scanner;

public class Main {

	public static void BaiTap1() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Họ và tên: ");
		String hoTen = scanner.nextLine();
		System.out.print("Điểm TB: ");
		double diemTB = scanner.nextDouble();
		System.out.println("Họ và tên: " + hoTen);
		System.out.println("Điểm TB: " + diemTB);
		System.out.println("-------------------");
		System.out.print("Họ và tên: "+hoTen);
		System.out.println(" Điểm TB: "+diemTB);
		System.out.println("-------------------");
		System.out.printf("Họ và tên: %s%n", new Object[] { hoTen });
		scanner.close();	
	}
	//Hàm tính toán số liệu của bài tập 2
	 	private static double calculateChuVi(double dai, double rong) {
	        return (dai + rong) * 2;
	    }    
	    private static double calculateDienTich(double dai, double rong) {
	        return dai * rong;
	    }  
	    private static double calculateCanhNhoNhat(double dai, double rong) {
	        return Math.min(dai, rong);
	    }
	public static void BaiTap2() {
			Scanner scanner = new Scanner(System.in);
	        System.out.print("Nhập chiều dài của hình chữ nhật: ");
	        double dai = scanner.nextDouble();
	        System.out.print("Nhập chiều rộng của hình chữ nhật: ");
	        double rong = scanner.nextDouble();
	        double chuVi = calculateChuVi(dai, rong);
	        double dienTich = calculateDienTich(dai, rong);
	        double canhNhoNhat = calculateCanhNhoNhat(dai, rong);
	        System.out.println("Chu vi: " + chuVi);
	        System.out.println("Diện tích: " + dienTich);
	        System.out.println("Cạnh nhỏ nhất: " + canhNhoNhat);
	        scanner.close();
		
		
	}
	
	 private static double calculateTheTich(double canh) {
	        // Cách 1: Sử dụng công thức cơ bản
	        double theTich = canh * canh * canh;

	        // Cách 2: Sử dụng hàm Math.pow()
	        // double theTich = Math.pow(canh, 3);

	        return theTich;
	    }

	public static void BaiTap3() {
		
		 	Scanner scanner = new Scanner(System.in);
	        System.out.print("Nhập chiều dài cạnh của khối lập phương: ");
	        double canh = scanner.nextDouble(); 
	        double theTich = calculateTheTich(canh);  
	        System.out.println("Thể tích của khối lập phương: " + theTich);	      
	        scanner.close();
	}
	
	
	public static void main(String[] args) {
		//BaiTap1();
		//BaiTap2();
		BaiTap3();
	}

}
