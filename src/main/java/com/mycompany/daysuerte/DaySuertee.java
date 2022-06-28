/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.daysuerte;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author deivid
 */
public class DaySuertee {
    private int day;
     private int month;
    private int annioo;
    
    public DaySuertee(int dia,int mes, int A){
      this.day = dia;
     this.month = mes;
     this.annioo = A;
  
    }
    public void GetSuerte(){
       int result = getDay() + getMonth() + getAnnioo();
     String convert = String.valueOf(result);
     String[] splitSuerte = convert.split("");
     int sum = 0;
      for( int i = 0; i < splitSuerte.length; i++){
        
       sum += Integer.parseInt(splitSuerte[i]);
          
          
      }
        JOptionPane.showMessageDialog(null, "Su numero de la suerte es: "+sum);
    }

    /**
     * @return the day
     */
    public int getDay() {
        return day;
    }

    /**
     * @param day the day to set
     */
    public void setDay(int day) {
        this.day = day;
    }

    /**
     * @return the month
     */
    public int getMonth() {
        return month;
    }

    /**
     * @param month the month to set
     */
    public void setMonth(int month) {
        this.month = month;
    }

    /**
     * @return the annioo
     */
    public int getAnnioo() {
        return annioo;
    }

    /**
     * @param annioo the annioo to set
     */
    public void setAnnioo(int annioo) {
        this.annioo = annioo;
    }

    /**
     * @return the day
     */
   
 

}
