package vn.tuan3;

public class nhanvien {
    String tennhanvien, diachi, bophanlamviec, ngaysinh;
    float luong;
    
    nhanvien()
    {

    }
    nhanvien(String tnv)
    {
        tennhanvien = tnv;
    }
    nhanvien(String tnv1, String dc)
    {
        tennhanvien = tnv1;
        diachi = dc;
    }
   nhanvien(String tnv2, String dc1, String bplv)
    {
        tennhanvien = tnv2;
        diachi = dc1;
        bophanlamviec = bplv;

    }
    nhanvien(String tnv3, String dc2, String bplv1, String ns)
    {
        tennhanvien = tnv3;
        diachi = dc2;
        bophanlamviec = bplv1;
        ngaysinh = ns;
    
    }
   nhanvien(String tnv4, String dc3, String bplv2, String ns1, float l)
    {
        tennhanvien = tnv4;   
        diachi = dc3;
        bophanlamviec = bplv2;
        ngaysinh = ns1;
        luong = l;
    
    }
}
