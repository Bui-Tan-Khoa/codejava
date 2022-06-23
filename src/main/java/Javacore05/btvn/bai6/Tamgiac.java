/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Javacore05.btvn.bai6;

import java.util.Scanner;

/**
 *
 * @author Tan khoa

    Tamgiac(int i, int i0, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
 */
public class Tamgiac {

    double AB;
    double AC;
    double BC;

    public Tamgiac(double AB, double AC, double BC) {
        this.AB = AB;
        this.AC = AC;
        this.BC = BC;
    }

    public Tamgiac() {
    }

    void nhap() {
        Scanner sc = new Scanner(System.in);
        AB = sc.nextDouble();
        AC = sc.nextDouble();
        BC = sc.nextDouble();
    }

    void kiemTraTamGiac() {
        if (AB * AB == AC * AC + BC * BC || AC * AC == AB * AB + BC * BC || BC * BC == AB * AB + AC * AC) {
            System.out.printf("(%.5f, %.5f, %.5f) la tam giac vuong\n", AB, AC, BC);
        } else if (AB == AC && AC == BC) {
            System.out.printf("(%.5f, %.5f, %.5f) la tam giac deu\n", AB, AC, BC);
        } else if (AB == AC || AB == BC || AC == BC) {
            System.out.printf("(%.5f, %.5f, %.5f) la tam giac can\n", AB, AC, BC);
        } else if (AB < AC + BC && AC < AB + BC && BC < AB + AC) {
            System.out.printf("(%.5f, %.5f, %.5f) la tam giac thuong\n", AB, AC, BC);
        } 
    }
    
    double tinhChuVi(){
        double P;
        P = AB + AC + BC;
        
        System.out.printf("chu vi tam giac = %f\n" , P);
        return P;
    }
    
    double tinhDienTich(){
        double S;
        double P = (AB + AC + BC)/2;
        S = Math.sqrt(P * (P - AB) * (P - AC) * (P - BC));
        System.out.printf("dien tich tam giac = %f\n",S);
        return S;
    }
}
