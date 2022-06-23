/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lesson09_02;

/**
 *
 * @author Tan khoa
 */
public class PartTimeEmployee extends Employee {

    int workingHours;


    public PartTimeEmployee(String name, int paymentPerHour, int workingHours) {
        super(name, paymentPerHour);
        this.workingHours = workingHours;
    }

    @Override
    public int calculateSalary() {
        return this.workingHours * super.paymentPerHour;
    }

    @Override
    public void showInfo() {
        System.out.println("Name: " + super.getName() + ", salary per day: " + this.calculateSalary());
    }

}
