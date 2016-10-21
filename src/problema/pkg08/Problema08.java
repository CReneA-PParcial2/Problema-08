/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg08;
import java.util.*;
/**
 *
 * @author Samsung
 */
public class Problema08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Calculadora de Hipotenusa:
        double cateto1, cateto2, respuesta;
        cateto1 = pedirCateto1();
        cateto2 = pedirCateto2();
        respuesta = calularHipotenusa(cateto1, cateto2);
        mostrarResultado(respuesta);
    }
    
    //ESCANEO DEL PRIMER CATETO INGRESADO POR EL USUARIO
    public static double pedirCateto1(){
        double cateto1;
        System.out.println("Introduce el primer cateto:");
        Scanner entradaCateto1 = new Scanner(System.in);
        cateto1 = entradaCateto1.nextDouble();
        return cateto1;
    }
    
    //ESCANEO DEL SEGUNDO CATETO INGRESADO POR EL USUARIO
    public static double pedirCateto2(){
        double cateto2;
        System.out.println("Introduce el segundo cateto:");
        Scanner entradaCateto2 = new Scanner(System.in);
        cateto2 = entradaCateto2.nextDouble();
        return cateto2;
    }
    
    //CALCULO DE LA HIPOTENUSA UTILIZANDO LOS DOS CATETOS
    public static double calularHipotenusa(double cateto1, double cateto2){
        double respuesta;
        respuesta = Math.sqrt(Math.pow(cateto1, 2)+Math.pow(cateto2, 2));
        return respuesta;
    }
    
    //IMPRESION DE LA HIPOTENUSA YA CALCULADA
    public static void mostrarResultado(double respuesta){
        System.out.println("La hipotenusa es igual a: " + respuesta);
    }
}
