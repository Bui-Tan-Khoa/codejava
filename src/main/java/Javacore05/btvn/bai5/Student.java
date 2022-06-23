/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Javacore05.btvn.bai5;
import java.util.Scanner;
/**
 *
 * @author Tan khoa
 */
public class Student {
    String maSinhVien;
    double diemTrungBinh;
    int namSinh;
    String lop;

    public Student() {
    }

    public Student(String maSinhVien, double diemTrungBinh, int namSinh, String lop) {
        this.maSinhVien = maSinhVien;
        this.diemTrungBinh = diemTrungBinh;
        this.namSinh = namSinh;
        this.lop = lop;
    }
    
    void inputInfo(){
        Scanner sc = new Scanner(System.in);
        maSinhVien = sc.nextLine();
        diemTrungBinh = sc.nextDouble();
        namSinh = sc.nextInt();
        lop = sc.nextLine();
    }
    
    void showInfo(){
        System.out.println(maSinhVien);
        System.out.println(diemTrungBinh);
        System.out.println(namSinh);
        System.out.println(lop);
    }
    
    void checkScholarship(){
        if(diemTrungBinh >= 8){
            System.out.println("dat hoc bong");
        }else{
            System.out.println("khong dat hoc bong");
        }
    }
}
