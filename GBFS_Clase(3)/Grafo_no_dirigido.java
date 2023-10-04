package ejerciciobfs;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Grafo_no_dirigido {
    
    ArrayList<Vertice> vertices = new ArrayList();
    int adyacencia[][];

    //Constructor
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

        //ArrayList que se devolvera con la ruta mas corta entre el punto de inicio y el final.
        ArrayList<Integer> ruta = new ArrayList();

        //Cola en la que se iran agregando y sacando los vertices adyacentes.
        Queue<Integer> cola = new LinkedList<>();

        //Array de todos los vertices en el que se confirmara si se visito el nodo de la posicion(vertice 3 = visitados[3]).
        boolean[] visitados = new boolean[vertices.size()];

        //Array en el que se guardara el numero ID del padre de cada vertice segun su posicion (padre del vertice 1 = Padre[1]).
        int[] padre = new int[vertices.size()];

        //El método .offer es una operación que se utiliza para agregar un elemento a una cola en Java.
        //Se ingresa el vertice inicio en la cola, se marca como visitado y se identifica como como vertice de inicio en el array de padre (servira para detener el while al construir la ruta)
        cola.offer(inicio);
        visitados[inicio] = true;
        padre[inicio] = -1;

        //si la cola llega a vaciarse significa que todos los vertices han sido visitados y se ha encontrado la ruta.
        while (!cola.isEmpty()) {

            //El método .poll se utiliza para eliminar y devolver el elemento de la cabeza de una cola en Java.
            int actual = cola.poll();

            //cuando se encuentre el nodo final se empieza a formar la ruta
            if (actual == fin) {
                int vertice_actual = fin;

                //Para encontrar la ruta se empieza desde el nodo final recorriendo sus padres hasta encontrar el nodo inicial (-1)
                while (vertice_actual != -1) {

                    //Como se ingresaran los valores en orden inverso se iran agregando todos en la posicion 0. asi cuando se agregue otro. Todos los demas se rueden a la derecha asi el primero sera el ultimo.
                    ruta.add(0, vertice_actual);

                    //se va buscando el padre de cada vertice
                    vertice_actual = padre[vertice_actual];

                }
                return ruta;
            }

            //se buscaran cada nodo adyacente de los nodos sacados de la pila si, son adyacentes y no han sido visitados seran agregados a la cola.
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

    //BFS ORIGINAL
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

    public void imprimir_grafo(){
        
        //El método toString() se utiliza para obtener una representación en cadena (string) del objeto.
        //La implementación predeterminada del método devuelve una cadena con el nombre de la clase y una representación hexadecimal del valor del identificador del objeto en memoria.
        
        //Bucle for each (funciona con colecciones o arrays)
        for (Vertice vertice : vertices) {
            System.out.println(vertice.toString());   
        }

        //Se imprime la matriz de adyacencia
        System.out.println("matriz de adyacencia");
        for (int i = 0; i < vertices.size(); i++) {
            for (int j = 0; j < vertices.size(); j++) {
                System.out.print(adyacencia[i][j]);  
            }
            System.out.println("");
        }
    } 
}
