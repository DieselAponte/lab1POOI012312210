/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Actividad01;

/**
 *
 * @author Alumno
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x=1, y=2, z=3;
        if(++x > y++ || x-- >0)
            z++;
        else
            z--;
        System.out.println(x+" "+y+" "+z);
       
    }
    //El resultado es 1 3 4
}
