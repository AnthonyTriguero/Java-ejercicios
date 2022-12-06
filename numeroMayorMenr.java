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
      
      
      System.out.println("Ingrese el primer numero: ");
      String numeroUno = reader.readLine();
      Integer numeroUnoCon = Integer.parseInt(numeroUno);
      
      System.out.println("Ingrese el segundo numero: ");
      String numeroDos = reader.readLine();
      Integer numeroDosCon = Integer.parseInt(numeroDos);
 
      System.out.println("Ingrese el primer numero: ");
      String numeroTres = reader.readLine();
      Integer numeroTresCon = Integer.parseInt(numeroTres);
     
     calcularNumeroMayor(numeroUnoCon,numeroDosCon,numeroTresCon);
      
    }
    private static void calcularNumeroMayor (Integer numeroUnoCon,
                                             Integer numeroDosCon,
                                             Integer numeroTresCon)
    {
        
        Integer numeroMayor = numeroUnoCon;
      
        if (numeroDosCon > numeroMayor ){   
            numeroMayor = numeroDosCon;
            
            }
        if (numeroTresCon > numeroMayor ){   
            numeroMayor = numeroTresCon;
            
            }
      System.out.println("El numero mayor es: "+numeroMayor ); 
      
       Integer numeroMenor = numeroUnoCon;
      
        if (numeroDosCon < numeroMenor ){   
            numeroMenor = numeroDosCon;
            
            }
        if (numeroTresCon < numeroMenor ){   
            numeroMenor = numeroTresCon;
            
            }
      System.out.println("El numero menor es: "+numeroMenor ); 
        
    }
}
