/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Javacore05.btvn.bai7;

import java.util.Scanner;

/**
 *
 * @author Tan khoa
 */
public class HinhChuNhat {
    double chieuDai;
    double chieuRong;

    public HinhChuNhat() {
    }

    public HinhChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }
    
    void nhap(){
        Scanner sc = new Scanner(System.in);
        chieuDai = sc.nextDouble();
        chieuRong = sc.nextDouble();
    }
    
    double chuVi(){
        double P;
        P = (chieuDai + chieuRong)*2;
        System.out.println(P);
        return P;
    }
    
    double dienTich(){
        double S;
        S = chieuDai*chieuRong;
        System.out.println(S);
        return S;
    }
}
