/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lap1.lesson07;

/**
 *
 * @author Tan khoa
 */
public class MyCircle {

    static boolean positionOfCircle(MyCircle myCircle, MyCircle myCircle0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   private MyPoint O;
    private double r;

    public MyCircle() {
        O = new MyPoint();
        O.setXY(0, 0);
        this.r = 0;
    }

    public MyCircle(MyPoint O, double r) {
        this.O = O;
        this.r = r;
    }

    public MyCircle(double x, double y, double r) {
        O = new MyPoint();
        O.setXY(x, y);
        this.r = r;
    }

    public MyPoint getO() {
        return O;
    }
    
    public void setO(double x, double y) {
        this.O.setXY(x, y);
    }

    public void setO(MyPoint O) {
        this.O = O;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    
    public double getCircumference(){
        return 2*Math.PI*this.r;
    }
    
    public double getArea() {
        return Math.PI*r*r;
    }

   @Override
    public String toString() {
        return "Circle info: (" + this.O.getX() + ", " + this.O.getY() + "), radius = " + this.r + ", circumference = " + String.format("%." + 3 + "f", + this.getCircumference()) + ", area = " + String.format("%." + 3 + "f", + this.getArea());
    }

    void setCentre(MyPoint toaDoTam) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
     
}
