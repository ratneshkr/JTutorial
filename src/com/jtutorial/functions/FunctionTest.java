
package com.jtutorial.functions;

public class FunctionTest {
    
   public void testFunction(){
        System.out.println("Hi There! I am Your Function");
    }
   
   public int vatRate(){
       return 13;
   }
   
   public int simpleInterest(int p, int r, int t){
       return (p*r*t)/100;
   }
   
}
