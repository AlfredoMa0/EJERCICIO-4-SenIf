/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg4.senif;

import java.util.Scanner;

/**
 *
 * @author Campe
 */
public class EJERCICIO4SenIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int Año;
        int Valor = 2021;
       
        
         Scanner teclado = new Scanner(System.in);
         System.out.println("INGRESA UN AÑO NO MENOR QUE 2012 Y NO MAYOR QUE 2030: ");
         Año = teclado.nextInt();
         
         if (Año <= Valor) { 
             System.out.println(" PARA 2012: "  ); 
             switch (Año) {
                 case 2020: System.out.println("Ya paso 8 Años");break;
                 case 2019: System.out.println("Ya paso 7 Años");break;
                 case 2018: System.out.println("Ya pasaron 6 Años");break;
                  case 2017: System.out.println("Y paso 5 Años");break;
                 case 2016: System.out.println("Ya paso 4 Años");break;
                 case 2015: System.out.println("Ya pasaron 3 Años");break;
                 case 2014: System.out.println("Ya pasaron 2 Años ");break;
                 case 2013: System.out.println("Ya paso 1 Año");break;       
             }
             
        }else if (Año >= Valor) {
             System.out.println(" PARA 2030: ");
             switch (Año) {
                 case 2022:System.out.println(" Faltan 8 Años");break;
                 case 2023: System.out.println("Faltan 7 Años ");break;
                 case 2024: System.out.println("Faltan 6 Años ");break;
                 case 2025:System.out.println(" Faltan 5 Años");break;
                 case 2026: System.out.println("Faltan 4 Años ");break;
                 case 2027: System.out.println("Faltan 3 Años ");break;
                 case 2028:System.out.println(" Faltan 2 Años");break;
                 case 2029: System.out.println("Falta 1 Años ");break;
                 
             }
        }

        
            
            
        
    }
    
}
