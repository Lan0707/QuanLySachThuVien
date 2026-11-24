import java.util.ArrayList;
import java.util.Scanner;

abstract class Sach {
    protected String maSach;
    protected String ngayNhap;
    protected double donGia;
    protected int soLuong;
    protected String nhaXuatBan;
    protected static Scanner sc = new Scanner(System.in);
    public Sach() {}
    public Sach(String maSach, String ngayNhap, double donGia,
                int soLuong, String nhaXuatBan) {
        this.maSach = maSach;
        this.ngayNhap = ngayNhap;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.nhaXuatBan = nhaXuatBan;
    }
    public void nhap() {
        System.out.print("Nhap ma sach: ");
        maSach = sc.nextLine();
        System.out.print("Nhap ngay nhap: ");
        ngayNhap = sc.nextLine();
        System.out.print("Nhap don gia: ");
        donGia = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap so luong: ");
        soLuong = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap nha xuat ban: ");
        nhaXuatBan = sc.nextLine();
    }
    public void xuat() {
        System.out.println("Ma sach: " + maSach);
        System.out.println("Ngay nhap: " + ngayNhap);
        System.out.println("Don gia: " + donGia);
        System.out.println("So luong: " + soLuong);
        System.out.println("Nha xuat ban: " + nhaXuatBan);
        System.out.println("Thanh tien: " + thanhTien());
    }
    public abstract double thanhTien();
}
class SachGiaoKhoa extends Sach {
    private String tinhTrang;
    public SachGiaoKhoa() {}
    @Override
    public void nhap() {
        super.nhap();
        System.out.print("Nhap tinh trang (Moi/Cu): ");
        tinhTrang = sc.nextLine();
    }
    @Override
    public double thanhTien() {
        if (tinhTrang.equalsIgnoreCase("Moi")) {
            return soLuong * donGia;
        } else {
            return soLuong * donGia * 0.5;
        }
    }
    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Tinh trang: " + tinhTrang);
    }
    public String getNhaXuatBan() {
        return nhaXuatBan;
    }
}
class SachThamKhao extends Sach {
    private double thue;
    public SachThamKhao() {}
    @Override
    public void nhap() {
        super.nhap();
        System.out.print("Nhap thue: ");
        thue = Double.parseDouble(sc.nextLine());
    }
    @Override
    public double thanhTien() {
        return soLuong * donGia + thue;
    }
    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Thue: " + thue);
    }
}
public class BaiThucHanhTuan9 {
    public static void main(String[] args) {
        ArrayList<SachGiaoKhoa> dsSGK = new ArrayList<>();
        ArrayList<SachThamKhao> dsSTK = new ArrayList<>();
        int n;
        System.out.print("Nhap so luong sach giao khoa: ");
        n = Integer.parseInt(Sach.sc.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("\nNhap sach giao khoa thu " + (i + 1));
            SachGiaoKhoa s = new SachGiaoKhoa();
            s.nhap();
            dsSGK.add(s);
        }
        System.out.print("\nNhap so luong sach tham khao: ");
        n = Integer.parseInt(Sach.sc.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("\nNhap sach tham khao thu " + (i + 1));
            SachThamKhao s = new SachThamKhao();
            s.nhap();
            dsSTK.add(s);
        }
        System.out.println("\n DANH SACH SACH GIAO KHOA ");
        for (SachGiaoKhoa s : dsSGK) {
            s.xuat();
        }
        System.out.println("\n DANH SACH SACH THAM KHAO ");
        for (SachThamKhao s : dsSTK) {
            s.xuat();
        }
        double tongSGK = 0;
        for (SachGiaoKhoa s : dsSGK) {
            tongSGK += s.thanhTien();
        }
        System.out.println("\nTong thanh tien sach giao khoa: " + tongSGK);
        double tongSTK = 0;
        double tongDonGia = 0;
        for (SachThamKhao s : dsSTK) {
            tongSTK += s.thanhTien();
            tongDonGia += s.donGia;
        }
        System.out.println("Tong thanh tien sach tham khao: " + tongSTK);
        if (dsSTK.size() > 0) {
            double trungBinh = tongDonGia / dsSTK.size();
            System.out.println("Trung binh cong don gia sach tham khao: " + trungBinh);
        } else {
            System.out.println("Khong co sach tham khao.");
        }
        System.out.println("\n SACH GIAO KHOA CUA NHA XUAT BAN X ");
        for (SachGiaoKhoa s : dsSGK) {
            if (s.getNhaXuatBan().equalsIgnoreCase("X")) {
                s.xuat();
            }
        }
    }
}