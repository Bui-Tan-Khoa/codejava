/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lession05.lab02;

import java.util.Scanner;

/**
 *
 * @author Tan khoa
 */
public class SinhVien {

    String hoVaTen;
    String lop;
    double diemTB;
    

    void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ho va ten:");
        hoVaTen = sc.nextLine();
        System.out.println("nhap lop:");
        lop = sc.nextLine();
        System.out.println("nhap diemTB:");
        diemTB = sc.nextDouble();
        sc.nextLine();
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
