package online4.alj;

import java.util.Scanner;

/**
 * El objeto Operaciones queda definido por un valor int
 * <ul>
 * <li>El valor suma int que recoge el resultado de las operaciones del método</li>
 * </ul>
 * @see #leerInt(java.lang.String) leerInt 
 * @see #resultado(int) 
 * @see #sumaFor(int, int) 
 * @see #sumaWhile(int, int) 
 * @see #sumaDoWhile(int, int) 
 * @author Alvaro
 */
    public class Operaciones {
        
        /** 
        * Atributo suma como resultado de las operaciones
        */
        public int suma = 0;
        
        /**
        * Contructor de la clase.
        * Variable int suma almacena el resultado de las operaciones de los métodos
        */
        
        public Operaciones(){
            this.suma = suma;
        }
	
        /**
        * Método que pide introducir un número por teclado
        * @param texto recibe el String a mostrar por pantalla antes de pedir el integer por teclado
        * Variable Int <code>num1</code> recoge el número introducido por el usuario por teclado
        * @return int que es el valor de <code>num1</code>
        */
        
	public int leerInt (String texto) {
		Scanner teclado = new Scanner (System.in);
                int num1;
		System.out.println(texto);
		num1 = teclado.nextInt();		
		
                return num1;
	}
        
        /**
        * Método que muestra por pantalla el resultado de las operaciones
        * @param suma int que recibe el resultado de la operación del método previamente realizado
        */
        
        public static void resultado (int suma) {
		System.out.println("La suma de los múltiplos de 5 es: " + suma);
	}
	
        /**
        * Método que calcula de suma de los múltiplos de 5 que hay entre dos números utilizando el bucle FOR
        * @param num1 recibe int que indica desde donde empieza a contar
        * @param num2 recibe int que indica donde debe terminar de contar
        * Variable int <code>suma</code> recoge la suma de los múltiplos de 5 comprendidos entre <code>num1</code> y <code>num2</code>
        * @return int que es el valor de <code>suma</code>
        */        
        
	public int sumaFor (int num1,int num2) {

		for (int i=num1;i<=num2;i++) {
                   if (i%5 == 0) {
                       suma = suma + i;
                   }
               }
           return suma;
	}

        /**
        * Método que calcula de suma de los múltiplos de 5 que hay entre dos números utilizando el bucle WHILE
        * @param num1 recibe int que indica desde donde empieza a contar
        * @param num2 recibe int que indica donde debe terminar de contar
        * Variable int <code>suma</code> recoge la suma de los múltiplos de 5 comprendidos entre <code>num1</code> y <code>num2</code>
        * @return int que es el valor de <code>suma</code>
        */        
        
	public int sumaWhile (int num1,int num2) {

		while (num1<=num2) {
                   
                   if (num1%5 == 0) {
                       suma = suma + num1;
                   }
                   num1++;
               }
            return suma;
	}
        
        /**
        * Método que calcula de suma de los múltiplos de 5 que hay entre dos números utilizando el bucle DOWHILE
        * @param num1 recibe int que indica desde donde empieza a contar
        * @param num2 recibe int que indica donde debe terminar de contar
        * Variable int <code>suma</code> recoge la suma de los múltiplos de 5 comprendidos entre <code>num1</code> y <code>num2</code>
        * @return int que es el valor de <code>suma</code>
        */        
        
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
