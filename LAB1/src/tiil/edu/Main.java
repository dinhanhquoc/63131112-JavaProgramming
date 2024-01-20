package tiil.edu;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
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

}
