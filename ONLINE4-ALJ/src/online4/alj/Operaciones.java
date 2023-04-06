/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package online4.alj;

import java.util.Scanner;

/**
 *
 * @author ENVY
 */
public class Operaciones {
    
    int suma=0;
    
        public Operaciones(){
            this.suma = suma;
        }
	
	public int leerInt (String texto) {
		Scanner teclado = new Scanner (System.in);
                int num1;
		System.out.println(texto);
		num1 = teclado.nextInt();		
		
                return num1;
	}
        
        public static void resultado (int suma) {
		System.out.println("La suma de los múltiplos de 5 es: " + suma);
	}
	
	public int sumaFor (int num1,int num2) {

		for (int i=num1;i<=num2;i++) {
                   if (i%5 == 0) {
                       suma = suma + i;
                   }
               }
           return suma;
	}

	public int sumaWhile (int num1,int num2) {

		while (num1<=num2) {
                   
                   if (num1%5 == 0) {
                       suma = suma + num1;
                   }
                   num1++;
               }
            return suma;
	}
        
        public int sumaDoWhile (int num1,int num2) {

		do {
                   if (num1%5 == 0) {
                       suma = suma + num1;
                   }
                   num1++;
               } while (num1<=num2);
               return suma;
	}
}
