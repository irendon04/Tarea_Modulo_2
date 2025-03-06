/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.recursos;

/**
 *
 * @author rendo
 */
public class Recurso {

//primer metodo
    public String obtenerMensaje() {
        return "Programacion Orientada a Objetos 2021";
    }
//segundo metodo
    public String verificarEdad(int edad) {
        return (edad >= 21) ? "Mayor de edad" : "Menor de edad";
    }
//tercer metodo
    public int multiplicar(int a, int b) {
        return a * b;
    }

//cuarto metodo
    public int[] generarLista(int x) {
        int[] lista = new int[x];
        for (int i = 0; i < x; i++) {
            lista[i] = i + 1;
        }
        return lista;
    }
}

