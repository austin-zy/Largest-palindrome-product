/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package largest.palindrome.product;

import java.util.Stack;

/**
 *
 * @author Austin
 */
public class LargestPalindromeProduct {

    /**
     * @param args the command line arguments
     * 

            A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

            Find the largest palindrome made from the product of two 3-digit numbers.

     */
    public static Boolean palindromeChecker(int foo){
        Boolean bool=true;
        Stack stack = new Stack();
        String temp = Integer.toString(foo);
        for(int i=0;i<temp.length();i++){
            stack.push(temp.charAt(i));
        }
        for(int i=0;i<temp.length();i++){
            if(stack.pop().equals(temp.charAt(i))){
                
            }
            else{
                bool=false;
                break;
            }
        }
        return bool;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int pal=0;
        for(int x=100;x<1000;x++){
            for(int y=100;y<1000;y++){
                int prod = x*y;
                if(palindromeChecker(prod)){
                   if (prod>pal){
                       pal = prod;
                   }  
                } 
            }
        }
        System.out.println(pal);
    }
    
}
