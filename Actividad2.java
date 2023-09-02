/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Actividad01;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Actividad2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner dividendo = new Scanner(System.in);

        System.out.println("Ingrese el nuemero a identificar: ");
        int num = dividendo.nextInt();
        if (num >= 0 && num % 2 != 0) {System.out.println("El numero es impar");
        } else {System.out.println("El numero es par");
        }
    }
}


