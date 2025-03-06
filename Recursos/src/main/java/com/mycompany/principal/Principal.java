/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;
import com.mycompany.recursos.Recurso;  

/**
 *
 * @author rendo
 */
public class Principal {
   
    public static void main(String[] args) {
        Recurso recursos = new Recurso();

        System.out.println(recursos.obtenerMensaje());
        int edad = 22;
        System.out.println("Edad: " + edad + " - " + recursos.verificarEdad(edad));

        int resultado = recursos.multiplicar(7, 4);
        System.out.println("Multiplicacion: 7 * 4 = " + resultado);

        int x = 6;
        int[] lista = recursos.generarLista(x);
        System.out.print("Lista de numeros del 1 al " + x + ": ");
        for (int num : lista) {
            System.out.print(num + " ");
        }
    }
}


