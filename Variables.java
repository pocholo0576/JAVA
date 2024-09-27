package variables;

/**
 * este programa explica las variables 
 * @author jairo
 */
public class Variables {

    public static void main(String[] args) {
        
        /* int:  numeros enteros 1, 2, 3 ,4 ,5 ,6
        float: numeros con decimales
        double: numero decimales
        String : guarda texto o cadenas de texto: hola soy jairo
        char: garda letras
        boolean: te guarda valores booleanos: true, false
        
        */
        // creamos nuestra orimera variable entera
        int numero = 12;
        
        System.out.println(numero);
        
        
        // valor flotante
        float numero_flotante = 2.5f;
        System.out.println(numero_flotante);
        
        // numero double
        
        double numero_double = 2.5;
        System.out.println(numero_double);
        
        // char y string
        
        char caracter = 'A';
        System.out.println(caracter);
        
        String hola = "hola souy jairo";
        hola = hola + "Soy de colombia ";// "texto += soy de colombia"
        
        System.out.println(hola);
        
        // booleanooooo
        
        boolean variable_boleana = true;
        
        System.out.println(variable_boleana);
    }
    
}
