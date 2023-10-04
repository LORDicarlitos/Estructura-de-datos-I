/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciobfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author estudiante
 */
public class Grafo_no_dirigido {

    ArrayList<Vertice> vertices = new ArrayList();
    int adyacencia[][];

    public Grafo_no_dirigido() {
        this.vertices = new ArrayList<>();
        this.adyacencia = new int[100][100];

    }

    public void agregar_vertice(Vertice v) {
        this.vertices.add(v);

    }

    public void conectar_vertice(Vertice v1, Vertice v2) {
        v1.agregar_adyacente(v2);
        v2.agregar_adyacente(v1);
        adyacencia[v1.getID()][v2.getID()] = 1;
        adyacencia[v2.getID()][v1.getID()] = 1;
    }

    public ArrayList<Integer> bfs(int inicio, int fin) {
        ArrayList<Integer> ruta = new ArrayList();
        Queue<Integer> cola = new LinkedList<>();
        boolean[] visitados = new boolean[vertices.size()];
        int[] padre = new int[vertices.size()];

        cola.offer(inicio);
        visitados[inicio] = true;
        padre[inicio] = -1;

        while (!cola.isEmpty()) {
            int actual = cola.poll();
            if (actual == fin) {
                int vertice_actual = fin;
                while (vertice_actual != -1) {
                    ruta.add(0, vertice_actual);
                    vertice_actual = padre[vertice_actual];

                }
                return ruta;
            }

            for (int i = 0; i < vertices.size(); i++) {
                if (adyacencia[actual][i] == 1 && !visitados[i]) {
                    cola.offer(i);
                    visitados[i] = true;
                    padre[i] = actual;

                }
            }
        }
        return ruta;
    }

    public void imprimir_grafo() {
        for (Vertice vertice : vertices) {
            System.out.println(vertice.toString());
        }
        System.out.println("matriz de adyacencia");

        for (int i = 0; i < vertices.size(); i++) {

            for (int j = 0; j < vertices.size(); j++) {
                System.out.print(adyacencia[i][j]);
            }
            System.out.println("");

        }

    }
}