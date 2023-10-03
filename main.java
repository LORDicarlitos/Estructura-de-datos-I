/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package grafo_dirigido;

import java.util.ArrayList;

/**
 *
 * @author Autologon
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Grafo_dirigido grafo = new Grafo_dirigido();

        Vertice pc1 = new Vertice("D");
        Vertice pc2 = new Vertice("C");
        Vertice pc3 = new Vertice("B");
        Vertice pc4 = new Vertice("R");
        Vertice pc5 = new Vertice("H");
        Vertice pc6 = new Vertice("T");
        Vertice pc7 = new Vertice("A");

        grafo.agregar_vertice(pc1);
        grafo.agregar_vertice(pc2);
        grafo.agregar_vertice(pc3);
        grafo.agregar_vertice(pc4);
        grafo.agregar_vertice(pc5);
        grafo.agregar_vertice(pc6);
        grafo.agregar_vertice(pc7);

        grafo.conectar_vertice(pc1, pc2);
        grafo.conectar_vertice(pc2, pc4);
        grafo.conectar_vertice(pc1, pc3);
        grafo.conectar_vertice(pc3, pc5);
        grafo.conectar_vertice(pc4, pc5);
        grafo.conectar_vertice(pc5, pc6);
        grafo.conectar_vertice(pc5, pc7);
        grafo.conectar_vertice(pc5, pc1);

        grafo.imprimir_grafo();
        
        ArrayList<Vertice> ruta = grafo.recorridoDFS(pc1);
        for(Vertice vertice:ruta){
            System.out.print(vertice.getDato() + ",");
        }
    }

}
