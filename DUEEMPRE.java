package Pr1.Po2;
//El dueño de una empresa desea planificar las decisiones financieras que tomara en el siguiente
//año. La manera de planificarlas depende de lo siguiente:
//Si actualmente su capital se encuentra con saldo negativo, pedirá un préstamo bancario para
//que su nuevo saldo sea de U$10.000. Si su capital tiene actualmente un saldo positivo pedirá un
//préstamo bancario para tener un nuevo saldo de U$20.000, pero si su capital tiene actualmente
//un saldo superior a los U$20.000 no pedirá ningún préstamo.
//Posteriormente repartirá su presupuesto de la siguiente manera:
//• U$5.000 para equipo de computo
//• U$2.000 para mobiliario
//• El resto la mitad será para la compra de insumos y la otra para otorgar incentivos al personal.
//Desplegar que cantidades se destinaran para la compra de insumos e incentivos al personal y,
//en caso de que fuera necesario, a cuánto ascendería la cantidad que se pediría al banco.

import java.util.Scanner;

public class DUEEMPRE {
public static void main(String[] args) {
    System.out.println("Ingrese el capital actual de la empresa: ");
    Scanner sc = new Scanner(System.in);
    double capital = sc.nextDouble();
    sc.nextLine();
    double prestamo=0;
    double equipocompu=5000;
    double mobiliario=2000;
    double insumos=0;
    double incentivos=0;
    if (capital<0) {
        prestamo=10000 - capital;
    }
    else if (capital>0 && capital<20000) {
        prestamo=20000-capital;    
    }
    else if (capital>20000) {
        prestamo=0;
    }
    insumos=(capital+prestamo-equipocompu-mobiliario)/2;
    incentivos=(capital+prestamo-equipocompu-mobiliario)/2;
    
    System.out.println("La cantidad que será destinada para la compra de insumos es:"+insumos);
    System.out.println("La cantidad que será destinada para incentivos al personal es:"+incentivos);
    System.out.println("La cantidad que será destinada para equipo de computo es:"+equipocompu);
    System.out.println("La cantidad que será destinada para mobiliario es:"+mobiliario);

    if(prestamo>=0){
        System.out.println("La cantidad que se pedirá al banco es: "+prestamo);
    }
sc.close();
    }
}

