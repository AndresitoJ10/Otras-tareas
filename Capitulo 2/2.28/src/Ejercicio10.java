
 import java.util.Scanner; 
 
 public class Ejercicio10{
    
    public static void main(String arg[]){
        
        Scanner entrada = new Scanner(System.in);
        int radio;
        System.out.println("\nPor favor introduzca un radio y le dare el diametro, el perimetro y el area:");
        radio = entrada.nextInt();
        System.out.printf("\nEl diametro del circulo es: %d", 2*radio);
        System.out.printf("\nEl perimetro del circulo es: %f", 2*Math.PI*radio);
        System.out.printf("\nEl area del circulo es: %f\n", Math.PI*radio*radio);
    }  
 }