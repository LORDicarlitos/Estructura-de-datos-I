package grafodirigidoconpeso;
import java.util.ArrayList;

public class Grafodirigidoconpeso {

    ArrayList<Vertice> vertices;

    //Constructor
    public Grafodirigidoconpeso() {
        this.vertices = new ArrayList<>();
    }

    public ArrayList<Vertice> getVertices() {
        return vertices;
    }

    public void agregar(Vertice vertice){
        this.vertices.add(vertice);
    }
    
    public void imprimir_grafo(){
        for (Vertice vertice : vertices) {
            System.out.print(vertice.getDato()+" ");
            for (Arista arista : vertice.getArista()) {
                System.out.print(arista.getDestino().getDato()+"("+arista.getPeso()+")");
            }
            System.out.println("");
        }
    
    } 
    
}
