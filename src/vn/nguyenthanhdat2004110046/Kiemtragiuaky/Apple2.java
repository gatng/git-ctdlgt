package vn.nguyenthanhdat2004110046.Kiemtragiuaky;

import java.util.Scanner;

public class Apple2 {
    int ID;
    int khoiluong;
    String color;

    Apple2 moi;
    
    Apple2(){};
    
    Apple2(int i, int k, String c){
        ID = i;
        khoiluong = k;
        color = c;
    }
    Apple2(int i, int k, String c, Apple2 mo){
        ID = i;
        khoiluong = k;
        color = c;
        moi = mo;
    }
    Scanner sc = new Scanner(System.in);

    void nhapthongtin(){
      
        System.out.print("nhập mã ID: ");
        ID = sc.nextInt();
        System.out.print("nhập khối lượng: ");
        khoiluong = sc.nextInt();
        System.out.print("nhập màu: ");
        color = sc.nextLine();
        sc.nextLine();
    }

    void inthongtin(){
        System.out.println("mã ID: " + ID);
        System.out.println("khối lượng: " + khoiluong);
        System.out.println("màu : " + color);
    }
}
