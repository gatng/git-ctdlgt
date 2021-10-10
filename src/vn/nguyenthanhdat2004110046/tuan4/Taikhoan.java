package vn.nguyenthanhdat2004110046.tuan4;

public class Taikhoan {
    String ten, sotk;
    int  sodu;
    Taikhoan(String t, String stk, int sd){
        ten = t;
        sotk = stk;
        sodu = sd;
    }
    void inthongtin(){
        System.out.println("Tên tài khoản: " + ten);
        System.out.println("Số tài khoản: " + sotk);
        System.out.println("Số dư trong tài khoản: " + sodu);
    }
}
