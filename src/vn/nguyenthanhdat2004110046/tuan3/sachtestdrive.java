package vn.nguyenthanhdat2004110046.tuan3;

public class sachtestdrive {
    public static void main(String[] args) {
        sach sach = new sach("VN", 1000, 10000, 10, 1, "09/26/2021");
        System.out.println("Nha xuat ban: " +sach.nhaxuatban + " Gia: " +sach.gia + " VND " + " Gia ban: " +sach.giaban +" VND "  + " So luong: " +sach.soluong + " Quyen " + " Phan Loai: " +sach.loai + " " + "Nam xuat ban: " +sach.namxuatban);
        sach = new sach("VN", 1000, 10000, 10, 1);
        System.out.println("Nha xuat ban: " +sach.nhaxuatban + " Gia: " +sach.gia + " VND " +" Gia ban: " +sach.giaban + " VND " + "So luong: " +sach.soluong + " Quyen " + " Phan Loai: " +sach.loai);
        sach = new sach("VN", 1000, 10000, 10);
        System.out.println("Nha xuat ban: " +sach.nhaxuatban + " Gia: " +sach.gia + " VND " +" Gia ban: " +sach.giaban + " VND " + "So luong: " +sach.soluong + " Quyen ");
        sach = new sach("VN", 1000, 10000);
        System.out.println("Nha xuat ban: " +sach.nhaxuatban + " Gia: " +sach.gia + " VND " +" Gia ban: " +sach.giaban + " VND ");
        sach = new sach("VN", 1000);
        System.out.println("Nha xuat ban: " +sach.nhaxuatban + " Gia: " +sach.gia + " VND ");
        sach = new sach("VN");
        System.out.println("Nha xuat ban: " +sach.nhaxuatban);
    
    
    }
}
