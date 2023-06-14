/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi_14_Array_2_chieu_String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author datha
 */
public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        Integer[] a={0,1,2,3,4};
        int i = 3;
        String s = "Tran Quy Dat";
        System.out.println(s.lastIndexOf('2'));
        StringBuilder s1 = new StringBuilder(s);
        s1.replace(2,4,"3");
        System.out.println(s1);
        StringTokenizer s2 = new StringTokenizer(s);
        String f = String.format("%010d",i);
        System.out.println("s=" + f);
        
    }
    
}
