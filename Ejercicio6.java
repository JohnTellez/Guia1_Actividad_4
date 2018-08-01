import java.util.Scanner;
/**
 * Write a description of class Ejercicio6 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio6
{
    public static void main(String[] args)
    {
       System.out.println("\nHEXAGONO REGULAR\n ");
       System.out.println("-------------------------------------------------------------------------------------------------------------------------------\n\n");
       
            
       Scanner teclado = new Scanner(System.in);
       
       double LPentagono, RPentagono, APentagono, AreaP;
       
       System.out.println("Ingrese el valor del lado del pentagono, de lo contrario presione 0:  ");
       LPentagono = teclado.nextDouble();
       
       System.out.println("Ingrese el valor del Radio del pentagono, de lo contrario presione 0:  ");
       RPentagono = teclado.nextDouble();
       
       System.out.println("Ingrese el valor del Apotema del pentagono, de lo contrario presione 0:  ");
       APentagono = teclado.nextDouble();
       
       AreaP = ((LPentagono * 6) * APentagono) / 2; 
       
       if ((RPentagono == 0) && (APentagono == 0)){
           AreaP = 1.72048 * Math.pow(LPentagono,2);
        }
       if (APentagono == 0) {
           APentagono = Math.sqrt(Math.pow(RPentagono, 2)-Math.pow(LPentagono / 2, 2));
           AreaP = ((LPentagono * 6) * APentagono)/2;
        }
       
       System.out.println("El Area del Apotema del pentagono es:  " + AreaP + " cm");
    }
}
