/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author camilo
 */
public class Temperaturas {
    Scanner input = new Scanner(System.in);
    int temperaturas[] = new int[5];
    
    void ingresoTemperaturas() {
        for (int i = 0; i < temperaturas.length; i++) {
            temperaturas[i] = (int)(Math.random()*50);
        }
    }
    
    void promedioTempe() {
        int suma = 0;
        int prom = 0;
        
        for (int i = 0; i < temperaturas.length; i++) {
            suma += temperaturas[i];
        }
        prom = suma / temperaturas.length;
        System.out.println("El promedio de las temperaturas es de: "+ prom);
    }
    
    void mostrarTemperaturas() {
        int cont = 0;
        
        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i] > 15){
                System.out.println(temperaturas[i]);
                cont += 1;
            }
        }
        System.out.println("Son "+ cont +" las temperaturas mayores a 15");
    }
    
    void buscarTemperatura() {
        boolean bandera = false;
        System.out.print("Dijite la temperatura a buscar: ");
        int tempe = input.nextInt();
        
        for (int i = 0; i < temperaturas.length; i++) {
            if (tempe == temperaturas[i]) {
                System.out.println("La temperatura esta la posicion "+ i +" del arreglo");
                bandera = true;
            }
        }
        
        if (bandera == false) {
            System.out.println("La temperatura no se encuentra en el arreglo");
        }
    }
    
    void menu() {
        int opcion = 0;
        do {            
            System.out.println("MENU DE TEMPERATURAS ALEATORIAS");
            System.out.println("1. Obtener el promedio de las temperaturas");
            System.out.println("2. Imprimir las temperaturas mayores a 15");
            System.out.println("3. Buscar una temperatura");
            System.out.println("4. Salir");
            opcion = input.nextInt();
            
            switch (opcion) {
                case 1:
                    promedioTempe();
                    System.out.println("----------------------------------------");
                    break;
                case 2:
                    mostrarTemperaturas();
                    System.out.println("----------------------------------------");
                    break;
                case 3:
                    buscarTemperatura();
                    System.out.println("----------------------------------------");
                    break;
            }
        } while (opcion != 4);
    }
}
