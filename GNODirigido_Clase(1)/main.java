/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grafo_no_dirijido;

/**
 *
 * @author estudiante
 */
public class main {
    public static void main (String[]args){
    Grafo_no_dirijido grafo = new Grafo_no_dirijido();
    
    Vertice pc1 = new Vertice("pc1");
    Vertice pc2 = new Vertice("pc2");
    Vertice pc3 = new Vertice("pc3");
    Vertice pc4 = new Vertice("pc4");
    Vertice pc5 = new Vertice("pc5");
    
    grafo.agregar_vertice(pc1);
    grafo.agregar_vertice(pc2);
    grafo.agregar_vertice(pc3);
    grafo.agregar_vertice(pc4);
    grafo.agregar_vertice(pc5);
    
    grafo.conectar_vertice(pc1, pc2);
    grafo.conectar_vertice(pc5, pc3);
    grafo.conectar_vertice(pc5, pc4);
    grafo.conectar_vertice(pc4, pc2);
    
    grafo.imprimir_grafo();
    
    }
}
