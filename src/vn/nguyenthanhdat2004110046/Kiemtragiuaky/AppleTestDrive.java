package vn.nguyenthanhdat2004110046.Kiemtragiuaky;

import java.util.ArrayList;
import java.util.Scanner;
 
 

public class AppleTestDrive {
    static ArrayList<Apple> list = new ArrayList<Apple>();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        menu();
    }
     
    static void menu(){
        System.out.println("============MENU===========");
        do{
            System.out.println("1 thêm táo vào kho ");
            System.out.println("2 tìm táo theo màu ");
            System.out.println("3 in danh sách táo");
            System.out.println("4 thoát");
            int choice = sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1: 
                     nhap();
                     break;
                case 2: 
                     tim();
                     break;
                case 3:
                    xuat();
                    break;
                case 4: 
                    System.exit(0);
                    break;
                default: 
                    System.out.println("nhập không chuẩn ! nhập lại: "); 
            }
       
        }while(true);
    }
   
   static void nhap(){
       while(true){
           Apple apple;
           apple = new Apple();

           apple.nhapthongtin();
           sc.nextLine();
           list.add(apple);

           System.out.println("nhập thêm (y/n)? : ");
           if(sc.nextLine().equals("n"))
           break;
       }
       xuat();
       sc.nextLine();
       menu();
   }
    
   static void xuat(){
       for(Apple apple : list){
           apple.inthongtin();
       }
   }
    
   static void tim(){
       System.out.print("nhập màu táo muốn tìm: ");
       for(Apple apple : list){
           if(sc.nextLine().equals(apple.mau)){
               apple.inthongtin();
           }
       }
   }

}
