/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arbol5;

/**
 *
 * @author estudiante
 */
public class Nodo {
    int dato;
    Nodo derecho;
    Nodo izquierdo;
    
    public Nodo(int dato){
        this.dato = dato;
        this.derecho = null;
        this.izquierdo = null;
    }
}
