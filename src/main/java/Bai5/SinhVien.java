/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai5;

import java.util.Scanner;

/**
 *
 * @author Tan khoa
 */
public class SinhVien {

    String maSV;
    String hoTen;
    String lop;
    double diemTB;
    String queQuan;

    /*public SinhVien(String maSV, String hoTen, String lop, double diemTB, String queQuan) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.lop = lop;
        this.diemTB = diemTB;
        this.queQuan = queQuan;
    }*/

    
    
    void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap MSV:");
        maSV = sc.nextLine();
        System.out.println("nhap ho ten:");
        hoTen = sc.nextLine();
        System.out.println("nhap lop:");
        lop = sc.nextLine();
        System.out.println("nhap diemTB:");
        diemTB = sc.nextDouble();

        sc.nextLine();
        System.out.println("nhap queQuan:");
        queQuan = sc.nextLine();
    }

    void xuatThongTin() {
        System.out.println("Ma SV: " + maSV);
        System.out.println("ho ten: " + hoTen);
    }

    void hocLapTrinh(String ngonNgu) {
        System.out.println("Hoc lap trinh :" + ngonNgu);
    }

    void hocTheChat(String x) {
        System.out.println("Hoc the chat: " + x);
    }
}

