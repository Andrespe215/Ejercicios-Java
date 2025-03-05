package Pr1.Po2;

import java.util.Scanner;
 //En una tienda de computadoras se planea ofrecer a los clientes un descuento que dependerá
       //del número de equipos que compre. Si las computadoras son menos de cinco se les dará un
       //10% de descuento sobre el total de la compra; si el número de computadoras es mayor o igual
       //a cinco pero menos de diez se le otorga un 20% de descuento; y si son 10 o más se les da un
       //40% de descuento. El precio de cada computadora es de U$500.

/*Andres Felipe Peña Lopez
    u20242228235*/

public class TIENDACOMPU {
    
    public static void main(String[] args) {
      
       final double precio = 500;
           
       
       Scanner sc= new Scanner(System.in);



       System.out.println("Ingrese la cantidad de computadoras a comprar: ");
        int cant = sc.nextInt();
        if (cant < 5) { 
            System.out.println("Tendrá un descuento del 10% sobre el total de la compra");
            System.out.println("El total a pagar es: " + (cant * precio) * 0.9);
        }
        else if (cant >= 5 && cant <10){
            System.out.println(" Tendrá un descuento del 20% sobre el total de la compra");
            System.out.println("El total a pagar es : " +(cant * precio)*0.8);
        }
        else if (cant >= 10) {
            System.out.println("Tendrá un descuento total del 40% sobre el total de la compra");
            System.out.println("El total a pagar es:" + (cant * precio)*0.6);

            
        }
         
        }
    }


