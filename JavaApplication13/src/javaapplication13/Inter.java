/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication13;

import javax.swing.JOptionPane;

/**
 *
 * @author samsung
 */
public class Inter {
    int x;
    int y;
    boolean z;
    
    public boolean verificar(){
        z = x <y;
        return z;
    }
    public void contador(){
        verificar();
        if(z==true){
          int b = y-x;
          for(int a=0;a<b;a++){
               System.out.println(a);
           }
        }else{
            System.out.println("o numero 1 é maior ou igual ao 2");
        }
    }
}
