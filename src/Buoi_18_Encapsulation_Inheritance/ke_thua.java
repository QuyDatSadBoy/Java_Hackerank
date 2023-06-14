/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi_18_Encapsulation_Inheritance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author datha
 */
public class ke_thua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] a = {1,2,3};
        int i = 100;
        ArrayList<Integer> a1 = new ArrayList<>();
        String s = "Tran Quy Dat";
        String s3="10000";
        StringBuilder s1 = new StringBuilder(s);
        StringTokenizer s2 = new StringTokenizer(s);
        System.out.println(Integer.toString(i));
        System.out.println(Long.parseLong(s3));
        i = sc.nextInt();
        String s4;
        sc.nextLine();
        s4=sc.nextLine();
        System.out.println(s4);
        
        
    }
}
