/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi_17_Static;

/**
 *
 * @author datha
 */
public class Static {
    public static void main(String[] args) {
        // ham static co the goi thong qua ten class
        // primitive variable 
        // reference variable
        // sinh vien s = t thi la gan bien nay quan ly cx 1 dia chi
        // Try-catch xu ly ngoai le
        try{
            int a = 100;
            int b = 0;
            System.out.println(a/b);
            
        }catch(Exception e)
        {
            // loi Unchecked exception
            System.out.println("Loi chia cho so 0 runtime error");
            System.out.println(e);
        }finally{
            System.out.println("xin chao moi nguoi!!!");
        }
        System.out.println("Tran Quy Dat");
        
    }
}
