package till.edu;
import java.util.Scanner;
public class Main {
	
	 private static boolean checkPrime(int N) {
	        if (N <= 1) {
	            return false; 
	        }

	        boolean isPrime = true;
	        for (int i = 2; i <= Math.sqrt(N); i++) {
	            if (N % i == 0) {
	                isPrime = false;
	                break;
	            }
	        }

	        return isPrime;
	    }
	 public static void BaiTap1() {
		 
		 
			Scanner scanner = new Scanner(System.in);
	        System.out.print("Nhập một số nguyên: ");
	        int N = scanner.nextInt();
	        boolean isPrime = checkPrime(N);
	        if (isPrime) {
	            System.out.println(N + " là số nguyên tố.");
	        } else {
	            System.out.println(N + " không là số nguyên tố.");
	        }
	        scanner.close();

	 }
	 public static void BaiTap2() {
	 // Xuất bảng cửu chương từ 1 đến 9
     for (int i = 1; i <= 9; i++) {
         System.out.println("Bảng cửu chương " + i + ":");
         for (int j = 1; j <= 10; j++) {
        	  System.out.println(i + " x " + j + " = " + (i * j));
         }
         System.out.println();
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
	

	public static void main(String[] args) {
		//BaiTap2();
		 BaiTap3();
	}

}
