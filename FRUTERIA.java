package Pr1.Po2;

import java.util.Scanner;

//Una frutería ofrece las manzanas con descuento según la siguiente tabla:
//NUM. DE KILOS COMPRADOS % DESCUENTO
//0 - 2 0%
//  2.01 - 5 10%
//5.01 - 10 15%
//10.01 en adelante 20%
//Determinar cuánto pagara una persona que compre manzanas es esa frutería.

/* Andres Felipe Peña Lopez
    u20242228235*/

public class FRUTERIA {
public static void main(String[] args) {
    
  Scanner sc= new Scanner(System.in);
  double precio=0, descuento=0;
  System.out.println("Ingrese la cantidad de kilos de manzanas a comprar: ");
  System.out.println("El precio por kilo es de $5000");
  double kilos = sc.nextDouble();
  sc.nextLine();
  if (kilos>=0 && kilos<=2) {
     precio=kilos*5000;
     descuento=0;  
  }
   else if (kilos>2 && kilos<=5){
    precio=kilos*5000;
    descuento=0.1;
}
   else if(kilos>5 && kilos<=10){
    precio=kilos*5000;
    descuento=0.15;

}
   else if (kilos>10) {
    precio=kilos*5000;
    descuento=0.2;

}
System.out.println("El precio a pagar por la compra de "+
kilos+" kilos de manzanas es: "+(precio-(precio*descuento)));


}
}
