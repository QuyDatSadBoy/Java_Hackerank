/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi_19_Abstraction_Polymorphism;

import java.util.Comparator;

/**
 *
 * @author datha
 */
public class Sort_template implements Comparator<Polymorphism>{

    @Override
    public int compare(Polymorphism t, Polymorphism t1) {
       return t.getAttribute()-t1.getAttribute();
    }

    
    
}
