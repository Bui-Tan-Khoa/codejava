/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Javacore05.btvn.chuong5.bai4;

import java.util.Scanner;

/**
 *
 * @author Tan khoa
 */
public class NhanVien {
    String hoTen;
    String namSinh;
    String diaChi;
    double tienLuong;
    int tongGioLamViec;

    public NhanVien() {
    }

    public NhanVien(String hoTen, String namSinh, String diaChi, double tienLuong, int tongGioLamViec) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.diaChi = diaChi;
        this.tienLuong = tienLuong;
        this.tongGioLamViec = tongGioLamViec;
    }
    void inputInfo(){
        Scanner sc = new Scanner(System.in);
        hoTen = sc.nextLine();
        namSinh = sc.nextLine();
        diaChi = sc.nextLine();
        sc.nextLine();
        tienLuong = sc.nextDouble();
        tongGioLamViec = sc.nextInt();
    }
    void printInfo(){
        System.out.println(hoTen);
        System.out.println(namSinh);
        System.out.println(diaChi);
        System.out.println(tienLuong);
        System.out.println(tongGioLamViec);
    }
    double tinhThuong(){
        double thuong = 0;
        if(tongGioLamViec >= 200){
            thuong = tienLuong * 0.2;
        }else  if(tongGioLamViec >= 100 && tongGioLamViec < 200){
            thuong = tienLuong * 0.1;
        }
        return thuong;
    }
}
