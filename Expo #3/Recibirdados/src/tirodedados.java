import java.util.Scanner;
 import java.util.Random;
 
 public class tirodedados
 { 

 Scanner entrada = new Scanner(System.in);
 Random aleatorio = new Random();
 private int taman;
 int[] Arr;
 
 
 public void Recibir()
 {  
 System.out.print("\nPor favor introduzca el numero de veces que se lanzaran ");
 System.out.print(" los dados\n");
 taman = entrada.nextInt();
 Arr = new int[taman];
 Lanzar();
 }  


 
 // Metodo Lanzar
 

 public void Lanzar()
 {  
 int numero1;
 int numero2;
 
 for ( int i = 0; i < Arr.length; i++ )
 {      // Abre for
 numero1 = 1 + aleatorio.nextInt(6); 
 numero2 = 1 + aleatorio.nextInt(6);
 
 Arr[i] = numero1 + numero2; 
 }     

 Contar();
 }  
 
 // Metodo Contar


 public void Contar()
 {     
 int Contador[] = new int[13];
 
 for ( int j = 0; j < Arr.length; j++ )
 {  
 for ( int k = 0; k < Contador.length; k++ )
 {     
 if ( Arr[j] == k )
 Contador[k]++;
 }  
 }  

 mostrar(Contador); 

 }     
 
 public void mostrar( int B[])
 {
 for (int i = 0; i < B.length; i++ )
 {     
 System.out.printf("\n%d lanzamientos sumaron %d\n", B[i], i ); 
 }      
 }  

 } 
