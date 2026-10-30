import java.util.Scanner;

public class BaiThucHanhTuan3 {
    protected String maSach;
    protected String tenSach;
    protected String tacGia;
    protected int namXuatBan;
    protected double donGia;
    protected int soLuong;
    protected Scanner sc = new Scanner(System.in);
    public BaiThucHanhTuan3 (){}
    public BaiThucHanhTuan3 (String maSach, String tenSach, String tacGia, int namXuatBan, double donGia, int soLuong){
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }
    public String getmaSach(){
        return maSach;
    }
    public String gettenSach(){
        return tenSach;
    }
    public String gettacGia(){
        return tacGia;
    }
    public int getnamXuatBan(){
        return namXuatBan;
    }
    public double getdonGia(){
        return donGia;
    }
    public int getsoLuong(){
        return soLuong;
    }

    public void setmaSach(String maSach){
        this.maSach = maSach;
    }
    public void settenSach(String tenSach){
        this.tenSach = tenSach;
    }
    public void settacGia(String tacGia){
        this.tacGia = tacGia;
    }
    public void setnamXuatBan(int namXuatBan){
        this.namXuatBan = namXuatBan;
    }
    public void setdonGia(double donGia){
        this.donGia = donGia;
    }
    public void setsoLuong(int soLuong){
        this.soLuong = soLuong;
    }
    public void NHAP(){
        // BÀI 1: Nhập thông tin sách
        System.out.print("Nhap thong tin sach: \n");
        System.out.print("Nhap ma sach: ");
        this.maSach = this.sc.nextLine();
        System.out.print("Nhap ten sach: ");
        this.tenSach = this.sc.nextLine();
        System.out.print("Nhap ten tac gia: ");
        this.tacGia = this.sc.nextLine();
        System.out.print("Nhap nam xuat ban: ");
        this.namXuatBan = this.sc.nextInt();
        System.out.print("Nhap don gia: ");
        this.donGia = this.sc.nextDouble();
        System.out.print("Nhap so luong: ");
        this.soLuong = this.sc.nextInt();
    }
    public void XUAT(){
        System.out.print("\n Thong tin sach: ");
        System.out.println("Ma sach: "+this.maSach);
        System.out.println("Ten sach: "+this.tenSach);
        System.out.println("Tac gia: "+this.tacGia);
        System.out.println("Nam xuat ban: "+this.namXuatBan);
        System.out.println("Don gia: "+this.donGia);
        System.out.println("So luong: "+this.soLuong);
    }
    public double ThanhTien() {
        return this.donGia * this.soLuong;
    }
    public double PhiVanChuyen() {
        return ThanhTien() * 0.05;
    }
    public double TongTienNhap() {
        return ThanhTien() + PhiVanChuyen();
    }
    public static void main(String[] args){
        BaiThucHanhTuan3 sach = new BaiThucHanhTuan3();
        sach.NHAP();
        sach.XUAT();
        System.out.println("\n Ket qua: ");
        System.out.println("Thanh tien = " + sach.ThanhTien());
        System.out.println("Phi van chuyen = " + sach.PhiVanChuyen());
        System.out.println("Tong tien nhap = " + sach.TongTienNhap());
    }
}