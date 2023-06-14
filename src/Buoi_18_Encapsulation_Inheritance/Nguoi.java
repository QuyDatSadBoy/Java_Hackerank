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
public class Nguoi {
    private String hoTen,ngaySinh;
    
    public Nguoi(String hoTen,String ngaySinh)
    {
        this.hoTen=hoTen;
        this.ngaySinh=ngaySinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    @Override
    public String toString()
    {
        return this.hoTen + " " + this.ngaySinh;
    }
    
}
