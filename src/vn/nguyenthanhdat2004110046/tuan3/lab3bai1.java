package vn.nguyenthanhdat2004110046.tuan3;

import java.util.Scanner;

public class lab3bai1 {
    public static void main(String[] args) {
        System.out.println("Nhập vào số nguyên n: ");
        Scanner scanner = new Scanner(System.in);
        int son = scanner.nextInt();
        boolean kiemTra = true;
        for(int i =2; i < son; i++){
            if(son % i == 0){ 
            kiemTra = false;
            break;
            }
        }
        if(kiemTra == true)
            System.out.printf("%d là số nguyên tố",son);
        else
            System.out.printf("%d không phải là số nguyên tố",son);
    }
}
