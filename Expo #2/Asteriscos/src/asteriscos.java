
import java.util.Scanner;

public class asteriscos

{     

public static void main( String args[])
{     
System.out.print("\nEste programa recibe un entero e imprime ");
System.out.println("un cuadrado de asteriscos con ese numero de lado.");

int lado;
Scanner entrada = new Scanner(System.in);
Asteriscos miObjeto = new Asteriscos();

System.out.println("\nPor favor introduzca un entero: ");
lado = entrada.nextInt();

miObjeto.Cuadrado(lado);
  
}     
} 