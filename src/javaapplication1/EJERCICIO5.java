/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author USER 28
 */
public class EJERCICIO5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      double n1, n2;
        Scanner leer = new Scanner(System.in);
        System.out.println("PROGRAMA QUE SUME DOS NUMEROS REALES");
        System.out.print("INGRESE EL PRIMER NUMERO REAL:");
        n1 = leer.nextInt();
        System.out.print("INGRESE EL SEGUNDO NUMERO REAL:");
        n2 = leer.nextInt();
        // primera forma usando salida de datos
        System.out.print("LA SUMA ES : " );
        System.out.println((int)sumarNumeros(n1, n2));//casting de double a i
        
        //segunda forma usando el operador de asignación
        
        int res;
        res= (int)sumarNumeros(n1,n2); //casting de double a i
        System.out.println("LA SUMA ES : "+res);

    }
   static double sumarNumeros(double a, double b){
       double s=a+b;
       //System.out.println("La suma es : " );
               return s;
    }
    
}
