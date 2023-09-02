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
public class Actividad03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner signos = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int numA= signos.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int numB= signos.nextInt();
        if(numA > 0 && numB > 0 ){System.out.println("Los numeros son positivos");}
        else{System.out.println("Los numeros no son positivos");}
        
    }
    
}
