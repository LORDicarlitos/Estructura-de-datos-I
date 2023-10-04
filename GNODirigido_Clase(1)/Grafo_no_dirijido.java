package grafo_no_dirijido;
import java.util.ArrayList;
public class Grafo_no_dirijido {
    
    ArrayList<Vertice> vertices = new ArrayList();
    int adyacencia[][];
    
    //Constructor
    public Grafo_no_dirijido(){
        this.vertices = new ArrayList<>();
        this.adyacencia = new int [100][100];
    }
    
    public void agregar_vertice(Vertice v){
        this.vertices.add(v);
    }
    
    public void conectar_vertice(Vertice v1, Vertice v2){
        v1.agregar_adyacente(v2);
        v2.agregar_adyacente(v1);
        adyacencia[v1.getID()][v2.getID()]=1;
        adyacencia[v2.getID()][v1.getID()]=1;
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



    

