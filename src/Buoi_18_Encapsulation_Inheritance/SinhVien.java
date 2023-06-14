/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi_18_Encapsulation_Inheritance;

/**
 *
 * @author datha
 */
public class SinhVien extends Nguoi{
    private double gpa;
    
    public SinhVien(double gpa,String hoTen,String ngaySinh)
    {
        super(hoTen,ngaySinh);
        this.gpa=gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    @Override 
    public String toString()
    {
        return super.toString() + " " + String.format("%.2f",this.gpa);
    }
}
