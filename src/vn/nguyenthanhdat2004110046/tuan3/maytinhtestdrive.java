package vn.nguyenthanhdat2004110046.tuan3;

public class maytinhtestdrive {
    public static void main(String[] args) {
        maytinh mayTinh = new maytinh("Acer");
        System.out.println("Nha San Xuat: "+mayTinh.nhasx);
        mayTinh = new maytinh("Acer", "win10");
        System.out.println("Nha San Xuat: "+mayTinh.nhasx + " " +" He Dieu Hanh: "+ mayTinh.heDieuHanh);
        mayTinh = new maytinh("Acer", "win10", "2020");
        System.out.println("Nha San Xuat: "+mayTinh.nhasx + " " +" He Dieu Hanh: "+ mayTinh.heDieuHanh + " " +" Nam San Xuat: "+ mayTinh.namSx);
        mayTinh = new maytinh("Acer", "win10", "2020", "2 nam");
        System.out.println("Nha San Xuat: "+mayTinh.nhasx + " " +" He Dieu Hanh: "+ mayTinh.heDieuHanh + " " +" Nam San Xuat: "+ mayTinh.namSx +" Nam Bao Hanh: "+ mayTinh.namBh);
        mayTinh = new maytinh("Acer", "win10", "2020", "2 nam", "32GB / 2TB Raid 0 ", "Core™ i7");
        System.out.println("Nha San Xuat: "+mayTinh.nhasx + " " +" He Dieu Hanh: "+ mayTinh.heDieuHanh + " " +" Nam San Xuat: "+ mayTinh.namSx +" Nam Bao Hanh: "+ mayTinh.namBh + " Ram: "+ mayTinh.ram + " " +" CPU: "+ mayTinh.cpu);
        mayTinh = new maytinh("Acer", "win10", "2020", "2 nam", "32GB / 2TB Raid 0", "Core™ i7", 38990000);
        System.out.println("Nha San Xuat: "+mayTinh.nhasx + " " +" He Dieu Hanh: "+ mayTinh.heDieuHanh + " " +" Nam San Xuat: "+ mayTinh.namSx +" Nam Bao Hanh: "+ mayTinh.namBh + " Ram: "+ mayTinh.ram + " " +" CPU: "+ mayTinh.cpu + " Gia: " +mayTinh.gia + " VND");
    }
}
