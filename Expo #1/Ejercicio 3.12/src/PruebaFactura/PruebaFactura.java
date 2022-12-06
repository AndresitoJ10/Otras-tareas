
package PruebaFactura;

import java.util.Scanner;
        
public class PruebaFactura{

    
    public static void main(String[] args) {
       String NumP=null;
       String Des=null;
       int cant=0;
       double Prec=0.0;
       
       Factura fact = new Factura(NumP,Des, cant, Prec);
       char respuesta;
       Scanner entrada = new Scanner(System.in);
       
        System.out.println("-------------Bienvenido------------");
        do{
            System.out.println("Ingrese el numero de pieza:");
            NumP = entrada.next();
            System.out.println("Ingrese la descripcion de la pieza:");
            Des=entrada.next();
            System.out.println("Ingrese la cantidad de piezas:");
            cant = entrada.nextInt();
            System.out.println("Ingrese el precio de la pieza:");
            Prec = entrada.nextDouble();
            
            fact.obtenerMontoFactura (cant,Prec);
            System.out.println("Desea ingresar otro producto?");
            respuesta = entrada.next().charAt(0);
            
        }while(respuesta == 's' || respuesta == 'S');
            System.out.println("Su precio total a pagar es: " + fact.montoFactura + " Lps");
    }   
}
