package vn.nguyenthanhdat2004110046.tuan1;

import java.util.Scanner;

public class lab1bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Họ và tên: ");
        String hoTen = scanner.nextLine();
        System.out.print("Điểm TB: ");
        Double diemTB = scanner.nextDouble();
        System.out.printf("%s %.2f",hoTen,diemTB);
    }
}

