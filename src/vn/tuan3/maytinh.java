package vn.tuan3;

public class maytinh {
    String nhasx, heDieuHanh, namSx, namBh,ram, cpu;
    double gia;
    maytinh(String nsx)
    {
        nhasx = nsx;
    }
    maytinh(String nsx1, String hDh)
    {
        nhasx = nsx1;
        heDieuHanh = hDh;
    }
    maytinh(String nsx2, String hDh1, String nSx)
    {
        nhasx = nsx2;
        heDieuHanh = hDh1;
        namSx = nSx;
    }
   maytinh(String nsx3, String hDh2, String nSx1,String nBh)
    {
        nhasx = nsx3;
        heDieuHanh = hDh2;
        namSx = nSx1;
        namBh = nBh;
    }
    maytinh(String nsx4, String hDh3, String nSx2,String nBh1,String r)
    {
        nhasx = nsx4;
        heDieuHanh = hDh3;
        namSx = nSx2;
        namBh = nBh1;
        ram = r;
    }
    maytinh(String nsx5, String hDh4, String nSx3,String nBh2,String r1, String Cpu)
    {
        nhasx = nsx5;
        heDieuHanh = hDh4;
        namSx = nSx3;
        namBh = nBh2;
        ram = r1;
        cpu = Cpu;
    }
    maytinh(String nsx6, String hDh5, String nSx4,String nBh3,String r2, String Cpu1, double g)
    {
        nhasx = nsx6;
        heDieuHanh = hDh5;
        namSx = nSx4;
        namBh = nBh3;
        ram = r2;
        cpu = Cpu1;
        gia = g;
    }
}
