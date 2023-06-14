/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi_12_set_map_mang_2_chieu;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


/**
 *
 * @author datha
 */
public class Map1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Hash map không có thứ tự nào cả
        HashMap<Integer,Integer> map = new HashMap<>();
        // put(key,value) thêm cặp key value
        // size() trả về kích thước của map
        // isEmpty() kiểm tra map có rỗng không
        // clear() xóa toàn bộ các phần tử trong map
        // containsKey(x) Kiểm tra sự tồn tại các phần tử x trong Key
        // containsValue(x) Kiểm tra sự tồn tại các phần tử trong tập Value
        // get(x) lấy ra giá trị value tương ứng
        // remove(x) xóa các cặp phần tử có key là x khỏi map
        // replace(x,y> Thay thế các cặp phần tử (x,y)
        map.put(1,2);
        map.put(3,2);
        map.put(1,2);
        map.put(1,4);
        map.put(4,6);
        map.put(7,2);
        System.out.println("Size map=" + map.size());
        System.out.println("Duyệt map rất mệt mỏi !!!");
        // Buoc 1 lấy ra entySet
        Set<Map.Entry<Integer,Integer>> entrySet_1 = map.entrySet();
        for(Map.Entry<Integer,Integer> x : entrySet_1)
        {
            System.out.println(x.getKey() + " " + x.getValue());
        }
        map.clear();
        // bài toàn đếm  tần suất của các phần tử trong mảng
        int n=sc.nextInt();
        int[] a= new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(map.containsKey(a[i]))
            {
                int cnt=map.get(a[i]);
                cnt++;
                map.put(a[i],cnt);
            }
            else
            {
                map.put(a[i],1);
            }
        }
        // duyệt map 
        System.out.println("Tần suất của các phần tử vừa nhập là : ");
        Set<Map.Entry<Integer,Integer>> entry = map.entrySet();
        for(Map.Entry<Integer,Integer> x : entry)
        {
            System.out.println(x.getKey() + " " + x.getValue());
        }
        
        // LinkedHashMap 
        // TreeMap
        // các hàm trong TreeMap
        // firstkey() trả về key đầu tiên trong map
        // lastKey() trả về key cuối cùng trong map
        // firstKey() trả về key đâu tiên
        // lastKey() trả về key cuối cùng
        // fistEntry() trả về cặp phần tử đầu của map
        // lastentry() trả về cặp phần tử cuối của map
        // floorKey() trả về key lớn nhất nhỏ hơn <=x
        // floorEntry() trả về cặp phần tử lớn nhất nhỏ hơn <= x
        // ceilingKey() trả về key nhỏ nhất >= x
        // ceilingEntry() trả về cặp phần tử nhỏ nhất >= x
        
        
    }
}
