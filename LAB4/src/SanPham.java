import java.util.Scanner;

public class SanPham {
	private String tenSp;
    private double donGia;
    private double giamGia;
    public SanPham(String tenSp, double donGia, double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }
    
    public String getTenSp() {
        return this.tenSp;
    }

    // Phương thức setter cho tenSp
    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    // Phương thức getter cho donGia
    public double getDonGia() {
        return this.donGia;
    }

    // Phương thức setter cho donGia
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    // Phương thức getter cho giamGia
    public double getGiamGia() {
        return this.giamGia;
    }
    public double getThueNhapKhau() {
        return 0.1 * donGia; // 10% giá sản phẩm
    }
    
    public void xuat() {
        System.out.println("Tên sản phẩm: " + tenSp);
        System.out.println("Đơn giá: " + donGia);
        System.out.println("Giảm giá: " + giamGia);
        System.out.println("Thuế nhập khẩu: " + getThueNhapKhau());
    }
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm: ");
        tenSp = scanner.nextLine();
        System.out.print("Nhập đơn giá: ");
        donGia = scanner.nextDouble();
        System.out.print("Nhập giảm giá: ");
        giamGia = scanner.nextDouble();
    }
    public SanPham(String tenSp, double donGia) {
        this(tenSp, donGia, 0); // Gọi hàm tạo có tham số
    }

  
 
}
