package vn.nguyenthanhdat2004110046.tuan4;

import java.util.Scanner;

public class Maytinhtestdrive {
    public static void main(String[] args) {
        Maytinh maytinhlist[] = new Maytinh[2];
            Scanner nhap = new Scanner(System.in);
            System.out.println("Nhập danh sách máy tính");
            for(int i=0; i<maytinhlist.length;i++){
                System.out.println("Nhập máy tính thứ "+(i+1));
                System.out.print("Nhà sản xuất: ");
                String nhaSX=nhap.next();
                System.out.print("Hệ điều hành: ");
                String HDH=nhap.next();
                System.out.print("Ram: ");
                String ram=nhap.next();
                System.out.print("CPU: ");
                String CPU=nhap.next();
                System.out.print("Năm sản xuất: ");
                int namSX=nhap.nextInt();
                System.out.print("Giá: ");
                int gia=nhap.nextInt();
                System.out.print("Năm bảo hành: ");
                int namBH=nhap.nextInt();
                maytinhlist[i] = new Maytinh(nhaSX, HDH, ram, CPU, namSX, gia, namBH);
            }
            System.out.println("====In danh sách máy tính sau khi nhập===");
            for(Maytinh maytinh:maytinhlist){
                maytinh.inthongtin();
            }
        }
}
