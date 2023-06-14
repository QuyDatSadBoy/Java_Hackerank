/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi_12_set_map_mang_2_chieu;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author datha
 */
public class set {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();
        // Chỉ lưu được các object nhé
        // các hàm trong HashSet 
        // add , remove ,size
        // hàm contains() kiểm tra sự tồn tại của 1 phần tử true or false
        // hàm clear 
        // hàm isEmpty()
        LinkedHashSet<Integer> set1 = new LinkedHashSet<>();
        int[] a={0,1,2,1,2,3,4,4};
        for(int x : a)
        {
            set.add(x);
            set1.add(x);
        }
        System.out.println("Đây là số lượng phần tử khác nhau ! " + set.size());
        // đây là LinkedHashSet 
        
        // có thêm thứ tự là thứ tự mik đưa vào set
        System.out.println("Đây là các phần tử trong LinkedHashSet ! ");
        for(int x : set1)
        {
            System.out.print(x + " ");
        }
        System.out.println("");
        TreeSet<Integer> set2 = new TreeSet<>();
        // có thứ tự xuất hiện
        int[] b={5,3,2,6,7};
        for(int x:b)
        {
            set2.add(x);
        }
        System.out.println("Thứ tự trong TreeSet là !!");
        for(int x:set2)
        {
            System.out.print(x + " ");
        }
        // Các hàm trong TreeSet là 
        // floor(x) trả về phần tử lớn nhất <= x hoặc null
        // ceiling(x) trả về phần tử nhỏ nhất >= x
        // first() trả về phần tử đầu tiên hay nhỏ nhất
        // last() trả về phần tử cuối hay max
        // lower() trả về phần tử lớn nhất <x hoặc null
        // higher() trả về phần tử nhỏ nhất lớn hơn x hoặc null
        System.out.println("Phần tử đầu tiên:");
        System.out.println(set2.first());
        System.out.println("Phần tử cuói:");
        System.out.println(set2.last());
        // ví dụ với tam = 3;
        System.out.println("Phần tử lớn nhất nhỏ hơn hoặc bằng tam:");
        System.out.println(set2.floor(3));
        System.out.println("Phần tử nhỏ nhất >= tam là :");
        System.out.println(set2.ceiling(3));
        System.out.println("Phần tử lớn nhất nhỏ <x là:" );
        System.out.println(set2.lower(3));
        System.out.println("Phần tử min >x là :");
        System.out.println(set2.higher(3));
        System.out.println("");
        ArrayList<Character> c = new ArrayList<>();
        
    }
    
}
