/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi_04_Vong_lap;

import java.util.Scanner;

/**
 *
 * @author datha
 */
public class Contest2 {

    public static void main() {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong(), res = 0;
        for (long i = 1; i <= (int) (Math.sqrt(n)); i++) {
            if (n % i == 0) {
                if (i * i != n) {
                    res += i + n / i;
                } else {
                    res += i;
                }
            }
        }
        System.out.println(res);
    }

}
