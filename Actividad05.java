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
public class Actividad05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Scanner Diaas = new Scanner(System.in);
        System.out.println("Ingrese un numero de dias: ");
            int numDia=Diaas.nextInt();
   
        switch(numDia) {
            case 1:
                System.out.print("Lunes");
                break;
            case 2:
                System.out.print("Martes");
                break;
            case 3:
                System.out.print("Miercoles");
                break;
            case 4:
                System.out.print("Jueves");
                break;
            case 5:
                System.out.print("Viernes");
                break;
            case 6:
                System.out.print("Sabado");
                break;
            case 7:
                System.out.print("Domingo");
                break; 
            default:
                System.out.println("Numero no valido");
                break;
        }
    }
}
    
    

