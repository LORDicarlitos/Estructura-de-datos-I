/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package grafodirigidoconpeso;

import java.util.ArrayList;

/**
 *
 * @author katherineospino
 */
public class Grafodirigidoconpeso {

    ArrayList<Vertice> vertices;

    public Grafodirigidoconpeso() {
        this.vertices = new ArrayList<>();
    }

    public ArrayList<Vertice> getVertices() {
        return vertices;
    }

    public void agregar(Vertice vertice){
        this.vertices.add(vertice);
    }  
    public void imprimir_grafo(){
        for (Vertice vertice : vertices) {
            System.out.print(vertice.getDato()+" ");
            for (Arista arista : vertice.getArista()) {
                System.out.print(arista.getDestino().getDato()+"("+arista.getPeso()+")");
            }
            System.out.println("");
        }
    
    } 
    
}
