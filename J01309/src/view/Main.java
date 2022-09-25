/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;

/**
 *
 * @author hongs
 */
public class Main {
    public static void main(String[] args) {
        PrintMenu3();
    }
    
    public static void PrintMenu1() {
        System.out.println("MENU:");
        System.out.println("Lua chon 0: THOAT");
        System.out.println("Lua chon 1: nhap vao 2 so nguyen duong m va n");
        System.out.println("Lua chon 2: dua ra uoc chung lon nhat va boi chung nho nhat cua m va n");
        System.out.println("Lua chon 3: dua ra cac so nguyen to tu m den n");
        System.out.println("Lua chon 4: nhap vao 1 day so nguyen");
        System.out.println("Lua chon 5: dua ra gia tri lon nhat, gia tri nho nhat cua day");
        System.out.println("Lua chon 6: dua ra so lan xuat hien cua moi phan tu");
        System.out.println("Lua chon 7: nhap vao 1 ma tran vuong");
        System.out.println("Lua chon 8: viet ra ma tran chuyen vi");
        System.out.println("Lua chon 9: dua ra hang hoac cot co tong lon nhat");
        System.out.println("----------------------------------------");
        
        SoThuc st = new SoThuc();
        DaySoNguyen dsn = new DaySoNguyen();
        MaTranVuong mtv = new MaTranVuong();
        
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("Nhap lua chon (0-9): ");
            int choice = sc.nextInt();
            switch(choice) {
                case 0:
                    System.out.println("EXIT!");
                    return ;
                case 1:
                    st.nhap();
                    break;
                case 2:
                    st.uclnVaBcnn();
                    break;
                case 3:
                    st.sntTuMDenN();
                    break;                  
                case 4:
                    dsn.nhap();
                    break;
                case 5:
                    dsn.GTLNvaGTNN();
                    break;
                case 6:
                    dsn.soLanXuatHien();
                    break;
                case 7:
                    mtv.nhap();
                    break;
                case 8:
                    mtv.maTranChuyenVi();
                    break;
                case 9:
                    mtv.hangHoacCotCoTongLonNhat();
                    break;
                default:
                    System.out.println("Moi ban nhap lai (0-9)");
                    System.out.println("----------------------------------------");
            }
        }
    }
    
    public static void PrintMenu2() {
        System.out.println("MENU:");
        System.out.println("Lua chon 0: THOAT");
        System.out.println("Lua chon 1: nhap vao 2 phan so A va B");
        System.out.println("Lua chon 2: tinh tong 2 phan so A va B");
        System.out.println("Lua chon 3: tinh hieu 2 phan so A va B");
        System.out.println("Lua chon 4: nhap vao 1 so nguyen duong n");
        System.out.println("Lua chon 5: liet ke tat ca cac so fibo be hon n la so nguyen to");
        System.out.println("Lua chon 6: xem n co phai la so thuan nghich hay khong");
        System.out.println("Lua chon 7: nhap vao 1 ma tran vuong");
        System.out.println("Lua chon 8: dua ra cac hang chi co cac so duong chan");
        System.out.println("Lua chon 9: tim ma tran nghich dao");
        System.out.println("----------------------------------------");
        
        SoNguyenFB sn = new SoNguyenFB();
        PhanSo ps = new PhanSo();
        MaTranVuong mtv = new MaTranVuong();
        
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("Nhap lua chon (0-9): ");
            int choice = sc.nextInt();
            switch(choice) {
                case 0:
                    System.out.println("EXIT!");
                    return ;
                case 1:
                    ps.nhap();
                    break;
                case 2:
                    ps.tong();
                    break;
                case 3:
                    ps.hieu();
                    break;                  
                case 4:
                    sn.nhap();
                    break;
                case 5:
                    sn.fibo();
                    break;
                case 6:
                    sn.thuanNghich();
                    break;
                case 7:
                    mtv.nhap();
                    break;
                case 8:
                    mtv.hangChan();
                    break;
                case 9:
                    mtv.matranNghichDao();
                    break;
                default:
                    System.out.println("Moi ban nhap lai (0-9)");
                    System.out.println("----------------------------------------");
            }
        }
    }
    
    public static void PrintMenu3() {
        System.out.println("MENU:");
        System.out.println("Lua chon 0: THOAT");
        System.out.println("Lua chon 1: nhap vao day so thuc");
        System.out.println("Lua chon 2: tim phan tu nho nhat cua day so");
        System.out.println("Lua chon 3: sap xep va in ra day so theo thu tu giam dan");
        System.out.println("Lua chon 4: nhap vao 1 doan van ban");
        System.out.println("Lua chon 5: dua ra so cau cua doan van ban");
        System.out.println("Lua chon 6: chuan hoa va in ra doan van ban da5 chuan hoa");
        System.out.println("Lua chon 7: nhap vao 1 da thuc");
        System.out.println("Lua chon 8: tinh tong 2 da thuc");
        System.out.println("Lua chon 9: tinh thuong va phan du khi chia 2 da thuc");
        System.out.println("----------------------------------------");
        
        DaySoThuc dst = new DaySoThuc();
        DoanVanBan dvb = new DoanVanBan();
        DaThuc dt1 = new DaThuc();
        float[] a = {1, 2, 3, 4};
        DaThuc dt2 = new DaThuc(3, a);
        
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("Nhap lua chon (0-9): ");
            int choice = sc.nextInt();
            switch(choice) {
                case 0:
                    System.out.println("EXIT!");
                    return ;
                case 1:
                    dst.nhap();
                    break;
                case 2:
                    dst.phanTuNhoNhat();
                    break;
                case 3:
                    dst.sapXep();
                    break;                  
                case 4:
                    dvb.nhap();
                    break;
                case 5:
                    dvb.soCau();
                    break;
                case 6:
                    dvb.chuanHoa();
                    break;
                case 7:
                    dt1.nhap();
                    break;
                case 8:
                    dt1.cong(dt2);
                    break;
                case 9:
                    dt1.chia(dt2);
                    break;
                default:
                    System.out.println("Moi ban nhap lai (0-9)");
                    System.out.println("----------------------------------------");
            }
        }
    }
}
