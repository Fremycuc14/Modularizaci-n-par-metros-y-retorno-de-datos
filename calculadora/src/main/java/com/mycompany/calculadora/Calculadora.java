/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.calculadora;

import java.util.Scanner;
/**
 *
 * @author Dell
 */
public class Calculadora {

    public static void main(String[] args) {

        int operacion;
        float numeroUno, numeroDos, res;
        String respuesta;
        
        respuesta = "s";

        while (respuesta.toLowerCase().equals("s")) {

            operacion = 0;
            numeroUno = numeroDos = res =0.0f;
            Scanner scan = new Scanner(System.in);

            System.out.println("1.- Suma");
            System.out.println("2.- Resta");
            System.out.println("3.- Multiplicación");
            System.out.println("4.- División");
            System.out.print("Ingrese la operación que desea realizar: ");

            operacion = scan.nextInt();
            
            System.out.println ("Ingrese primer operando");
            numeroUno = scan.nextFloat();
            
            System.out.println ("Ingrese segundo operando");
            numeroDos = scan.nextFloat();
            switch (operacion) {
                case 1: res = suma(numeroUno, numeroDos);
                        break;
                case 2: res = resta(numeroUno, numeroDos);
                        break;
                case 3: res = multiplicacion (numeroUno, numeroDos);
                        break;
                case 4: res = division (numeroUno, numeroDos);
                        break;
                default:System.out.println("Opción ingresada no es válida."); 
                        break;
            }
            
            System.out.print("El resultado de la operacion es: " + res);
            
            System.out.print("Desea realizar otra operacion? (s/n) ");
            respuesta = scan.next();
        }
    }
    
    // Agregar nuevos métodos aquí
    //Parametros
    public static float suma(float operandoUno, float operandoDos) {
        float resultado;
        resultado = 0.0f;  
                
        resultado = operandoUno + operandoDos;
        
        return resultado;
    }
    
    public static float resta(float operandoUno, float operandoDos) {
        float resultado;
        resultado = 0.0f;
        
        resultado = operandoUno - operandoDos;
        
        return resultado;
    }
    
    public static float multiplicacion(float operandoUno, float operandoDos) {
        float resultado;
        resultado = 0.0f;
        
        resultado = operandoUno * operandoDos;
        
        return resultado;
    }
    
     public static float division (float operandoUno, float operandoDos) {
        float resultado;
        resultado = 0.0f;
         
        resultado = operandoUno / operandoDos;
        
        return resultado;
    }
}
