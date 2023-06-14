/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi_14_Array_2_chieu_String;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author datha
 */
public class string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String s = sc.nextLine();
        System.out.println("So ban vua nhap la : "+n);
        System.out.println("Xau vua nhap la : "+s);
        System.out.println("Do dai cua xau la : " + s.length());
        System.out.println("chi so 3 cua xau la : " + s.charAt(3));
        // tat ca cac ham trong String deu tra ve xau moi
        s = s.toUpperCase();
        System.out.println("Xau sau khi in hoa la : " + s);
        // ham concat() de noi xau co the dung toan tu +
        // ham compareTo() so sanh theo thu tu tu dien
        // ham conpareToIgnoreCase() bo qua hoa thuong
        System.out.println("xau con cat tu chi so thu 5 la : " + s.substring(5,7));
        // ham substring khong lay can cuoi
        String s1 = "QUY";
        // ham contains kiem tra su ton tai
        if(s.contains(s1))
        {
            System.out.println("Xau s1 ton tai trong xau S !!!");
        }
        else
        {
            System.out.println("Xau s1 khong ton tai trong xau S");
        }    
        
        // tach tu trong xau
        String[] arr = s.split("\\s+");
        for(String x : arr)
        {
            System.out.println(x);
        }
        // c2 : Su dung lop StringTokenizer
        StringTokenizer st = new StringTokenizer(s);
        while(st.hasMoreTokens())
        {
            System.out.println(st.nextToken());
        }
        // class Character
        // isDigit() 
        // isLowerCase
        // isUpperCase
        // isAlphabetic
        // toLower
        // toUpper
        
        // chuyen so thanh xau
        // chuyen n thanh xau
        String tam=n+"";
        System.out.println("Xau n = "+tam);
        // xau sang so
        long x = Long.parseLong(tam);
        System.out.println("So n chuyen thanh so la : " + x);
        
        // duyet cac ky tu trong xau
        for(char c : s.toCharArray())
        {
            System.out.print(c + " ");
        }
        System.out.println("");
        
        // lop BigInteger
        String c1 = "1009292929929292929";
        String c2 = "1009292929929292929";
        BigInteger big1 = new BigInteger(c1);
        BigInteger big2 = new BigInteger(c2);
        System.out.println(big1.add(big2));
        System.out.println(big1.multiply(big2));
        System.out.println(big1.divide(big2));
        System.out.println(big1.subtract(big2));
        // con cac ham khac abs() gcd() max() min() mod()
        // modInverse nghich dao modul
        
        // Lop StringBuilder chen xoa them ky tu 
        // Stringbuilder sb = new StringBuilder("");
        // sb.append(Character.toUpperCase(x.charAt(0)));
        // sb.deleteCharAt(sb.length()-1);
        //System.out.println("sb.toString()");
        
        
        


        
    }
    
}
