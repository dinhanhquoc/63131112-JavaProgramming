import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      
    }
    public static void nhapDanhSachHoTen(Scanner scanner, ArrayList<String> danhSachHoTen) {
        System.out.println("Nhập danh sách họ và tên (kết thúc bằng 'done'):");
        while (true) {
            String hoTen = scanner.nextLine();
            if (hoTen.equals("done")) {
                break;
            }
            danhSachHoTen.add(hoTen);
        }
    }

    // Chức năng 2: Xuất danh sách vừa nhập
    public static void xuatDanhSach(ArrayList<String> danhSachHoTen) {
        System.out.println("Danh sách họ và tên:");
        for (String hoTen : danhSachHoTen) {
            System.out.println(hoTen);
        }
    }

    // Chức năng 3: Xuất danh sách ngẫu nhiên
    public static void xuatDanhSachNgauNhien(ArrayList<String> danhSachHoTen) {
        System.out.println("Danh sách ngẫu nhiên:");
        Collections.shuffle(danhSachHoTen);
        xuatDanhSach(danhSachHoTen);
    }

    // Chức năng 4: Sắp xếp giảm dần và xuất danh sách
    public static void sapXepVaXuatDanhSachGiamDan(ArrayList<String> danhSachHoTen) {
        System.out.println("Danh sách sắp xếp giảm dần:");
        Collections.sort(danhSachHoTen, Collections.reverseOrder());
        xuatDanhSach(danhSachHoTen);
    }

    // Chức năng 5: Tìm và xóa họ tên
    public static void xoaHoTen(Scanner scanner, ArrayList<String> danhSachHoTen) {
        System.out.print("Nhập họ tên cần xóa: ");
        String hoTenCanXoa = scanner.nextLine();
        if (danhSachHoTen.remove(hoTenCanXoa)) {
            System.out.println("Đã xóa '" + hoTenCanXoa + "' khỏi danh sách.");
        } else {
            System.out.println("Không tìm thấy '" + hoTenCanXoa + "' trong danh sách.");
        }
    }
    public static void Bai2() {
    	
    	Scanner scanner = new Scanner(System.in);
        ArrayList<String> danhSachHoTen = new ArrayList<>();

        while (true) {
            // Menu
            System.out.println("\nChọn chức năng:");
            System.out.println("1. Nhập danh sách họ và tên");
            System.out.println("2. Xuất danh sách vừa nhập");
            System.out.println("3. Xuất danh sách ngẫu nhiên");
            System.out.println("4. Sắp xếp giảm dần và xuất danh sách");
            System.out.println("5. Tìm và xóa họ tên");
            System.out.println("6. Kết thúc");

            int luaChon = scanner.nextInt();
            scanner.nextLine(); // Đọc bộ nhớ đệm

            switch (luaChon) {
                case 1:
                    nhapDanhSachHoTen(scanner, danhSachHoTen);
                    break;
                case 2:
                    xuatDanhSach(danhSachHoTen);
                    break;
                case 3:
                    xuatDanhSachNgauNhien(danhSachHoTen);
                    break;
                case 4:
                    sapXepVaXuatDanhSachGiamDan(danhSachHoTen);
                    break;
                case 5:
                    xoaHoTen(scanner, danhSachHoTen);
                    break;
                case 6:
                    System.out.println("Kết thúc chương trình.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
            }
        }
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    }
    public static void Bai1() {
    	  Scanner scanner = new Scanner(System.in);
          ArrayList<Double> danhSach = new ArrayList<>();

          // Nhập danh sách số thực từ bàn phím
          System.out.println("Nhập danh sách số thực (nhập 'N' để kết thúc):");
          while (true) {
              System.out.print("Nhập số thực: ");
              double x = scanner.nextDouble();
              danhSach.add(x);
              System.out.print("Nhập thêm (Y/N)? ");
              scanner.nextLine(); // Đọc bộ nhớ đệm
              String tiepTuc = scanner.nextLine();
              if (tiepTuc.equalsIgnoreCase("N")) {
                  break;
              }
          }

          // Xuất danh sách vừa nhập
          System.out.println("Danh sách số thực bạn vừa nhập:");
          for (double num : danhSach) {
              System.out.println(num);
          }

          // Tính tổng của danh sách
          double tong = 0;
          for (double num : danhSach) {
              tong += num;
          }
          System.out.println("Tổng của danh sách: " + tong);

          scanner.close();
    }
}
