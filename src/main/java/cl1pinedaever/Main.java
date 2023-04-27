package cl1pinedaever;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //
        while (!salir) {
 
            System.out.println("Ingresar Citas");
            System.out.println("Mostrar Citas del Doctor");
            System.out.println("Salir");
 
            try {
 
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
                        System.out.println("Ingresar Citas");
                        break;
                    case 2:
                        System.out.println("Mostrar Citas del  Doctor");
                        break;
                    case 3:
                        salir = true;
                        break;
                    default:
                        System.out.println("Opciones entre 1 y 3");
                }
            } catch (InputMismatchException e) {
                System.out.println("Elija una Opcion");
                sn.next();
            }
        }
 
    }

	}


