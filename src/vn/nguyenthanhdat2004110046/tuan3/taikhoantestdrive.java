package vn.nguyenthanhdat2004110046.tuan3;

public class taikhoantestdrive {
    public static void main(String[] args) {
        taikhoan taiKhoan = new taikhoan("Nguyen Thanh Dat");
        System.out.println("Ho Ten: " + taiKhoan.tentk);
        taiKhoan = new taikhoan("Nguyen Thanh Dat", 100000000);
        System.out.println("Ho Ten: "+ taiKhoan.tentk +" "+" So Tai Khoan: "+taiKhoan.stk);
        taiKhoan = new taikhoan("Nguyen Thanh Dat", 100000000, 10000);
        System.out.println("Ho Ten: "+ taiKhoan.tentk +" "+" So Tai Khoan: "+taiKhoan.stk +" So du: "+taiKhoan.sodu);
    }
}
