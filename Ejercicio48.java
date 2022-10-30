/**
 * 48 Realiza un programa que diga los dígitos que aparecen y los que no aparecen
 * en un número entero introducido por teclado. El orden es el que se muestra en
 * los ejemplos. Utiliza el tipo long para que el usuario pueda introducir números
 * largos.
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio48{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.print("Dime un número: ");
        long numero = sc.nextLong();
        boolean cero=true;
        boolean uno=true;
        boolean dos=true;
        boolean tres=true;
        boolean cuatro=true;
        boolean cinco=true;
        boolean seis=true;
        boolean siete=true;
        boolean ocho=true;
        boolean nueve=true;
        
        while(numero > 0){
            if(numero%10 == 0){
                cero=false;
            }
            if(numero%10 == 1){
                uno=false;
            }
            if(numero%10 == 2){
                dos=false;
            }
            if(numero%10 == 3){
                tres=false;
            }
            if(numero%10 == 4){
                cuatro=false;
            }
            if(numero%10 == 5){
                cinco=false;
            }
            if(numero%10 == 6){
                seis=false;
            }
            if(numero%10 == 7){
                siete=false;
            }
            if(numero%10 == 8){
                ocho=false;
            }
            if(numero%10 == 9){
                nueve=false;
            }
            numero/=10;
        }
        
        System.out.print("Los numeros que aparecen son: ");

        if(cero == false){
            System.out.print("0");
        }
        if(uno == false){
            System.out.print("1");
        }
        if(dos == false){
            System.out.print("2");
        }
        if(tres == false){
            System.out.print("3");
        }
        if(cuatro == false){
            System.out.print("4");
        }
        if(cinco == false){
            System.out.print("5");
        }
        if(seis == false){
            System.out.print("6");
        }
        if(siete == false){
            System.out.print("7");
        }
        if(ocho == false){
            System.out.print("8");
        }
        if(nueve == false){
            System.out.print("9");
        }

        System.out.println("");

        System.out.print("Los numeros que no aparecen son: ");

        if(cero){
            System.out.print("0");
        }
        if(uno){
            System.out.print("1");
        }
        if(dos){
            System.out.print("2");
        }
        if(tres){
            System.out.print("3");
        }
        if(cuatro){
            System.out.print("4");
        }
        if(cinco){
            System.out.print("5");
        }
        if(seis){
            System.out.print("6");
        }
        if(siete){
            System.out.print("7");
        }
        if(ocho){
            System.out.print("8");
        }
        if(nueve){
            System.out.print("9");
        }
        sc.close();
    }
}

