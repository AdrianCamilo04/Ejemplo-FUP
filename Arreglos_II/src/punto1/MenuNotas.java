/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto1;

import java.util.Scanner;

/**
 *
 * @author camilo
 */
public class MenuNotas {

    /* Registrar las notas
     Mostrar las notas
     Obtener el promedio de las notas
     Imprimir las notas mayores a 3*/
    
    Scanner input = new Scanner(System.in);
    double notas[] = new double[5];

    void guardarNotas() {
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite la nota " + (i + 1) + ": ");
            notas[i] = input.nextDouble();
        }
        System.out.println("-----------------");
    }

    void mostrarNotas() {
        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }
        System.out.println("-----------------");
    }

    void promedioNotas() {
        double suma = 0;
        double prom = 0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }
        prom = suma / notas.length;
        System.out.println("El promedio de las notas es de: " + prom);
        System.out.println("-----------------");
    }

    void notasMayores() {
        boolean bandera = false;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > 3) {
                System.out.println(notas[i]);
                bandera = true;
            }
        }
        if (bandera == false) {
            System.out.println("No hay notas mayores a 3");
        }
        System.out.println("-----------------");
    }

    void menu() {
        int opcion;
        do {
            System.out.println("MENU DE NOTAS");
            System.out.println("1. Registrar las notas");
            System.out.println("2. Mostrar las notas");
            System.out.println("3. Promedio de las notas");
            System.out.println("4. Notas mayores a 3");
            System.out.println("5. Salir");
            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    guardarNotas();
                    break;
                case 2:
                    mostrarNotas();
                    break;
                case 3:
                    promedioNotas();
                    break;
                case 4:
                    notasMayores();
                    break;
            }
        } while (opcion != 5);
    }
}
