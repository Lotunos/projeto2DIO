/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication13;

import java.util.Scanner;

/**
 *

 */
public class JavaApplication13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner ler = new Scanner(System.in);
      Inter obj = new Inter();
      try{
      System.out.println("Qual o primiero numero?");
      obj.x = ler.nextInt();
      System.out.println("Qual o segundo numero?");
      obj.y = ler.nextInt();
      obj.contador();
    }catch(Exception e){
      System.out.println(e);
    }
    }
    
}
