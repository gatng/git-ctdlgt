package vn.nguyenthanhdat2004110046.tuan3;

public class xe {
    String tenChuXe, hangSx, dongXe, giayPhep;
    double dungTichXang;
    xe(String tcx)
    {
        tenChuXe = tcx;
    }
    xe(String tcx2, String hsx)
    {
        tenChuXe = tcx2;
        hangSx = hsx;
    }
    xe(String tcx3, String hsx1, String dx)
    {
        tenChuXe = tcx3;
        hangSx = hsx1;
        dongXe = dx;
    }
    xe(String tcx4, String hsx2, String dx2, String gp)
    {
        tenChuXe = tcx4;
        hangSx = hsx2;
        dongXe = dx2;
        giayPhep = gp;
    }
    xe(String tcx5, String hsx3, String dx3, String gp1, double dtx)
    {
        tenChuXe = tcx5;
        hangSx = hsx3;
        dongXe = dx3;
        giayPhep = gp1;
        dungTichXang = dtx;
    }
}
