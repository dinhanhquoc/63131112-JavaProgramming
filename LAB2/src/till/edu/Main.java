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
        
        // Nhập số lượng phần tử của mảng
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();
        
        // Khởi tạo mảng
        int[] arr = new int[n];
        
        // Nhập các phần tử của mảng từ bàn phím
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        
        // Sắp xếp mảng
        Arrays.sort(arr);
        
        // Xuất mảng đã sắp xếp ra màn hình
        System.out.println("Mảng sau khi sắp xếp:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        // Tìm và xuất phần tử nhỏ nhất của mảng
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
	public static void BaiTap4() {
		
Scanner scanner = new Scanner(System.in);
        
        // Nhập số lượng sinh viên
        System.out.print("Nhập số lượng sinh viên: ");
        int n = scanner.nextInt();
        
        // Khởi tạo mảng họ tên và điểm
        String[] hoTen = new String[n];
        double[] diem = new double[n];
        
        // Nhập thông tin họ tên và điểm của sinh viên
        for (int i = 0; i < n; i++) {
            scanner.nextLine(); // Đọc bỏ dòng trống
            System.out.print("Nhập họ tên của sinh viên thứ " + (i + 1) + ": ");
            hoTen[i] = scanner.nextLine();
            System.out.print("Nhập điểm của sinh viên thứ " + (i + 1) + ": ");
            diem[i] = scanner.nextDouble();
        }
        
        // Xuất thông tin của từng sinh viên kèm học lực
        System.out.println("Thông tin của các sinh viên:");
        for (int i = 0; i < n; i++) {
            System.out.println("Sinh viên thứ " + (i + 1));
            System.out.println("Họ tên: " + hoTen[i]);
            System.out.println("Điểm: " + diem[i]);
            System.out.println("Học lực: " + xepLoai(diem[i]));
        }
    }
    
    // Phương thức xếp loại học lực
    public static String xepLoai(double diem) {
        if (diem < 5) {
            return "Yếu";
        } else if (diem < 6.5) {
            return "Trung bình";
        } else if (diem < 7.5) {
            return "Khá";
        } else if (diem < 9) {
            return "Giỏi";
        } else {
            return "Xuất sắc";
        }
    }
	
		
	

	public static void main(String[] args) {
		 BaiTap4();
	}

}
