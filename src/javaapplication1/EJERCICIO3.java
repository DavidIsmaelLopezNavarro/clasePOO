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
public class EJERCICIO3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner ent = new Scanner (System.in);
        String mensaje;
        System.out.println("INGRESE EL MENSAJE");
        mensaje = ent.nextLine();
        mostrarMensaje(mensaje);
        //Fin de main
        
    }
    
   static void mostrarMensaje(String texto){
        
        System.out.println(texto);

    }//fin de mostrarMensaje

    }
