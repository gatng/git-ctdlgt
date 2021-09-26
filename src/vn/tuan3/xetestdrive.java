package vn.tuan3;

public class xetestdrive {
    public static void main(String[] args) {
        xe xe = new xe("Nguyen Thanh Dat");
        System.out.println("Ten Chu Xe: "+xe.tenChuXe);
        xe = new xe("Nguyen Thanh Dat", "Pagani");
        System.out.println("Ten Chu Xe: "+xe.tenChuXe + " " +" Hang San Xuat: "+ xe.hangSx);
        xe = new xe("Nguyen Thanh Dat", "Pagani", "Huayra");
        System.out.println("Ten Chu Xe: "+xe.tenChuXe + " " +" Hang San Xuat: "+ xe.hangSx + " " +" Dong Xe: "+ xe.dongXe);
        xe = new xe("Nguyen Thanh Dat", "Pagani", "Huayra", "A1");
        System.out.println("Ten Chu Xe: "+xe.tenChuXe + " " +" Hang San Xuat: "+ xe.hangSx + " " +" Dong Xe: "+ xe.dongXe + " " + " Giay Phep: "+xe.giayPhep);
        xe = new xe("Nguyen Thanh Dat", "Pagani", "Huayra", "A1", 85L);
        System.out.println("Ten Chu Xe: "+xe.tenChuXe + " " +" Hang San Xuat: "+ xe.hangSx + " " +" Dong Xe: "+ xe.dongXe + " " + " Giay Phep: "+ xe.giayPhep+ " " +" Dung Tich Xang: "+ xe.dungTichXang);
    }
}
