import java.util.ArrayList;
import java.util.Scanner;

class Sach {
    protected String maSach;
    protected String tieuDe;
    protected String tacGia;
    protected int namXuatBan;
    protected int soLuong;
    protected static Scanner sc = new Scanner(System.in);
    public Sach() {}
    public Sach(String maSach, String tieuDe, String tacGia,
                int namXuatBan, int soLuong) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
    }
    public void NHAP() {
        System.out.println("Nhap thong tin sach: ");
        System.out.print("Nhap ma sach: ");
        this.maSach = sc.nextLine();
        System.out.print("Nhap tieu de: ");
        this.tieuDe = sc.nextLine();
        System.out.print("Nhap tac gia: ");
        this.tacGia = sc.nextLine();
        System.out.print("Nhap nam xuat ban: ");
        this.namXuatBan = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap so luong: ");
        this.soLuong = Integer.parseInt(sc.nextLine());
    }
    public void HienThiTT() {
        System.out.println("Ma sach: " + this.maSach);
        System.out.println("Tieu de: " + this.tieuDe);
        System.out.println("Tac gia: " + this.tacGia);
        System.out.println("Nam xuat ban: " + this.namXuatBan);
        System.out.println("So luong: " + this.soLuong);
    }
}
public class BaiThucHanhTuan7 {
    public static void main(String[] args) {
        ArrayList<Sach> danhSachSach = new ArrayList<>();
        System.out.print("Nhap so luong sach: ");
        int n = Integer.parseInt(Sach.sc.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("\n NHAP SACH THU " + (i + 1));
            Sach sach = new Sach();
            sach.NHAP();
            danhSachSach.add(sach);
        }
        System.out.println("\nDANH SACH SACH ");
        for (int i = 0; i < danhSachSach.size(); i++) {
            System.out.println("\nSACH THU " + (i + 1));
            danhSachSach.get(i).HienThiTT();
        }
    }
}
