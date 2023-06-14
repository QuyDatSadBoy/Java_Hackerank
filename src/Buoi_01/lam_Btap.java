/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi_01;

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author datha
 */
public class lam_Btap {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();
        long z = sc.nextLong();
        long t = sc.nextLong();
        System.out.println(Math.max(x,y));
        System.out.println(Math.min(z,t));
        System.out.println(Math.max(x,Math.max(y,z)));
        System.out.println(Math.min(Math.min(x,y),Math.min(z,t)));
        
    }

}
