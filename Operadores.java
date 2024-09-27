
package variables;

// esta clase enseña cada operador 

import java.util.Scanner;

public class Operadores {

    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        int numero1;
        int numero2 ;
        
        System.out.println("Digite numero 1: ");
        numero1 = entrada.nextInt();
        
        System.out.println("Digite numero 2: ");
        numero2 = entrada.nextInt();
        
        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;
        int division = numero1 / numero2;
        
        System.out.println("La suma es "+suma);
        System.out.println("La resta es"+resta);
        System.out.println("La multiplicacion es "+multiplicacion);
        System.out.println("La division es "+division);
        
        
        
        
        
    }
    
}
