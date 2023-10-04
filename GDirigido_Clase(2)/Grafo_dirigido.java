package grafo_dirigido;
import java.util.ArrayList;

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
    
    public void imprimir_grafo(){
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
