/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciobfs;

import java.util.ArrayList;

/**
 *
 * @author estudiante
 */
public class EjercicioBFS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Grafo_no_dirigido grafo = new Grafo_no_dirigido();
        

        Vertice e1 = new Vertice("Caracas");
        Vertice e2 = new Vertice("Puerto Cabello");
        Vertice e3 = new Vertice("Los teques");
        Vertice e4 = new Vertice("San Carlos");
        Vertice e5 = new Vertice("Guanare");
        Vertice e6 = new Vertice("Valera");
        Vertice e7 = new Vertice("Bacinas");
        Vertice e8 = new Vertice("Maracaibo");

        grafo.agregar_vertice(e1);
        grafo.agregar_vertice(e2);
        grafo.agregar_vertice(e3);
        grafo.agregar_vertice(e4);
        grafo.agregar_vertice(e5);
        grafo.agregar_vertice(e6);
        grafo.agregar_vertice(e7);
        grafo.agregar_vertice(e8);

        grafo.conectar_vertice(e1, e2);
        grafo.conectar_vertice(e1, e3);
        grafo.conectar_vertice(e2, e6);
        grafo.conectar_vertice(e3, e2);
        grafo.conectar_vertice(e3, e4);
        grafo.conectar_vertice(e3, e5);
        grafo.conectar_vertice(e4, e5);
        grafo.conectar_vertice(e5, e6);
        grafo.conectar_vertice(e5, e7);
        grafo.conectar_vertice(e7, e8);
        grafo.conectar_vertice(e7, e6);
        grafo.conectar_vertice(e8, e6);

        grafo.imprimir_grafo();
        
        int inicio = 0;
        int fin = 7;
        ArrayList <Integer> ruta = grafo.bfs(inicio, fin);
        if(!ruta.isEmpty()){
            System.out.println("La ruta desde el nodo inicio "+inicio+" hasta fin "+fin+" es: "+ruta);
        }
        
        
    }

}
