/*
 * 1 Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for.
 * 
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio1{
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Vamos a mostrar los números de 5 en 5 hasta llegar al 100: ");

        for(int i = 0; i<=100; i =i+5){
            System.out.println(i);
        }
    }
}