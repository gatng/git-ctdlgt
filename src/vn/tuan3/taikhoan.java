package vn.tuan3;

public class taikhoan {
    String tentk;
    int stk;
    double sodu;
    taikhoan(String name){
        tentk = name;
    }
    taikhoan(String ten, int stk1)
    {
        tentk = ten;
        stk = stk1;
    }
    taikhoan(String tenTK, int stk2,double soDuTk )
    {
        tentk = tenTK;
        stk = stk2;
        sodu = soDuTk;
    }
}
