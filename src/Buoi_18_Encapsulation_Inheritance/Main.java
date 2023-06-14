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
public class Main {
    public static void main(String[] args) {
        SinhVien s = new SinhVien(3.5,"Tran Quy Dat","13/12/2003");
        System.out.println(s.getHoTen());
        System.out.println(s.getNgaySinh());
        System.out.println(s.getGpa());
        System.out.println(s.toString());
        
        
    }
}
