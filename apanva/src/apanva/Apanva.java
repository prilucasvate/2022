/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apanva;

import java.awt.Color;

/**
 *
 * @author User
 */
public class Apanva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Welcome w=  new Welcome();
        w.setVisible(true);
        
        Color c=new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));//color rgb http://www.wahart.com.hk/rgb.htm
        w.getContentPane().setBackground(c);
          
    }
    
}
