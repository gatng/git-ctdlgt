package vn.nguyenthanhdat2004110046.tuan1;

import java.util.Scanner;

public class lab1bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chiều rộng:");
        int chieuRong = scanner.nextInt();
        System.out.println("nhập chiều dài:");
        int chieuDai = scanner.nextInt();
        int chuVi = (chieuDai + chieuRong)*2;
        int dienTich = chieuDai * chieuRong;
        System.out.printf("chu vi hình chữ nhật: %d",chuVi);
        System.out.printf("diện tích hình chữ nhật: %d",dienTich);
    }
}

