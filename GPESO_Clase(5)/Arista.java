/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grafodirigidoconpeso;

/**
 *
 * @author katherineospino
 */

public class Arista {
    int peso;
    Vertice destino;
    public Arista(Vertice destino, int peso) {
        this.peso = peso;
        this.destino=destino;
    }

    public int getPeso() {
        return peso;
    }

    public Vertice getDestino() {
        return destino;
    }
    
    
    
}
