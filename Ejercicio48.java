/**
 * 48 Realiza un programa que diga los dígitos que aparecen y los que no aparecen
 * en un número entero introducido por teclado. El orden es el que se muestra en
 * los ejemplos. Utiliza el tipo long para que el usuario pueda introducir números
 * largos.
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio48 {
    public static void main (String args []){
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime un número: ");
        long numero = sc.nextLong();
        String dentro = "";
        String fuera = "";

        long aux = numero;

        for (int i = 0 ; i<= 9 ; i++){ //tiene todos los dígitos posible
            aux = numero;
            while(aux >= 10){ //todos los dígitos del número
                if(aux%10 == i){
                    dentro += i;
                    aux = -1; //para salir del while
                } else
                    aux/=10;
            }
            if(aux == i){
                dentro += i ; //almacenos en la variable para despues mostrarlas
                aux = -1; //para salir del while
            }
        }
        
        long usado = Long.parseLong(dentro);

        for (int i=123456789; i>10; i/=10){
            if (i%10 == usado%10){
                usado /= 10;
            }else {
                fuera=i%10 + "" +fuera;
            }
        }
        
        System.out.print("Los valores que salen son: " + dentro + " y los valores que no salen son: " + fuera);
        sc.close();
    }
}

