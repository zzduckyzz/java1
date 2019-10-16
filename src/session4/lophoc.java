package session4;
import java.util.ArrayList;

public class lophoc {
    public int MaLop;
    public String PhongHoc;
    public ArrayList<SinhVien> dsSinhvien;

    public lophoc(){
        dsSinhvien = new ArrayList<>();
    }
    public void themSinhVien(SinhVien sv){
        this.dsSinhvien.add(sv);
    }
}
