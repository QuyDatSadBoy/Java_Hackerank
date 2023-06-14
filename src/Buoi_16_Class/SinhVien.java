/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi_16_Class;

import java.util.Scanner;

/**
 *
 * @author datha
 */
// Encapsulation : dong goi tat ca thuoc tinh phai de private


public class SinhVien {
    //Attribute : thuoc tinh
    private String maSinhVien;
    private String hoTen;
    private double gpa;
    
    //Method : Phuong thuc
    SinhVien()
    {
        this.maSinhVien = "B21DCCN222";
        hoTen = "Tran Quy Dat";
        gpa = 4.0;
    }
    public void sayHello()
    {
        System.out.println("Hello !");
    }
    public void in()
    {
        System.out.println("Msv="+maSinhVien+" hoTen="+hoTen+" gpa="+gpa);
    }
    public String getMaSinhVien()
    {
        return maSinhVien;
    }
    public void getHoTen(String s)
    {
        hoTen=s;
    }
    @Override
    public String toString()
    {
        return maSinhVien + " " + hoTen + " " + gpa;
    }
    
}
