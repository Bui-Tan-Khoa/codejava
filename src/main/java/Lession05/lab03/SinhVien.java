/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lession05.lab03;


/**
 *
 * @author Tan khoa
 */
public class SinhVien {

    String hoVaTen;
    String lop;
    double diemTB;

    public SinhVien(String hoVaTen, String lop, double diemTB) {
        this.hoVaTen = hoVaTen;
        this.lop = lop;
        this.diemTB = diemTB;
    }
    


    void xuatThongTin() {
        System.out.println("ho va  ten: " + hoVaTen);
        System.out.println("lop: " + lop);
        System.out.println("diem TB: " + diemTB);
    }

    void xepLoaiHocLuc() {
        if (diemTB >= 8) {
            System.out.println("hoc luc GIOI");
        } else {
            if (diemTB >= 7) {
                System.out.println("hoc luc KHA");
            } else {
                if (diemTB >= 6) {
                    System.out.println("hoc luc TBKHA");
                } else {
                    if (diemTB >= 5) {
                        System.out.println("hoc luc TRUNG BINH");
                    } else {
                        System.out.println("hoc luc YEU");
                    }
                }
            }
        }
    }
}
