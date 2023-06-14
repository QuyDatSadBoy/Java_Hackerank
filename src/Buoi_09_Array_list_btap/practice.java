/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi_09_Array_list_btap;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author datha
 */
public class practice {
    public static void main(String[] args) {
        // giong vector
        Scanner sc = new Scanner(System.in);
        // Array list
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> c=new ArrayList<>();
        // dung cau lenh add
        for(int i = 0 ; i < 5 ; i++)
        {
            a.add(i);
        }
        for(int i = 0 ; i < a.size() ; i++)
        {
            System.out.print(a.get(i) + " ");
        }
        System.out.println("");
        for(int x : a)
        {
            System.out.print(x + " ");
        }
        System.out.println("");
        // hàm contains kiểm tra sự tồn tại của 1 số trong Arraylist
        System.out.println(a.contains(2));
        // hàm remove(index)
        // remove((Object)(value)))
        
        // toArray trả về mảng chứa các Object như trong array list
        
        Object[] b = a.toArray();
        for(Object x : b) 
        {
            System.out.print(x + " ");
        }
        System.out.println("");
        
        // hàm indexOf() trả về chỉ số đầu tiên của phần tử được tìm kiếm
        System.out.println("Hàm forEach():");
        a.forEach((x) -> System.out.print(x + " "));
        System.out.println("");
        
        
        
    }
    
    
}
