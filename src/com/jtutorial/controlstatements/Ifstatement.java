/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jtutorial.controlstatements;

public class Ifstatement {

    public int greaterNumber(int x, int y) {
        if (x > y) {
            return x;
        }
        return y;
    }

    public int greaterNumberUsingIFELSE(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }

    public boolean loginCheck(String id, String pass) {
        if (id.equals("user101") && pass.equals("Pass@123")) {
            return true;
        } else {
            return false;
        }
    }
    
    public String dayCheck(int dayNum){
        if (dayNum==1) {
            return "Sunday";
        }else if(dayNum==2){
            return "Monday";
        }else if(dayNum==3){
            return "Tuesday";
        }else if(dayNum==4){
            return "Wednesday";
        }else if(dayNum==5){
            return "Thursday";
        }else if(dayNum==6){
            return "Friday";
        }else if(dayNum==7){
            return "Saturday";
        }else{
            return "Error day";
        }        
    }

}
