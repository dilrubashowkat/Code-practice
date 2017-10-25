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
public class Square implements FactoryShape{
    
     public void shape(int param)
    {
        double area = param*param;
        System.out.println("Drawing a with param "+ "with param " + param +"Area "+area);
    }
    
}
