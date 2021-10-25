package vn.nguyenthanhdat2004110046.Kiemtragiuaky;
import java.util.Scanner;
public class Apple {
    int id;
    int khoiluong;
    String mau;
    
    Apple(){};
    
    Apple(int i, int k, String m){
        id = i;
        khoiluong = k;
        mau = m;
    }
    Scanner sc = new Scanner(System.in);

    void nhapthongtin(){
      
        System.out.print("nhập mã ID: ");
        id = sc.nextInt();
        System.out.print("nhập khối lượng: ");
        khoiluong = sc.nextInt();
        System.out.print("nhập màu: ");
        mau = sc.nextLine();
        sc.nextLine();
    }

    void inthongtin(){
        System.out.println("mã id: " + id);
        System.out.println("khối lượng: " + khoiluong);
        System.out.println("màu : " + mau);
    }

}
