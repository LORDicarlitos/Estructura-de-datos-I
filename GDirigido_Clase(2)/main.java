/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package grafo_dirigido;

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

        Vertice pc1 = new Vertice(1);
        Vertice pc2 = new Vertice(2);
        Vertice pc3 = new Vertice(3);
        Vertice pc4 = new Vertice(4);
        Vertice pc5 = new Vertice(5);

        grafo.agregar_vertice(pc1);
        grafo.agregar_vertice(pc2);
        grafo.agregar_vertice(pc3);
        grafo.agregar_vertice(pc4);
        grafo.agregar_vertice(pc5);

        grafo.conectar_vertice(pc1, pc2);
        grafo.conectar_vertice(pc1, pc3);
        grafo.conectar_vertice(pc3, pc1);
        grafo.conectar_vertice(pc3, pc2);
        grafo.conectar_vertice(pc3, pc4);
        grafo.conectar_vertice(pc4, pc5);
        grafo.conectar_vertice(pc5, pc5);
        grafo.conectar_vertice(pc5, pc3);

        grafo.imprimir_grafo();
    }

}
