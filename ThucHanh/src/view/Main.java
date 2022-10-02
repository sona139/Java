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
        Scanner sc = new Scanner(System.in);
        
        SoNguyenDuong snd = new SoNguyenDuong();
        Xau xau = new Xau();
        DaThuc p = new DaThuc();
        
        while(true) {
            PrintMenu();
            System.out.print("Nhap lua chon (0-9): ");
            int choice = sc.nextInt();
            switch(choice) {
                case 0:
                    System.out.println("EXIT!");
                    return ;
                case 1:
                    snd.nhap();
                    break;
                case 2:
                    snd.uocSnt();
                    break;
                case 3:
                    snd.fibo();
                    break;                  
                case 4:
                    xau.nhap();
                    break;
                case 5:
                    xau.soCau();
                    break;
                case 6:
                    xau.chuanHoa();
                    break;
                case 7:
                    p.nhap();
                    break;
                case 8:
                    p.tinh();
                    break;
                case 9:
                    p.chia();
                    break;
                default:
                    System.out.println("Moi ban nhap lai (0-9)");
            }
        }
    }
    
    public static void PrintMenu() {
        System.out.println("----------------------------------------");
        System.out.println("MENU:");
        System.out.println("Lua chon 0: THOAT");
        System.out.println("Lua chon 1: Nhap vao 1 so nguyen duong n");
        System.out.println("Lua chon 2: Viet ra cac uoc so nguyen to cua n");
        System.out.println("Lua chon 3: Viet ra day so Fibonacci nho hon n");
        System.out.println("Lua chon 4: Nhap vao 1 xau");
        System.out.println("Lua chon 5: Dua ra so cau");
        System.out.println("Lua chon 6: Dua ra xau ho ten theo chuan tieng anh");
        System.out.println("Lua chon 7: Nhap vao 1 da thuc");
        System.out.println("Lua chon 8: Tinh gia tri da thuc tai x = 2");
        System.out.println("Lua chon 9: Tinh P(x)/Q(x) va da thuc du");
        System.out.println("----------------------------------------");
    }
}
