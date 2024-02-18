package till.edu;
import java.util.Arrays;
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
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int arr []= new int[n];
		System.out.println("Nhập các phần tử của mảng:");
		 for (int i = 0; i < n; i++) {
	            System.out.print("Phần tử thứ " + (i + 1) + ": ");
	            arr[i] = scanner.nextInt();
	        }
		 Arrays.sort(arr);
		 System.out.println("Mảng sau khi sắp xếp:");
	        for (int i = 0; i < n; i++) {
	            System.out.print(arr[i] + " ");
	        }
	        System.out.println();
	        int min = arr[0];
	        for (int i = 1; i < n; i++) {
	            min = Math.min(min, arr[i]);
	        }
	        System.out.println("Phần tử nhỏ nhất của mảng: " + min);
	        
	        // Tính và xuất trung bình cộng các phần tử chia hết cho 3
	        int sum = 0;
	        int count = 0;
	        for (int i = 0; i < n; i++) {
	            if (arr[i] % 3 == 0) {
	                sum += arr[i];
	                count++;
	            }
	        }
	        if (count > 0) {
	            double average = (double) sum / count;
	            System.out.println("Trung bình cộng các phần tử chia hết cho 3: " + average);
	        } else {
	            System.out.println("Không có phần tử nào chia hết cho 3 trong mảng.");
	        }
	    }
		
		
	

	public static void main(String[] args) {
		//BaiTap2();
		 BaiTap3();
	}

}
