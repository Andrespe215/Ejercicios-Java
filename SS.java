import java.util.Scanner;

public class SS {

    /*Un obrero necesita calcular su salario semanal, el cual se obtiene de la sig. manera:
• Si trabaja 40 horas o menos se le paga $5000 por hora
• Si trabaja más de 40 horas se le paga $5000 por cada una de las primeras 40 horas y un
aumento del 20% por cada hora extra. */
/*Andres Felipe Peña Lopez
 u20242228235
 */
public static void main(String[] args) {
        int salarionormal = 5000;
        double pagoHorasExtras = (5000 *1.20);

        System.out.println("Ingrese las horas que ha trabajado: ");
        Scanner sc = new Scanner(System.in); 
        int horasTrabajadas = sc.nextInt(); 
        int horasExtras = (horasTrabajadas)- 40;
        
        double salario ;
        if (horasTrabajadas <= 40) {
            salario = (horasTrabajadas*salarionormal);
            
        }
        else{
          
            salario= (40* salarionormal)+(horasExtras*pagoHorasExtras);
            
        } 
            System.out.println("El salario a pagar es: "+salario);
        }

    




        


    }




