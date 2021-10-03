package vn.nguyenthanhdat2004110046.tuan3;

public class sach {
    float gia,giaban;
    String nhaxuatban;
    String namxuatban;
    int soluong,loai;
    
    sach()
    {

    }
    sach(String nxb1)
    {
        nhaxuatban = nxb1;
    }
    sach(String nxb2, float g1)
    {
        nhaxuatban = nxb2;
        gia = g1;
    }
    sach(String nxb3, float g2, float gb1)
    {
        nhaxuatban = nxb3;
        gia = g2;
        giaban = gb1;
    }
    sach(String nxb4, float g3, float gb2, int sl1)
    {
        nhaxuatban = nxb4;
        gia = g3;
        giaban = gb2;
        soluong = sl1; 
    }
    sach(String nxb5, float g4, float gb3, int sl2, int l1)
    {
        nhaxuatban = nxb5;
        gia = g4;
        giaban = gb3;
        soluong = sl2; 
        loai = l1;
    }
    sach(String nxb6, float g5, float gb4, int sl3, int l2, String nxbDate)
    {
        nhaxuatban = nxb6;
        gia = g5;
        giaban = gb4;
        soluong = sl3; 
        loai = l2;
        namxuatban = nxbDate;
        
    
    }        
}
