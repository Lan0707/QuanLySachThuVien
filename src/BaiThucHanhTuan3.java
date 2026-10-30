import java.util.Scanner;

public class BaiThucHanhTuan3 {
    protected String maSach;
    protected String tenSach;
    protected String tacGia;
    protected int namXuatBan;
    protected double donGia;
    protected int soLuong;
    protected int loaiSach;
    protected Scanner sc = new Scanner(System.in);
    public BaiThucHanhTuan3 (){}
    public BaiThucHanhTuan3 (String maSach, String tenSach, String tacGia, int namXuatBan, double donGia, int soLuong, int loaiSach){
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.loaiSach = loaiSach;
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
    public int getloaiSach(){
        return loaiSach;
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
    public void setloaiSach(int loaiSach){
        this.loaiSach = loaiSach;
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
        System.out.print("Nhap loai sach: ");
        this.loaiSach = this.sc.nextInt();
    }
    public void XUAT(){
        System.out.print("\n Thong tin sach: ");
        System.out.println("Ma sach: "+this.maSach);
        System.out.println("Ten sach: "+this.tenSach);
        System.out.println("Tac gia: "+this.tacGia);
        System.out.println("Nam xuat ban: "+this.namXuatBan);
        System.out.println("Don gia: "+this.donGia);
        System.out.println("So luong: "+this.soLuong);
        System.out.println("loai sach: "+this.loaiSach);
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
    public void KiemTraSach() {
        System.out.println("\n BAI 1: KIEM TRA SACH ");
        if (donGia > 0 && soLuong >= 0
                && namXuatBan > 0 && namXuatBan <= 2026) {
            System.out.println("Sach hop le");
        } else {
            System.out.println("Sach khong hop le");
        }
    }
    public void PhanLoaiGia() {
        System.out.println("\n BAI 2: PHAN LOAI GIA ");
        if (donGia < 50000) {
            System.out.println("Sach gia thap");
        } else if (donGia <= 100000) {
            System.out.println("Sach gia trung binh");
        } else if (donGia <= 200000) {
            System.out.println("Sach gia cao");
        } else {
            System.out.println("Sach gia dac biet");
        }
    }
    public void PhanLoaiTonKho() {
        System.out.println("\n BAI 3: PHAN LOAI TON KHO ");
        if (soLuong == 0) {
            System.out.println("Het sach");
        } else if (soLuong <= 5) {
            System.out.println("Sap het");
        } else if (soLuong <= 20) {
            System.out.println("Con it");
        } else {
            System.out.println("Con nhieu");
        }
    }
    public void ChonLoaiSach() {
        System.out.println("\n BAI 4: CHON LOAI SACH ");
        System.out.println("1. Sach giao khoa");
        System.out.println("2. Sach tham khao");
        System.out.println("3. Sach chuyen nganh");
        System.out.println("4. Sach khac");
        switch (loaiSach) {
            case 1:
                System.out.println("Sach giao khoa");
                break;
            case 2:
                System.out.println("Sach tham khao");
                break;
            case 3:
                System.out.println("Sach chuyen nganh");
                break;
            case 4:
                System.out.println("Sach khac");
                break;
            default:
                System.out.println("Loai sach khong hop le");
        }
    }
    public static void main(String[] args){
        BaiThucHanhTuan3 sach = new BaiThucHanhTuan3();
        sach.NHAP();
        sach.XUAT();
        System.out.println("\n Ket qua: ");
        System.out.println("Thanh tien = " + sach.ThanhTien());
        System.out.println("Phi van chuyen = " + sach.PhiVanChuyen());
        System.out.println("Tong tien nhap = " + sach.TongTienNhap());
        sach.KiemTraSach();
        sach.PhanLoaiGia();
        sach.PhanLoaiTonKho();
        sach.ChonLoaiSach();
        sach.sc.close();
    }
}