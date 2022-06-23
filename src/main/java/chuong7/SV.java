/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong7;

/**
 *
 * @author Tan khoa
 */
public class SV {
    public String hoTen;
    private int tuoi;

    public SV() {
    }

    public SV(String hoTen, int luong) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
    }

    public String getHoTen() {
        return hoTen;
    }
    
    public void setHoTen(String hoTen) {
        if (hoTen == null){
            this.hoTen ="Khong xac dinh";
        }else{
            this.hoTen = hoTen;
        }
    }

    public int getLuong() {
        return tuoi;
    }

    

    public void setLuong(int tuoi) {
        if ( this.tuoi < 18){
            this.tuoi = -1;
        }else{
            this.tuoi = tuoi;
        }
    }

}