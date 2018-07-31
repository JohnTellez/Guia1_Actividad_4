import java.util.Scanner;
/**
 * Datos de entrada: - 
 *                   - Altura
 *                   
 * Datos de salida:  - Radio
 *                   - Area
 *                   - Volumen del tronco de cono
 */
public class Ejercicio4
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
       // Variables
       int Pgordos, Pflacos, Ptotal, Breq, Abuses, Tbuses, Dhosp, Comida, PgordosC, PflacosC, Tcomida, TcostosC, Rhabit, Chabit, Chbitdia, ChabitT, Chabitdia, CtotalPaseo; 
               
       // Recoger datos
       System.out.println("\nCALCULO PASEO A MELGAR\n ");
       System.out.println("-------------------------------------------------------------------------------------------------------------------------------\n\n");
       
       System.out.println("Consideraciones:");
       System.out.println("*El bus tiene una capacidad de 40 pasajeros");
       System.out.println("*Costo de la comida por persona es de $15.000");
       System.out.println("*El costo por habitacion para cuatro personas es de $100.000 por dia");
       System.out.println("*El costo del alquiler de un bus es de $400.000 ida y regreso");
       System.out.println("\n-------------------------------------------------------------------------------------------------------------------------------\n");
       
               
       System.out.print("Ingrese numero de pasajeros gordos:  ");
       Pgordos = (int)teclado.nextDouble() * 2;
       
       System.out.print("Ingrese numero de pasajeros flacos:  ");
       Pflacos = (int)teclado.nextDouble();
       
       System.out.print("Ingrese numero de dias de hospedaje:  ");
       Dhosp = (int)teclado.nextDouble();
       
       Ptotal = Pgordos + Pflacos;
       Comida = 15000;
       PgordosC = Pgordos * Comida * 5 / 2;
       PflacosC = Pflacos * Comida * 3;
       Tcomida = (PgordosC + PflacosC) * Dhosp;
       //TcostosC = Tcomida * Dhosp;
       
       
       Breq = 1;
       if (Ptotal > 40){
           Breq = Math.round(Ptotal / 40) + 1;
        }
       
       Abuses = 400000;
       Tbuses = Breq * Abuses;
       
       Rhabit = Math.round(Ptotal / 4)+1; // Reserva
       Chabit = 100000; //Costo habitacion
       Chabitdia = Rhabit * Chabit;
       ChabitT = Chabitdia * Dhosp;
       
       CtotalPaseo = Tbuses + Tcomida + ChabitT;
       
       System.out.println("\n-------------------------------------------------------------------------------------------------------------------------------\n\n");
       System.out.println("Resultados:\n");
       
       System.out.println("\nCantidad de pasajeros:  " + Ptotal);
       System.out.println("\nCantidad de buses requeridos:  " + Breq);
       System.out.println("\nEl costo del alquiler del bus es de:  $" + Tbuses);
       
       
       System.out.println("\nEl costo de la comida es de:  $" + Tcomida + " durante los " + Dhosp + " dias");
       System.out.println("\nNumero de habitaciones reservadas necesarias:  " + Rhabit);
       System.out.println("\nEl costo de las habitaciones por dia es de:  $" + Chabitdia);
       System.out.println("\nEl costo de las habitaciones total es de:  $" + ChabitT + " durante los " + Dhosp + " dias");
       
       System.out.println("\n\n*** EL COSTO TOTAL DEL PASEO A MELGAR ES DE:  $" + CtotalPaseo + " DURANTE LOS " + Dhosp + " DIAS ***");
        System.out.println("\n-------------------------------------------------------------------------------------------------------------------------------\n\n");
       
    }
}
