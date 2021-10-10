package vn.nguyenthanhdat2004110046.tuan4;

import java.util.Scanner;

public class Taikhoantestdrive {
    public static void main(String[] args) {
        Taikhoan taikhoanlist[] = new Taikhoan[2];
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhập danh sách tài khoản");
        for(int i=0; i<taikhoanlist.length;i++){
            System.out.println("Nhập tài khoản thứ "+(i+1));
            System.out.print("Tên:");
            String ten=nhap.next();
            System.out.print("Số tài khoản:");
            String soTK=nhap.next();
            System.out.print("Số dư:");
            int soDu=nhap.nextInt();
            taikhoanlist[i] = new Taikhoan(ten, soTK, soDu);
        }
        System.out.println("====In danh sách tài khoản sau khi nhập===");
        for(Taikhoan taikhoan:taikhoanlist){
            taikhoan.inthongtin();
        }
    }
}
