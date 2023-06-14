/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi_19_Abstraction_Polymorphism;

/**
 *
 * @author datha
 */
public class Polymorphism {
    private int attribute;

    public int getAttribute() {
        return attribute;
    }

    public void setAttribute(int attribute) {
        this.attribute = attribute;
    }
    
    public static void main(String[] args) {
        Polymorphism s = new Polymorphism();
        System.out.println(s instanceof Polymorphism);
    }
}
