/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacore.basic.lesson07.am.private_example;

/**
 *
 * @author Tan khoa
 */
public class NhanVien {
    public String hoTen;
    private int luong;
    public NhanVien(String hoTen){
        this.hoTen = hoTen;
    }
    public void hienThi(){
        System.out.println("Ho va ten : " + this.hoTen);
        System.out.printf("Luong : %d\n", this.luong);
    }
    
    class InnerClass {
        public void Func(){
            System.out.printf("Luong = %d\n", luong);
        }
    }
}
