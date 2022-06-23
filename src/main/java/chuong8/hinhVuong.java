/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong8;

/**
 *
 * @author Tan khoa
 */
public class hinhVuong extends hinhChuNhat {

    private double canh;

    public hinhVuong() {
    }

    public hinhVuong(double canh) {
        this.canh = canh;
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        this.canh = canh;
    }

    @Override
    public double getChuVi() {

        return 4 * this.canh;
    }

    @Override
    public double getDienTich() {

        return this.canh * this.canh;
    }

    @Override
    public String hienThiThongTin() {
        //return "“HV(" + this.canh + "): chu vi = " + this.getChuVi() + ", dien tich = " + this.getDienTich();
        return "HV(canh = " + String.format("%.6f", this.canh) + "): chu vi = " + String.format("%.3f", this.getChuVi()) + ", dien tich = " + String.format("%.3f", this.getDienTich());
    }
}
