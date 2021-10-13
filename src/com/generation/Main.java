package com.generation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Ciclo for: sirve para repetir un bloque de código n veces.
        /*
        for(cont = 0; cont < num; cont++){
            // Código que se repite;
        }
        */
        /*

        Scanner sc = new  Scanner(System.in);
        System.out.println("Ingresa un número");

        int num = sc.nextInt();
        sc.close();

        for(int i = 1; i <= 10; i++){

            if ( i % 2 == 0){
                // Pasa a la siguente iteración sin terminar de ejecutar el código de abajo.
            continue;
            }
            System.out.println(num + "x" + i + " = " + (num*i));
            */
            /*
            if ( i == 8){
                // Pasa a la siguente iteración sin terminar de ejecutar el código de abajo.
                break;
            }
            *

        }

        /* Sucesion for */
        /*
        Scanner sc = new  Scanner(System.in);
        System.out.println("Ingresa un número");
        int num = sc.nextInt();
        sc.close();

        int i = 0, a = 0, b = 1, c = 0;
        System.out.println("Sucesión for: ");
        for(i = 0; i < num; i++){
            if(i < num){
                System.out.print(a + ",");
                c = a + b;
                a = b;
                b = c;
            } else {
                System.out.print(a);
            }
        }
        System.out.println("");

         */

        /* Sucesion while */
        /*
        i = 0;
        b = 1;
        a = 0;
        c = 0;
        System.out.println("Sucesión while: ");
        while(i < num){
            if(i < num){
                System.out.print(a + ",");
                c = a + b;
                a = b;
                b = c;
            } else {
                System.out.print(a);
            }
            i++;
        }
        System.out.println("");

         */

        /* Sucesion do while */
        /*
        i = 0;
        b = 1;
        a = 0;
        c = 0;
        System.out.println("Sucesión do while: ");
        do {
            if(i < num){
                System.out.print(a + ",");
                c = a + b;
                a = b;
                b = c;
            } else {
                System.out.print(a);
            }
            i++;
        }while(i < num);*/

        // Ciclo while, mientras la condicion se cumpla se va a repetir el código.
        /*
        * while(condicion)*//*

        Scanner sc = new Scanner(System.in);
        System.out.println("Adivina el número secreto. Ingresa un número: ");
        int numero = sc.nextInt();
        int numeroSecret = 33;

        while(numero != numeroSecret){
            System.out.println("Fallaste. Intenta de nuevo: ");
            numero = sc.nextInt();
        }
        sc.close();
        System.out.println("¡¡¡Esoooo Tilin!!!. ¡Felicidades, adivinaste el número secreto!");
        */

        // Ciclo do while
        /*

        Scanner sc = new Scanner(System.in);
        int numero = 0;
        int numeroSecret = 33;


        do {
            System.out.println("Adivina el número secreto. Ingresa un número: ");
            numero = sc.nextInt();
            System.out.println("Fallaste. Intenta de nuevo ");
        } while(numero != numeroSecret);

        sc.close();
        System.out.println("¡¡¡Esoooo Tilin!!!. ¡Felicidades, adivinaste el número secreto!");
        */

        // Factorial
        Scanner leer = new Scanner(System.in);
        int numero = 0; //almacenara el numero
        int factorial = 1; // " valor final.
        System.out.println("Digite el número a calcular su factorial");
        numero = leer.nextInt();
        int numero1 = numero;
        while(numero != 0){
            factorial *= numero;
            numero --;
        }
        System.out.println("Factorial de " + numero1 + " es: " + factorial);
    }


}
