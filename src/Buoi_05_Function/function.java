/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi_05_Function;

import java.util.Scanner;

/**
 *
 * @author datha
 */
public class function {
    // Trong java không có con trỏ và tham chiếu 
    // Muốn thay đổi đối số thì phải trả về giá trị muốn thay đổi r gán
    public static void printSum(int a , int b)
    {
        System.out.println(a + " " + b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 100, b = 200;
        printSum(a,b);
        
    }
    
}
