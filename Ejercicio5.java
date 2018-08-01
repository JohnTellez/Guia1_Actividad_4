import java.util.Scanner;
/**
 * Write a description of class Ejercicio5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio5
{
    public static void main(String[] args)
    {
       Scanner teclado = new Scanner(System.in);
      
       int Tclase, Pclase1, Pclase2, Pclase3, Tusuarios, Tganancias; 
       
       int clase1 = 25;
       int clase2 = 45;
       int clase3 = 60;
       
       Pclase1 = clase1 * 500000;
       Pclase2 = clase2 * 200000;
       Pclase3 = clase3 * 125000;
       
               
       // Recoger datos
       System.out.println("\nTIQUETES DE UNA AEROLINEA\n ");
       System.out.println("-------------------------------------------------------------------------------------------------------------------------------\n\n");
       
       System.out.println("Consideraciones:");
       System.out.println("*Costo de clase 1: $500000 * Persona");
       System.out.println("*Costo de clase 2: $200000 * Persona");
       System.out.println("*Costo de clase 3: $125000 * Persona");
       System.out.println("\n-------------------------------------------------------------------------------------------------------------------------------\n");
       
       
 
            System.out.println("1. Clase Ejecutiva");
            System.out.println("2. Clase Turista");
            System.out.println("3. Clase Economica");
            System.out.println("4. Total de usuarios y ganacias");
            System.out.println("5. Salir");
          
 
                System.out.println("Escribe una de las opciones");
                Tclase = teclado.nextInt();
                Tusuarios = clase1 + clase2 + clase3;
                Tganancias = Pclase3 + Pclase3 + Pclase3;
 
                if (Tclase == 1) {
                    
                        System.out.println("Se han registrado " + clase1 + " usuarios en clase ejecutiva, por valor de: $" + Pclase1 + " durante este mes.");
                        System.out.println("\n\nDesea realizar una nueva consulta?? S/n");
                    } 
                if (Tclase == 2) {
                    
                        System.out.println("Se han registrado " + clase2 + " usuarios en clase turista, por valor de: $" + Pclase2 + " durante este mes.");
                    }
                if (Tclase == 3) {
                    
                        System.out.println("Se han registrado " + clase3 + " usuarios en clase economica, por valor de: $" + Pclase3 + " durante este mes.");
                    }
                if (Tclase == 4) {
                    
                        System.out.println("Total de usuarios: "+ Tusuarios);
                        System.out.println("Total de ganacias obtenidas: $"+ Tganancias);
                    }
                if (Tclase == 5) {
                    
                        System.out.println("Saliendo, gracias.");
                        System.exit(1);
                    } 
                   
               
    }
       
 
       
    }

