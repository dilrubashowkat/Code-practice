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
public class ClassFactory {
    
    public FactoryShape Return_Object(String s){
        
        if(s.equalsIgnoreCase("circle"))
            return new Circle();
        else if(s.equalsIgnoreCase("square"))
            return new Square();
        else
            return null;
        
    } 
}
