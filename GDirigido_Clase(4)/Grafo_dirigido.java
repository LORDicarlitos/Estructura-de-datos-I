package grafo_dirigido;
import java.util.ArrayList;
import java.util.Stack;

public class Grafo_dirigido {
     
     ArrayList<Vertice> vertices = new ArrayList();
     int adyacencia[][];

     //Constructor
     public Grafo_dirigido(){
          this.vertices = new ArrayList<>();
          this.adyacencia = new int [100][100];
     }
     
     public void agregar_vertice(Vertice v){
          this.vertices.add(v);
     }
     
     public void conectar_vertice(Vertice v1, Vertice v2){
          v1.agregar_adyacente(v2);
          adyacencia[v1.getID()][v2.getID()]=1;
     }

     //Este es mas sencillo que el BFS. Se utilizan menos herramientas y menos bucles.
     public ArrayList<Vertice> recorridoDFS(Vertice v){
          
          boolean[] visitados = new boolean[vertices.size()];
          ArrayList<Vertice> ruta = new ArrayList();
          Stack<Vertice> pila = new Stack();

          //El método .push() se utiliza en la clase Stack de Java para agregar un elemento a la parte superior de la pila.
          pila.push(v);
          while(!pila.isEmpty()){

               //El método .pop() se utiliza en la clase Stack de Java para eliminar y devolver el elemento en la parte superior de la pila.
               Vertice vNew = pila.pop();
               if(!visitados[vNew.getID()]){
                    visitados[vNew.getID()] = true;
                    ruta.add(vNew);
               }
               for(Vertice vertice: vNew.getAdyacente()){

                    //El método .indexOf() se utiliza en las colecciones en Java para buscar la posición (índice) de un elemento específico dentro de la colección.
                    //si no encuentra el objeto devuelve -1. Solo devuelve la posicion de la primera aparicion del elemento en la coleccion.
                    int indice = vertices.indexOf(vertice);
                    if(!visitados[indice]){
                         pila.push(vertice);
                    }
               }
          }
          return ruta;
     }
     
     public void imprimir_grafo(){
          //El método toString() se utiliza para obtener una representación en cadena (string) del objeto.
          //La implementación predeterminada del método devuelve una cadena con el nombre de la clase y una representación hexadecimal del valor del identificador del objeto en memoria.
          
          //Bucle for each (funciona con colecciones o arrays)
          //for (tipo elemento : colección o array) {
          //En cada iteración, la variable elemento toma el valor del siguiente elemento en la colección.
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
