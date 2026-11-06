import java.util.ArrayList;
import java.util.Scanner;

public class BaiThucHanhTuan5 {
    static Scanner sc = new Scanner(System.in);
    public static void Mang() {
        int[] soLuong = new int[5];
        int tong = 0;
        int lonNhat = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Nhap so luong sach thu " + (i + 1) + ": ");
            soLuong[i] = Integer.parseInt(sc.nextLine());
            tong += soLuong[i];
            if (i == 0 || soLuong[i] > lonNhat) {
                lonNhat = soLuong[i];
            }
        }
        System.out.println("\nDanh sach so luong:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Sach thu " + (i + 1) + ": " + soLuong[i]);
        }
        System.out.println("Tong so luong: " + tong);
        System.out.println("So luong lon nhat: " + lonNhat);
    }
    public static void LuuMS() {
        ArrayList<String> danhSachMa = new ArrayList<>();
        int chon;
        do {
            System.out.println("\n QUAN LY MA SACH ");
            System.out.println("1. Them ma sach");
            System.out.println("2. Hien thi ma sach");
            System.out.println("3. Tim ma sach");
            System.out.println("4. Xoa ma sach");
            System.out.println("0. Quay lai");
            System.out.print("Nhap lua chon: ");
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    System.out.print("Nhap ma sach: ");
                    String maThem = sc.nextLine();
                    if (danhSachMa.contains(maThem)) {
                        System.out.println("Ma sach da ton tai!");
                    } else {
                        danhSachMa.add(maThem);
                        System.out.println("Them thanh cong!");
                    }
                    break;
                case 2:
                    if (danhSachMa.isEmpty()) {
                        System.out.println("Danh sach ma sach dang trong!");
                    } else {
                        for (String ma : danhSachMa) {
                            System.out.println(ma);
                        }
                    }
                    break;
                case 3:
                    System.out.print("Nhap ma sach can tim: ");
                    String maTim = sc.nextLine();
                    if (danhSachMa.contains(maTim)) {
                        System.out.println("Tim thay ma sach!");
                    } else {
                        System.out.println("Khong tim thay ma sach!");
                    }
                    break;

                case 4:
                    System.out.print("Nhap ma sach can xoa: ");
                    String maXoa = sc.nextLine();

                    if (danhSachMa.remove(maXoa)) {
                        System.out.println("Xoa thanh cong!");
                    } else {
                        System.out.println("Ma sach khong ton tai!");
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (chon != 0);
    }
    static ArrayList<String> danhSachSach = new ArrayList<>();
    public static int TimViTri(String maSach) {
        for (int i = 0; i < danhSachSach.size(); i++) {
            String[] tt = danhSachSach.get(i).split("\\|", -1);
            if (tt[0].equalsIgnoreCase(maSach)) {
                return i;
            }
        }
        return -1;
    }
    public static void ThemSach() {
        System.out.print("Nhap ma sach: ");
        String ma = sc.nextLine();
        if (TimViTri(ma) != -1) {
            System.out.println("Ma sach da ton tai!");
            return;
        }
        System.out.print("Nhap ten sach: ");
        String ten = sc.nextLine();
        System.out.print("Nhap tac gia: ");
        String tacGia = sc.nextLine();
        System.out.print("Nhap nam xuat ban: ");
        int nam = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap don gia: ");
        double gia = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap so luong: ");
        int soLuong = Integer.parseInt(sc.nextLine());
        System.out.println("1. Sach giao khoa");
        System.out.println("2. Sach tham khao");
        System.out.println("3. Sach chuyen nganh");
        System.out.println("4. Sach khac");
        System.out.print("Nhap loai sach: ");
        int loai = Integer.parseInt(sc.nextLine());
        if (nam <= 0 || gia <= 0 || soLuong < 0 || loai < 1 || loai > 4) {
            System.out.println("Thong tin sach khong hop le!");
            return;
        }
         String sach = ma + "|" + ten + "|" + tacGia + "|" + nam
                    + "|" + gia + "|" + soLuong + "|" + loai;
        danhSachSach.add(sach);
        System.out.println("Them sach thanh cong!");
    }
    public static void HienThiSach() {
        if (danhSachSach.isEmpty()) {
            System.out.println("Danh sach sach dang trong!");
            return;
        }
         for (int i = 0; i < danhSachSach.size(); i++) {
            String[] tt = danhSachSach.get(i).split("\\|", -1);
            System.out.println("\n SACH THU " + (i + 1) );
            System.out.println("Ma sach: " + tt[0]);
            System.out.println("Ten sach: " + tt[1]);
            System.out.println("Tac gia: " + tt[2]);
            System.out.println("Nam xuat ban: " + tt[3]);
            System.out.println("Don gia: " + tt[4]);
            System.out.println("So luong: " + tt[5]);
            switch (Integer.parseInt(tt[6])) {
                case 1:
                    System.out.println("Loai sach: Sach giao khoa");
                    break;
                case 2:
                    System.out.println("Loai sach: Sach tham khao");
                    break;
                case 3:
                    System.out.println("Loai sach: Sach chuyen nganh");
                    break;
                case 4:
                    System.out.println("Loai sach: Sach khac");
                    break;
            }
        }
    }
    public static void TimSach() {
        System.out.print("Nhap ma sach can tim: ");
        String ma = sc.nextLine();
        int viTri = TimViTri(ma);
        if (viTri == -1) {
            System.out.println("Khong tim thay sach!");
        } 
        else {
            String sachTim = danhSachSach.get(viTri);
            String[] tt = sachTim.split("\\|", -1);

            System.out.println("Ma sach: " + tt[0]);
            System.out.println("Ten sach: " + tt[1]);
            System.out.println("Tac gia: " + tt[2]);
            System.out.println("Nam xuat ban: " + tt[3]);
            System.out.println("Don gia: " + tt[4]);
            System.out.println("So luong: " + tt[5]);
            System.out.println("Loai sach: " + tt[6]);
        }
    }
    public static void XoaSach() {
        System.out.print("Nhap ma sach can xoa: ");
        String ma = sc.nextLine();
        int viTri = TimViTri(ma);
        if (viTri == -1) {
            System.out.println("Khong tim thay sach!");
        } else {
            danhSachSach.remove(viTri);
            System.out.println("Xoa sach thanh cong!");
        }
    }
    public static void SuaSach() {
        System.out.print("Nhap ma sach can sua: ");
        String ma = sc.nextLine();
        int viTri = TimViTri(ma);
        if (viTri == -1) {
            System.out.println("Khong tim thay sach!");
            return;
        }
        String[] tt = danhSachSach.get(viTri).split("\\|", -1);
        System.out.print("Nhap ten sach moi: ");
        tt[1] = sc.nextLine();
        System.out.print("Nhap tac gia moi: ");
        tt[2] = sc.nextLine();
        System.out.print("Nhap nam xuat ban moi: ");
        tt[3] = sc.nextLine();
        System.out.print("Nhap don gia moi: ");
        tt[4] = sc.nextLine();
        System.out.print("Nhap so luong moi: ");
        tt[5] = sc.nextLine();
        System.out.println("1. Sach giao khoa");
        System.out.println("2. Sach tham khao");
        System.out.println("3. Sach chuyen nganh");
        System.out.println("4. Sach khac");
        System.out.print("Nhap loai sach moi: ");
        tt[6] = sc.nextLine();
        int nam = Integer.parseInt(tt[3]);
        double gia = Double.parseDouble(tt[4]);
        int soLuong = Integer.parseInt(tt[5]);
        int loai = Integer.parseInt(tt[6]);
        if (nam <= 0 || gia <= 0 || soLuong < 0 || loai < 1 || loai > 4) {
            System.out.println("Thong tin moi khong hop le, khong cap nhat!");
            return;
        }
         danhSachSach.set(viTri, String.join("|", tt));
        System.out.println("Sua sach thanh cong!");
    }
    public static void TongSoLuong() {
        int tong = 0;
        for (int i = 0; i < danhSachSach.size(); i++) {
            String[] tt = danhSachSach.get(i).split("\\|", -1);
            tong += Integer.parseInt(tt[5]);
        }
        System.out.println("Tong so luong sach: " + tong);
    }
    public static void TongGiaTri() {
        double tong = 0;
        for (int i = 0; i < danhSachSach.size(); i++) {
            String[] tt = danhSachSach.get(i).split("\\|", -1);
            double donGia = Double.parseDouble(tt[4]);
            int soLuong = Integer.parseInt(tt[5]);
            tong += donGia * soLuong;
        }
        System.out.println("Tong gia tri sach: " + tong);
    }
    public static void main(String[] args) {
        int chon;
        do {
            System.out.println("\n MENU QUAN LY THU VIEN ");
            System.out.println("1. Them sach");
            System.out.println("2. Hien thi sach");
            System.out.println("3. Tim sach");
            System.out.println("4. Xoa sach");
            System.out.println("5. Sua sach");
            System.out.println("6. Tinh tong so luong");
            System.out.println("7. Tinh tong gia tri");
            System.out.println("8. Thoat\n");
            System.out.print("Nhap lua chon: ");
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    ThemSach();
                    break;
                case 2:
                    HienThiSach();
                    break;
                case 3:
                    TimSach();
                    break;
                case 4:
                    XoaSach();
                    break;
                case 5:
                    SuaSach();
                    break;
                case 6:
                    TongSoLuong();
                    break;
                case 7:
                    TongGiaTri();
                    break;
                case 8:
                    System.out.println("Thoat chuong trinh!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (chon != 8);
    }
}