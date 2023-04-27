
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {
    private static EntityManagerFactory emf;
    private static Scanner scanner;

    public static void main(String[] args) {
        emf = Persistence.createEntityManagerFactory("CL1PINEDA");
        scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Ingresar Cita");
            System.out.println("2. Mostrar Citas del Doctor");
            System.out.println("3. Salir");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    ingresarCita();
                    break;
                case 2:
                    mostrarCitasDoctor();
                    break;
                case 3:
                    System.out.println("Salir");
                    break;
                
            }
        } while (opcion != 3);

        emf.close();
        scanner.close();
    }

    private static void mostrarCitasDoctor() {
        EntityManager em = emf.createEntityManager();

        System.out.print("Ingrese el nombre del doctor: ");
        String nombreDoctor = scanner.nextLine();
    }


	private static void ingresarCita() {
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();

        System.out.print("Numero de Cita: ");
        int nroCita = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Fecha de la cita: ");
        String fecha = scanner.nextLine();
        System.out.print("Nombre del paciente: ");
        String paciente = scanner.nextLine();
        System.out.print("Nombre del Doctor: ");
        String nombreDoctor = scanner.nextLine();
        
        
    }
}