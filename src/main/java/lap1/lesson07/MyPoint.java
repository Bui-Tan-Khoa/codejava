/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lap1.lesson07;

/**
 *
 * @author Tan khoa
 */
public class MyPoint {
    private double x;
    private double y;

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public void setXY(double x1 , double y1){
    this.x = x1;
    this.y = y1;
}
    public double getDistance(double x1, double y1){
        double hieuX = x1 - this.x;
        double hieuY = y1 - this.y;
        double tongBP = Math.pow(hieuX,2)+Math.pow(hieuY,2);
        return Math.sqrt(tongBP);
    }

    @Override
    public String toString() {
        return "(" + this.x + ";" + this.y + ')';
    }

    void setX(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
        
}
