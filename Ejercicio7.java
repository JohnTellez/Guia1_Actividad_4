import java.util.Scanner;
/**
 * Write a description of class Ejercicio7 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio7
{
    public static void main(String[] args)
    {
       Scanner teclado = new Scanner(System.in);
       // Variables
       double LadoA, LadoB, LadoC, Sperimetro, Area, Cradius; 
               
       // Recoger datos
       System.out.println("CALCULO DE SEMIPERIMETRO, AREA, CIRCUMRADIUS DE UN TRIANGULO\n ");
       System.out.println("-------------------------------------------------------------------------------------------------------------------------------\n\n");
       
       System.out.print("Ingrese la medida del lado A del triangulo (cm):  ");
       LadoA = teclado.nextDouble();
       
       System.out.print("Ingrese la medida del lado B del triangulo (cm):  ");
       LadoB = teclado.nextDouble();
       
       System.out.print("Ingrese la medida del lado C del triangulo (cm):  ");
       LadoC = teclado.nextDouble();
       
       System.out.println("-------------------------------------------------------------------------------------------------------------------------------\n\n");
       
       double Pi = 3.14;
       
       Sperimetro = (LadoA + LadoB + LadoC) / 2;
       
       Area = Math.sqrt(Sperimetro * ((Sperimetro - LadoA) * (Sperimetro - LadoB) * (Sperimetro - LadoC)));
       
       Cradius = (LadoA * LadoB * LadoC) / (4 * Pi *(Math.sqrt(Sperimetro * (Sperimetro - LadoA) * (Sperimetro - LadoB) * (Sperimetro - LadoC))));
       
       System.out.println("Resultados:\n");
       
       System.out.println("Semiperimetro: " + Math.round(Sperimetro * 100d) / 100d + " cm"); //Redondear los decimales con Math.round()
       
       System.out.println("Area:  " + Math.round(Area * 100d) / 100d + " m2");
       
       System.out.println("Circumradius:  " + Cradius + " cm");
       
       System.out.println("-------------------------------------------------------------------------------------------------------------------------------\n\n");
       
       
       
    }
}
