import java.util.Scanner;

public class BaiThucHanhTuan3 {
    protected String maSach;
    protected String tenSach;
    protected String tacGia;
    protected int namXuatBan;
    protected double donGia;
    protected int soLuong;
    protected int loaiSach;
    protected static Scanner sc = new Scanner(System.in);
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
        System.out.println("\n CHON LOAI SACH ");
        System.out.println("1. Sach giao khoa");
        System.out.println("2. Sach tham khao");
        System.out.println("3. Sach chuyen nganh");
        System.out.println("4. Sach khac");
        System.out.print("Nhap loai sach: ");
        this.loaiSach = this.sc.nextInt();
        sc.nextLine();
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
        System.out.println("\n KIEM TRA SACH ");
        if (donGia > 0 && soLuong >= 0
                && namXuatBan > 0 && namXuatBan <= 2026) {
            System.out.println("Sach hop le");
        } else {
            System.out.println("Sach khong hop le");
        }
    }
    public void PhanLoaiGia() {
        System.out.println("\n PHAN LOAI GIA ");
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
        System.out.println("\n PHAN LOAI TON KHO ");
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
    public void XuatDanhSach(BaiThucHanhTuan3[] dsSach, int n){
        for (int i = 0; i < n; i++) {
            System.out.println("\n SACH THU " + (i + 1) );
            dsSach[i].XUAT();
        }
    }
    public void ThongKe(BaiThucHanhTuan3[] dsSach, int n){
        int tongSoLuong = 0;
        double tongGiaTri = 0;
        for (int i = 0; i < n; i++) {
            tongSoLuong += dsSach[i].getsoLuong();
            tongGiaTri += dsSach[i].ThanhTien();
        }
        System.out.println("\n THONG KE SACH ");
        System.out.println("Tong so luong sach: " + tongSoLuong);
        System.out.println("Tong gia tri sach: " + tongGiaTri);
    }
    public void TimSach(BaiThucHanhTuan3[] dsSach, int n) {
        System.out.print("Nhap ma sach can tim: ");
        String maCanTim = sc.nextLine();
        boolean timThay = false;
        for (int i = 0; i < n; i++) {
            if (dsSach[i].getmaSach().equalsIgnoreCase(maCanTim)) {
                System.out.println("\nTim thay sach!");
                dsSach[i].XUAT();
                timThay = true;
                break;
            }
        }
        if (timThay == false) {
            System.out.println("Khong tim thay sach!");
        }
    }
    public static void main(String[] args){
        System.out.print("Nhap so luong sach: ");
        int n = sc.nextInt();
        sc.nextLine();
        BaiThucHanhTuan3[] dsSach = new BaiThucHanhTuan3[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\n NHAP SACH THU " + (i + 1) );
            dsSach[i] = new BaiThucHanhTuan3();
            dsSach[i].NHAP();
            dsSach[i].KiemTraSach();
            dsSach[i].PhanLoaiGia();
            dsSach[i].PhanLoaiTonKho();
            dsSach[i].ChonLoaiSach();
        }
        int chon;
        do {
            System.out.println("\n MENU QUAN LY THU VIEN ");
            System.out.println("1. Xuat danh sach sach");
            System.out.println("2. Thong ke so luong va gia tri sach");
            System.out.println("3. Tim sach theo ma");
            System.out.println("0. Thoat\n");
            System.out.print("Nhap lua chon: ");
            chon = sc.nextInt();
            sc.nextLine();
            switch (chon) {
                case 1:
                    dsSach[0].XuatDanhSach(dsSach, n);
                    break;
                case 2:
                    dsSach[0].ThongKe(dsSach, n);
                    break;
                case 3:
                    dsSach[0].TimSach(dsSach, n);
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (chon != 0);
    }
};