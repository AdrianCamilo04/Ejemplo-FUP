/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto3;

import java.util.Scanner;

/**
 *
 * @author camilo
 */
public class PositivoNegativo {
    Scanner input = new Scanner(System.in);
    int numero[] = new int[6];

    void llenarArreglo() {
        for (int i = 0; i < numero.length; i++) {
            System.out.print("Digete un numero (positivo o negativo): ");
            numero[i] = input.nextInt();
        }
    }
    
    void clasificacion() {
        int positivos = 0;
        int negativos = 0;
        
        for (int i = 0; i < numero.length; i++) {
            if (numero[i] < 0) 
                negativos += 1;
            else
                positivos += 1;
        }
        System.out.println("Hay "+ negativos +" numeros negativos en el arreglo");
        System.out.println("Hay "+ positivos +" numeros positivos en el arreglo");
    }
}
