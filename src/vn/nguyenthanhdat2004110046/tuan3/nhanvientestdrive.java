package vn.nguyenthanhdat2004110046.tuan3;

 

public class nhanvientestdrive {
    public static void main(String[] args) {
        nhanvien nhanVien = new nhanvien("Nguyen Thanh DAT");
        System.out.println("Ten Nhan Vien: " +nhanVien.tennhanvien);
        nhanVien = new nhanvien("Nguyen Thanh DAT", "HCM");
        System.out.println("Ten Nhan Vien: " +nhanVien.tennhanvien + " Dia chi: " +nhanVien.diachi);
        nhanVien = new nhanvien("Nguyen Thanh DAT", "HCM", "CEO");
        System.out.println("Ten Nhan Vien: " +nhanVien.tennhanvien + " Dia chi: " +nhanVien.diachi + " Bo Phan Lam Viec: " +nhanVien.bophanlamviec);
        nhanVien = new nhanvien("Nguyen Thanh DAT", "HCM", "CEO", "16/12/2002");
        System.out.println("Ten Nhan Vien: " +nhanVien.tennhanvien + " Dia chi: " +nhanVien.diachi + " Bo Phan Lam Viec: " +nhanVien.bophanlamviec + " Ngay sinh: " +nhanVien.ngaysinh);
        nhanVien = new nhanvien("Nguyen Thanh DAT", "HCM", "CEO", "16/12/2002", 10000000);
        System.out.println("Ten Nhan Vien: " +nhanVien.tennhanvien + " Dia chi: " +nhanVien.diachi + " Bo Phan Lam Viec: " +nhanVien.bophanlamviec + " Ngay sinh: " +nhanVien.ngaysinh + " Luong: " + nhanVien.luong);
 
 
     }
}
