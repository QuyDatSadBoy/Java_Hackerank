/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi_06_Gcd;

import java.util.Scanner;

/**
 *
 * @author datha
 */
public class Gcd {
    // gcd : greatest common divisor
    // lcm : least common multipe
    public static long gcd(long a,long b)
    {
        if(b==0) return a;
        else return gcd(b,a%b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Cong thuc legendre
        long a=sc.nextLong(),b=sc.nextLong();
        System.out.println("gcd("+a+","+b+")="+gcd(a,b));
    }
    
}
