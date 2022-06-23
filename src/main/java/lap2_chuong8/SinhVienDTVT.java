/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lap2_chuong8;

/**
 *
 * @author Tan khoa
 */
public class SinhVienDTVT extends SinhVien{
    double diemVDK;
    double diemTDS;
    double diemTKModule;

    public SinhVienDTVT(String hoTen, String nganhHoc , double diemVDK, double diemTDS, double diemTKModule ) {
        super(hoTen, nganhHoc);
        this.diemVDK = diemVDK;
        this.diemTDS = diemTDS;
        this.diemTKModule = diemTKModule;
    }
    
    @Override
    double getDiem() {
        return (diemTDS*2+diemTKModule+diemVDK)/4;
    }
  
}
