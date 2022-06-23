/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lap2_chuong8;

/**
 *
 * @author Tan khoa
 */
public class SinhVienATTT extends SinhVien {

    double diemMD;
    double diemLTAT;
    double diemDTS;

    public SinhVienATTT(String hoTen, String nganhHoc , double diemMD, double diemLTAT, double diemDTS) {
        super(hoTen, nganhHoc);
        this.diemMD = diemMD;
        this.diemLTAT = diemLTAT;
        this.diemDTS = diemDTS;
    }
    @Override
    double getDiem() {
        return (diemMD * 2 + diemLTAT * 2 + diemDTS) / 5;
    }

}
