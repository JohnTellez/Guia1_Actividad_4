import java.util.Scanner;
/**
 * Datos de entrada: - Medida del circulo
 *                   - Altura
 *                   
 * Datos de salida:  - Radio
 *                   - Area
 *                   - Volumen del tronco de cono
 */
public class Ejercicio3
{
    public static void main(String[] args)
    {
       Scanner teclado = new Scanner(System.in);
       // Variables
       double Mcirculo, Radio, DosPi, Area, Volumen, Pi, Altura; 
               
       // Recoger datos
       System.out.println("CALCULO DEL VOLUMEN DEL TRONCO DE CONO\n ");
       System.out.println("-------------------------------------------------------------------------------------------------------------------------------\n\n");
       
       System.out.print("Ingrese la medida del circulo (cm):  ");
       Mcirculo = teclado.nextDouble();
       
       System.out.print("Ingrese la altura (cm):  ");
       Altura = teclado.nextDouble();
       
       System.out.println("-------------------------------------------------------------------------------------------------------------------------------\n\n");
       
       //Calculos
       Pi = 3.14;
       
       DosPi = 6.28;
       
       Radio = Mcirculo / DosPi;
       
       Area = Pi * Radio * Radio;
       
       Volumen = Area * Altura;
       
       
       //Resultados
       System.out.println("Resultados:\n");
       
       System.out.println("Radio: " + Math.round(Radio * 100d) / 100d + " cm"); //Redondear los decimales con Math.round()
       
       System.out.println("Area:  " + Math.round(Area * 100d) / 100d + " m2");
       
       System.out.println("Volumen Tronco de Cono:  " + Math.round(Volumen * 100d) / 100d + " m3");
       
       
    }
}
