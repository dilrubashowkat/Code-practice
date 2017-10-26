/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice;
import java.util.HashMap;

/**
 *
 * @author Dilruba Showkat
 */
public class JavaPractice {

    /**
     * @param args the command line arguments
     * 
     */
    public static void Sting_to_Int(String ss)
    {
       long number = 0; int sign = 0; 
       char firstC = 0;
       int len = ss.length();
       int start = 0;
       
       if(ss==null)
            System.out.println("not a number");
       firstC = ss.charAt(0);
       
       if(firstC == '-')
          {
           sign = -1;
           start = 1;
          }
       
       
       else if(firstC == '+')
        {
           sign = 1;
           start = 1;
        }
       
       for(int i=start;i<len;i++)
       {
            if(!Character.isDigit(ss.charAt(i)))
            { number = sign*number;
              break;
            }
               
            number = number*10+ss.charAt(i)-'0';
            if(sign==1 && number>Integer.MAX_VALUE)
                 number = Integer.MAX_VALUE;
            if(sign==-1 && number<Integer.MIN_VALUE)
                 number = Integer.MIN_VALUE;

       }
       
        System.out.println("Atoi: String -> Number (Integer)"+number);
        
    }
    public static void printArray(int r[]){
        
        for(int i=0;i<r.length;i++)
            System.out.println(r[i]+"\t");
        return;
    }
    public static void reverse_array(int number) //this method reverses a given integer input #7
    {
        int val = number;
        int result = 0;
        while(number!=0)
        {
            int rem = number%10;
            result = result*10 + rem;
            
            number /= 10;
        }
        System.out.println("Reverse integer of " + val +" "+ "is " + result);
    }
    public static void sum_two(int array[], int number) //A method that prints the two numbers when add up gives the target number. #1
    {
 
        int res []= new int[2];
        HashMap<Integer,Integer> hm= new HashMap<Integer,Integer>();
        for(int i=0;i<array.length;i++)
        {
            if(hm.containsKey(number-array[i])){
                res[1]=i+1;
                res[0]=hm.get(number-array[i]);
                printArray(res);
            break;
        }
            hm.put(array[i], i+1);
        }
   
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int nums [] = {5,6,3,4,2,9,10,34,56};
        int make = 7;
        sum_two(nums,make);
        
        int target = 97333;
        reverse_array(target);
        
        String s = "795";
        Sting_to_Int(s);
        
    }
    
}
