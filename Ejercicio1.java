import java.util.Scanner;
/**
 * Datos de entrada: - Dimension lado base mayor
 *                   - Dimension lado base menor
 *                   - Apotema
 *                   - Altura
 * Datos de Salida: - Area del tronco piramide
 *                  - Volumen del tronco
 */
public class Ejercicio1
{
   public static void main(String[] args)
   {
       //Variables
       double AbaseMayor, AbaseMenor, Altura, volumentronco, Areas, PbaseMayor, PbaseMenor, Apotema, LbaseMenor, LbaseMayor ;
       
       Scanner teclado = new Scanner(System.in);
       
       //Recoger datos
       System.out.println("El tronco Piramide Area y Volumen");
       
       System.out.print("Ingrese el valor del Lado base mayor: ");
       LbaseMayor = teclado.nextDouble();
       
       System.out.print("Ingrese el valor del Lado base menor: ");
       LbaseMenor = teclado.nextDouble();
       
       System.out.print("Ingrese el valor de la Apotema: ");
       Apotema = teclado.nextDouble();
       
       System.out.print("Ingrese el valor de la Altura: ");
       Altura = teclado.nextDouble();
       
       
       // Calculo de los datos
       
       AbaseMayor = LbaseMayor * LbaseMayor;
       
       AbaseMenor = LbaseMenor * LbaseMenor;
       
       PbaseMayor = Apotema * LbaseMayor;
       
       PbaseMenor = Apotema * LbaseMenor;
       
       volumentronco = Altura / 3 * ( AbaseMayor + AbaseMenor + (Math.sqrt(AbaseMayor * AbaseMenor)));  
       
                   
       Areas = AbaseMayor + AbaseMenor + (PbaseMayor + PbaseMenor) / 2 * Apotema;
       
       // Resultados
       System.out.println("Área del tronco pirámide: " + Areas + " cm2");
       
       //System.out.println("Area del cuadrado inferior: " + areapiramideinf + " m2");
       
       System.out.println("Volumen del tronco pirámide: " + volumentronco + " m3");
       
   }
}
