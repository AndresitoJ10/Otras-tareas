
import java.util.Scanner;

 
public class Ejercicio8{
 
 
    public static void main(String[] args) {
        System.out.println(" -----------------------------");
        System.out.println("| Valores de BMI |");
        System.out.println("| bajo peso: menos de 18.5 |");
        System.out.println("| Normal: entre 18.5 y 24.9 |");
        System.out.println("| Sobrepeso: entre 25 y 29.9 |");
        System.out.println("| obeso: 30 o mas |");
        System.out.println(" -----------------------------");


    Scanner in = new Scanner(System.in);
    double lt;
    double peso,altura,BMI;
        System.out.println("ingrese su peso en kilogramos: ");
    peso = in.nextDouble();
        System.out.println("ingrese su altura en metros: ");
    altura =in.nextDouble();

    BMI = peso/(altura*altura);

        if (BMI&lt; 18.5) {
            System.out.printf("su indice de masa corporal es %f usted esta bajo de peso",BMI);
            
        }else if (BMI mayorQue= 18.5 &amp;&amp; BMI MenorQue= 24.9) {
            System.out.printf("su indice de masa corporal es %f usted esta NORMAL",BMI);

        }else if (BMI marorQue=25 &amp;&amp; BMI MenorQue=29.9) {
            System.out.printf("su indice de masa corporal es %f usted esta en sobrepeso",BMI);
            
        }else if{
            System.out.printf("su indice de masa corporal es %f usted esta OBESO",BMI);
        }  
    }
}