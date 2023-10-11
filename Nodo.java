/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbolesavl;

/**
 *
 * @author katherineospino
 */
public class Nodo {
    Nodo izquierdo;
    Nodo derecho;
    int dato;
    int alturaNodo;
    
    public Nodo(int dato){
        this.izquierdo = null;
        this. derecho = null;
        this.dato = dato;
        this.alturaNodo = 1;
    }
}
