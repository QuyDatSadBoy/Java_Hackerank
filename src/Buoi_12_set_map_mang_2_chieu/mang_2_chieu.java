/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi_12_set_map_mang_2_chieu;

import java.util.Scanner;

/**
 *
 * @author datha
 */
public class mang_2_chieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập cỡ của ma trận !!!");
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        System.out.println("Mời bạn nhập ma trân :");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Ma trận vừa nhập là :");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("Các phần tử trên đường chéo chính của ma trân là : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i][i]+ " ");
        }
        System.out.println("");
        
    }
  
          
}
