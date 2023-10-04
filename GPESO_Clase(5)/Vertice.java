package grafodirigidoconpeso;
import java.util.ArrayList;

public class Vertice {
    
    String dato;
    ArrayList<Arista> arista;

    //Constructor
    public Vertice(String dato) {
        this.dato = dato;
        this.arista = new ArrayList<>();
    }

    public String getDato() {
        return dato;
    }

    public ArrayList<Arista> getArista() {
        return arista;
    }
    
    public void agregar(Vertice destino,int peso){
        arista.add(new Arista(destino,peso));
        //destino.agregar(this., peso);
        
    }
}
