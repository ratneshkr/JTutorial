package jtutorial;

import com.jtutorial.loops.ForLoop;
import java.util.Scanner;

public class JTutorial {

    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        System.out.println("---------Training Begins here-------------");
        
//        FunctionTest ft=new FunctionTest();
//        ft.testFunction();
//        
//        System.out.println(ft.vatRate());
//        System.out.println(ft.simpleInterest(1200,15, 3));
//        
//        
//        Ifstatement ifs=new Ifstatement();
//        System.out.println("IF:- "+ifs.greaterNumber(111, 11));
//        
//        System.out.println("IF ElSE:- "+ifs.greaterNumberUsingIFELSE(123, 321));
//        
//        System.out.println(ifs.dayCheck(1));
//        
//        SwitchStatement sw=new SwitchStatement();
//        System.out.println(sw.dayCheck(2));
        
//        String userName=null, password=null;
//        userName=sc.nextLine();
//        password=sc.nextLine();
//        WelcomeUserClass w=new WelcomeUserClass();
//        
//        if(ifs.loginCheck(userName, password)){    
//            w.welcomeMessage(userName);
//        }else{
//            w.loginDenyMessage(userName);
//        }

//WhileLoop wl=new WhileLoop();
//wl.loopDemo(599);

ForLoop fl=new ForLoop();
fl.runNestedForLoop();
    }
    
}
