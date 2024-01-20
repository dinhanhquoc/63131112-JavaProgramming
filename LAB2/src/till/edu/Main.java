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

	public static void main(String[] args) {
		BaiTap1();
	}

}
