/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package online4.alj;

import java.util.Scanner;

/**
 *
 * @author ENVY
 */
public class ONLINE4ALJ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          int opcion,num1,num2,suma=0;
        Scanner teclado = new Scanner (System.in);
       Operaciones operaciones = new Operaciones ();
       boolean bucle=false;
       
       System.out.println("¿Con que tipo de bucle quieres realizar el ejercicio?");
       System.out.println("1- Hacerlo con un FOR");
       System.out.println("2- Hacerlo con un WHILE");
       System.out.println("3- Hacerlo con un DO WHILE");
       opcion= teclado.nextInt();
       
       do {

       num1 = operaciones.leerInt("¿Desde que número quieres empezar a sumar los  múltiplos de 5?");
       num2 = operaciones.leerInt("En que número quieres que termine de sumar los múltiplos de 5");
       
       if (num1>num2) {
           System.out.println("El primer número deber ser menor que el segundo");
           System.out.println("****************************");
           bucle = true;
       } else if (num1<num2) {
           bucle = false;
       }
       } while (bucle);
       
       switch (opcion) {
           case 1:
               suma = operaciones.sumaFor(num1, num2);
               break;
           case 2:
               suma = operaciones.sumaWhile(num1, num2);
               break;
           case 3:
               suma = operaciones.sumaDoWhile(num1, num2);
               break;
       }
       
       Operaciones.resultado(suma);
    }
    
}
