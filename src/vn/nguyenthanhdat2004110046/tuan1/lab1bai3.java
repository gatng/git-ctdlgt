package vn.nguyenthanhdat2004110046.tuan1;

import java.util.Scanner;

public class lab1bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào cạnh của khối lập phương:");
        int canh = scanner.nextInt();
        
        int theTich = canh * canh * canh;
        System.out.printf("thể tích khối lập phương : %d",theTich);
    }
}


