/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grafodirigidoconpeso;

/**
 *
 * @author katherineospino
 */
public class Main {
    private static final long INFI = Integer.MAX_VALUE; 
 
    public static void floydWarshall(long[][] grafo) {
        int V = grafo.length;
        long[][] distancia = new long[V][V];
 
        // Inicializamos la matriz de distancias con los valores del grafo
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                distancia[i][j] = grafo[i][j];
            }
        }
 
        // Calcular las distancias mínimas entre todos los pares de nodos
        for (int k = 0; k < V; k++) {
            for (int i = 0; i < V; i++) {
                for (int j = 0; j < V; j++) {
                    if (distancia[i][k] + distancia[k][j] < distancia[i][j]) {
                        distancia[i][j] = distancia[i][k] + distancia[k][j];
                    }
                }
            }
        }
 
        // Imprimir la matriz de distancias mínimas
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                if (distancia[i][j] == INFI) {
                    System.out.print("INF \t");
 
                } else {
                    System.out.print(distancia[i][j] + "\t");
                }
            }
            System.out.println();
        }
    }
 
 
 
    public static void main(String[] args) {
        Grafodirigidoconpeso grafo = new Grafodirigidoconpeso();
        Vertice v1 = new Vertice("S");
        Vertice v2 = new Vertice("A");
        Vertice v3 = new Vertice("B");
        Vertice v4 = new Vertice("C");
        Vertice v5 = new Vertice("D");
        Vertice v6 = new Vertice("E");
 
        v1.agregar(v2,2);
        v1.agregar(v3,4);
        v2.agregar(v4,7);
        v2.agregar(v3,1);
        v3.agregar(v5,3);
        v4.agregar(v5,1);
        v5.agregar(v6,2);
 
        grafo.agregar(v1);
        grafo.agregar(v2);
        grafo.agregar(v3);
        grafo.agregar(v4);
        grafo.agregar(v5);
        grafo.agregar(v6);
 
        //grafo.imprimir_grafo();
 
        long[][] NEW = {
            {0, 12, INFI, INFI,5,INFI,INFI,INFI},
            {12, 0, INFI, 1,9,INFI,INFI,6},
            {INFI, INFI, 0, 4,INFI,8,INFI,6},
            {INFI, 1, 4, 0,4,3,INFI,8},
            {5,9,INFI,4,0,2,1,INFI},
            {INFI, INFI,8,3,2,0,4,INFI},
            {INFI,INFI,INFI,INFI,1,4,0,INFI},
            {INFI,6,6,8,INFI,INFI,INFI,0}
        };
 
        floydWarshall(NEW);
 
 
    }
    
}
