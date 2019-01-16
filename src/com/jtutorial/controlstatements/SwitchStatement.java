/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jtutorial.controlstatements;

/**
 *
 * @author rdhee
 */
public class SwitchStatement {
    public String dayCheck(int dayNum){
        switch(dayNum){
            case 1:
            return "Sunday";
            
            case 2:
                return "Monday";
            case 3:
                return "Tuesday";
            case 4:
                return "Wednesday";
            case 5:
                return "Thursday";
            case 6:
                return "Friday";
            case 7:
                return "Saturday";
            
            default:
                return "Error Day";
        }
    }
}
