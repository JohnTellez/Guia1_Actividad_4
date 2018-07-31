import java.util.Scanner;
/**
 * Datos de entrada: - Peso de la carga en Kilos
 *                   - Kilometros de recorrido (Bogota - Sasaima = 79Km)
 *                   - Galones de gasolina tanqueados
 * Datos de salida:  - Cantidad de viajes Necesarios
 *                   - Numero de galones de gasolina por viaje
 */
public class Ejercicio2
{
  public static void main(String[] args)  
  {
      //Variables
      double Peso, Distancia, GalonesT, NumeroViajes, GalonesC, GalonesR, CargaMax ;
      
      Scanner teclado = new Scanner(System.in);
      
      //Recoger datos
       System.out.println("CALCULO DE GASTOS Y RECORRIDO CAMION DE TRANSPORTE\n ");
       
       System.out.println("Consideraciones:");
       System.out.println("*El camion actualmente consume 0.27 Gal cada 12Km");
       System.out.println("*El Peso maximo de carga por viaje es de 2000 Kg");
       System.out.println("*El camion se llena por completo con 8 Gal");
       System.out.println("*El recorrido Bogota - Sasaima es de 79km Aprox");
       
       System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------\n\n");
       
       Distancia = 79;
       System.out.println("Kilometros del recorrido Bogota - Sasaima:  " + Distancia + " Km");
       
       GalonesT = 1.77;
       System.out.println("Cantidad de galones por viaje: " + GalonesT + " Gal" );
       
       System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------\n\n");
              
       System.out.print("Ingrese el peso de la carga (kilos):  ");
       Peso = teclado.nextDouble();
       
       CargaMax = 2000;
       
              
       System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------\n\n");
       
       //Calculos
       
       
       NumeroViajes = (Peso * Distancia / CargaMax) / Distancia;
       GalonesR = NumeroViajes * GalonesT;
       
       //Resultados
        System.out.println("Resultados:\n");
       
        System.out.println("Numero de viajes a realizar: " + NumeroViajes);
        System.out.println("Numero de galones de gasolina requeridos para todos los viajes: " + GalonesR);
       
      
  }
}
