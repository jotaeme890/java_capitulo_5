/** 
 * 25 Realiza un programa que pida un número por teclado y que luego muestre ese número al revés.
 * 
 * @author jotaeme
*/



import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String args []){
        Scanner sc= new Scanner(System.in);

        float suma=0;
        float n;
        float cont = 0;

        do {
            System.out.print("Dime un número para añadirlo a la suma: ");
            n =sc.nextFloat();
            suma += n;

            cont ++;

        } while (suma < 10000);
        System.out.println("El total de la suma es: " + suma);
        System.out.println("El total de valores introducido es: " + cont);
        System.out.println("La media es: " + suma/cont);



        sc.close();
    }
}
