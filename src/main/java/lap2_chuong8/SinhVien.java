/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lap2_chuong8;

/**
 *
 * @author Tan khoa
 */
public abstract class SinhVien {
    private String hoTen;
    private String nganhHoc;

    public SinhVien(String hoTen, String nganhHoc) {
        this.hoTen = hoTen;
        this.nganhHoc = nganhHoc;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNganhHoc() {
        return nganhHoc;
    }

    public void setNganhHoc(String nganhHoc) {
        this.nganhHoc = nganhHoc;
    }
    
    abstract double getDiem();
    
    String getHocLuc(){
        String hocLuc = "";
        if(this.getDiem()<4.0){
            hocLuc = "Yeu";
        }else if(this.getDiem()<6.0){
            hocLuc = "Trung binh";
        }else if(this.getDiem()<7.0){
            hocLuc = "Trung binh kha";
        }else if(this.getDiem()<8.0){
            hocLuc = "Kha";
        }else if(this.getDiem()<9.0){
            hocLuc = "GIoi";
        }else if(this.getDiem()>=9){
            hocLuc = "Xuat sac";
        }
        return hocLuc;
    
    }
    String hienThiThongTin(){
        String str = String.format("SV: %-20s – %s – %.2f – %s", this.getHoTen(),this.getNganhHoc(),this.getDiem(),this.getHocLuc());
        return str;
    }
}
