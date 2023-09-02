package poo;
import java.util.*;

public class Uso_fianzas_1 {

    public static void main (String[] args){

        byte seleccion;
        double dinero;

        Scanner tec = new Scanner(System.in);

        //Constructor
        Finanzas exchange = new Finanzas();

        do{
            System.out.println("Elige una opción:");
            System.out.println("1. Pasar de Euros a Dólares. 2. Pasar de Dólares a Euros. 0. Salir.");
            seleccion=tec.nextByte();

            switch(seleccion){
                case 1:
                    System.out.println("Inserte la cantidad de Euros");
                    dinero=tec.nextDouble();
                    System.out.println(dinero + "€ son " + exchange.euroToDolar(dinero)+"$");
                    break;
                case 2:
                    System.out.println("Inserte la cantidad de Dólares");
                    dinero=tec.nextDouble();
                    System.out.println(dinero + "$ son " + exchange.dolaresToEuro(dinero)+"€");
                    break;
            }
        } while(seleccion!=0);
        System.out.println("Hasta luego.");
        tec.close();
    }
}


