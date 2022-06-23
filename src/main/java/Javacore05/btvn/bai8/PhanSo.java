/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Javacore05.btvn.bai8;

import java.util.Scanner;

/**
 *
 * @author Tan khoa
 */
public class PhanSo {

    int tuSo;
    int mauSo;

    public PhanSo() {
    }

    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    void nhapPhanSo() {
        Scanner sc = new Scanner(System.in);
        tuSo = sc.nextInt();
        mauSo = sc.nextInt();
    }

    int UCLN = 1;

    void rutGon() {
        int a = tuSo, b = mauSo;
        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 || b == 0) {
            UCLN = (a + b);
        } else {
            while (a != b) {
                if (a > b) {
                    a = a - b;
                } else {
                    b = b - a;
                }
            }
            UCLN = a;
        }
        tuSo /= UCLN;
        mauSo /= UCLN;
    }

    void inPhanSo() {
        if (mauSo < 0) {
            tuSo *= -1;
            mauSo *= -1;
        }
        rutGon();
        System.out.printf("%d/%d\n", tuSo, mauSo);
    }

    void nghichDaoPhanSo() {
        if (mauSo < 0) {
            tuSo *= -1;
            mauSo *= -1;
        }
        rutGon();
        System.out.printf("%d/%d\n", mauSo, tuSo);
    }
}
