/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mathOp;

/**
 *
 * @author Hansel Vallerio H
 */
public class MatematikaCanggih extends Matematika{
    void pertambahan () {
        hasil = a + b;
        System.out.println(a+" + "+b+" = "+hasil);
    }
    
    void pengurangan () {
        hasil = a - b;
        System.out.println(a+" - "+b+" = "+hasil);
    }
    
    void perkalian () {
        hasil = a * b;
        System.out.println(a+" x "+b+" = "+hasil);
    }
    
    void pembagian () {
        hasil = a / b;
        System.out.println(a+" : "+b+" = "+hasil);
    }
    
    void sisaBagi () {
        hasil = a % b;
        System.out.println(a+" % "+b+" = "+hasil);
    }
}
