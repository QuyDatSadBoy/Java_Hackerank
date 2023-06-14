/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi_08_Nhap_khong_gioi_han_dau_vao;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;




/**
 *
 * @author datha
 */
public class Cac_bai_toan {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // hàm sort  trong java
        int n = sc.nextInt();
        int minV=Integer.MAX_VALUE;
        Integer[] a = new Integer[n];
        for(int i = 0;i < n; i++)
        {
            a[i] = sc.nextInt();
        }
//        Arrays.sort(a);  
        Arrays.sort(a,Collections.reverseOrder());
        for(int x:a)
        {
            System.out.println(x);
        }
        // Nhập ko biết số lượng phần tử trong java
        int[] b = new int[1000];
        int cnt=0;
        while(sc.hasNext())
        {
            int tam = sc.nextInt();
            b[cnt++]=tam;
        }
        // sc.hasNext();
        
    }
}
