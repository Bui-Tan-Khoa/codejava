/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong8;

/**
 *
 * @author Tan khoa
 */
public class hinhChuNhat {
    private double dai;
    private double rong;

    public hinhChuNhat() {
    }

    public hinhChuNhat(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }

    public double getDai() {
        return dai;
    }

    public void setDai(double dai) {
        this.dai = dai;
    }

    public double getRong() {
        return rong;
    }

    public void setRong(double rong) {
        this.rong = rong;
    }

    public double getChuVi() {

        return this.dai * 2 + this.rong * 2;
    }

    public double getDienTich() {
        return this.dai * this.rong;
    }

    public String hienThiThongTin() {
        //return "“HCN(" + this.dai + ", " + this.rong + "): chu vi = " + this.getChuVi() + ", dien tich = " + this.getDienTich();
        return "HCN(" + String.format("%.6f", this.dai) +  ", " + String.format("%.6f", this.rong) + "): chu vi = " + String.format("%.3f", this.getChuVi()) + ", dien tich = " + String.format("%.3f", this.getDienTich());
    }
}
