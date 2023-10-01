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
public class Contest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long k2 = sc.nextLong(), k3 = sc.nextLong(), k5 = sc.nextLong(), k6 = sc.nextLong();
        long dem256 = Math.min(k2, Math.min(k5, k6));
        k2 -= dem256;
        long dem32 = Math.min(k2, k3);
        System.out.println(dem256 * 256 + dem32 * 32);
        
    }

}
