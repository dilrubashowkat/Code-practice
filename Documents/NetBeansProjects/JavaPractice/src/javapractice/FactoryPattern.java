/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice;

/**
 *
 * @author Dilruba Showkat
 */
public class FactoryPattern {
    
    public static void main(String[] args) {
        ClassFactory obj = new ClassFactory();
        
        FactoryShape cobj = obj.Return_Object("circle");  
        cobj.shape(9);
        
        cobj = obj.Return_Object("square");  
        cobj.shape(5);
        
    }
    
}
