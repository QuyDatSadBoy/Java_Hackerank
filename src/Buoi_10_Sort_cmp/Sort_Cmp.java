/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi_10_Sort_cmp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author datha
 */
public class Sort_Cmp {
    public static int tong(int n)
    {
       int sum=0;
       while(n>0)
       {
           sum+=n%10;
           n/=10;
       }
       return sum;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        Integer[] a=new Integer[n];
        ArrayList<Integer> b = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            b.add(a[i]);
        }
//        Arrays.sort(a,new Comparator<Integer>(){
//            @Override
//            public int compare(Integer t, Integer t1) {
//                
//            }
//        });
        System.out.println("Đây là hàm gọi không viết cmp !!!");
        Arrays.sort(a);
        for(int x:a)
        {
            System.out.print(x+" ");
        }
        System.out.println("");
//        System.out.println("Đây là sort giảm dần !");
//        Arrays.sort(a,Collections.reverseOrder());
//        for(int x:a)
//        {
//            System.out.print(x + " ");
//        }
//        System.out.println("");
        System.out.println("Đây là sort giảm dần có cmp");
        Arrays.sort(a,new Comparator<Integer>(){
            @Override
            public int compare(Integer t, Integer t1) {
                if(t>t1) return -1;
                else return 1;
            }
        });
        for(int x:a)
        {
            System.out.print(x+" ");
        }
        System.out.println("");
        System.out.println("Đây là hàm sắp xếp theo abs nhé !!!");
        Arrays.sort(a,new Comparator<Integer>(){
            @Override
            public int compare(Integer t, Integer t1) {
                if(Math.abs(t)<Math.abs(t1)) return -1;
                else return 1;
            }
        });
        for(int x:a)
        {
            System.out.print(x + " ");
        }
        System.out.println("");
        System.out.println("Đây là hàm sắp xếp theo tổng chữ số nhé !!!");
        Arrays.sort(a,new Comparator<Integer>(){
            @Override
            public int compare(Integer t, Integer t1) {
                if(tong(t)<tong(t1)) return -1;
                else return 1;
            }
        });
        for(int x : a)
        {
            System.out.print(x+" ");
        }
        System.out.println("");
        System.out.println("Đây là sort cho ArrayList !!!");
        Collections.sort(b);
        for(int x : b)
        {
            System.out.print(x + " ");
        }
        System.out.println("");
        
    }
}
