package till.edu;

import java.util.Scanner;

public class Main {
	public static void BaiTap1() {
		
		
		  Scanner scanner = new Scanner(System.in);

	        // Nhập hệ số a và b từ bàn phím
	        System.out.print("Nhập hệ số a: ");
	        double a = scanner.nextDouble();
	        System.out.print("Nhập hệ số b: ");
	        double b = scanner.nextDouble();

	        // Kiểm tra và giải phương trình bậc nhất
	        if (a == 0) {
	            if (b == 0) {
	                System.out.println("Phương trình có vô số nghiệm.");
	            } else {
	                System.out.println("Phương trình vô nghiệm.");
	            }
	        } else {
	            double x = -b / a;
	            System.out.println("Nghiệm của phương trình là: " + x);
	        }
	}
	public static void BaiTap2() {
		
		
		 Scanner scanner = new Scanner(System.in);

	        // Nhập các hệ số a, b và c từ bàn phím
	        System.out.print("Nhập hệ số a: ");
	        double a = scanner.nextDouble();
	        System.out.print("Nhập hệ số b: ");
	        double b = scanner.nextDouble();
	        System.out.print("Nhập hệ số c: ");
	        double c = scanner.nextDouble();

	        // Xét giá trị của hệ số a
	        if (a == 0) {
	            // Giải phương trình bậc nhất
	            if (b == 0) {
	                if (c == 0) {
	                    System.out.println("Phương trình có vô số nghiệm.");
	                } else {
	                    System.out.println("Phương trình vô nghiệm.");
	                }
	            } else {
	                double x = -c / b;
	                System.out.println("Nghiệm của phương trình là: " + x);
	            }
	        } else {
	            // Tính delta
	            double delta = b * b - 4 * a * c;

	            // Xét các trường hợp của delta
	            if (delta < 0) {
	                System.out.println("Phương trình vô nghiệm.");
	            } else if (delta == 0) {
	                double x = -b / (2 * a);
	                System.out.println("Phương trình có nghiệm kép: x = " + x);
	            } else {
	                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
	                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
	                System.out.println("Phương trình có 2 nghiệm phân biệt:");
	                System.out.println("x1 = " + x1);
	                System.out.println("x2 = " + x2);
	            }
	        }
	}
	public static void BaiTap3() {

		
		int tiendien = 0 ;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Mời bạn nhập số tiền điện: ");
		tiendien = scanner.nextInt();
		if(tiendien<=50 ) {
			System.out.println("Số tiền điện phải trả là "+tiendien*1000);
		}else {
			System.out.println("Số tiền điện phải trả là "+tiendien*1200);
		}
		
	}
	public static void BaiTap4() {
		System.out.println("\n");
		Scanner scanner = new Scanner(System.in);
		int option=-1;
		while(option !=4 ) {
		System.out.println("1 - Giải phương trình bậc nhất ");
		System.out.println("2 - Giải phương trình bậc hai ");
		System.out.println("3 - Tính tiền điện ");
		System.out.println("4 - Thoát chương trình");
		System.out.println("----------------------------");
		System.out.println("Hãy chọn chức năng");
			option = scanner.nextInt();
			switch(option) {
			case 1: {
				BaiTap1();
				break;
			}
			case 2: {
				BaiTap2();
				break;
			}
			case 3: {
				BaiTap3();
				break;
			}
			case 4: {
				System.out.println("Đã Thoát Chương Trình");
				break;
			}
			
			}
	}
		}
	public static void main(String[] args) {
		BaiTap4();
	}
}
