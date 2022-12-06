/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author USER
 */
public class Mavenproject1 {

  public static void main(String[] args) throws IOException {
      InputStreamReader inputStreamReader = new InputStreamReader(System.in);
      BufferedReader reader = new BufferedReader(inputStreamReader);
      
      
      System.out.println("Ingrese un numero:");
      String numeroRandom = reader.readLine();
      Integer numeroConverRandom = Integer.parseInt(numeroRandom);
      
      
        if (numeroConverRandom % 2 == 0 ){
            System.out.println("El numero es par"); 
            
            
            
            }
        if (numeroConverRandom % 2 == 1){
            System.out.println("El numero es impar"); 
            }
      
        
    }
}
