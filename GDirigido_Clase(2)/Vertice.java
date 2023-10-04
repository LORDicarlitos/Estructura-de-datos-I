package grafo_dirigido;


import java.util.ArrayList;
import java.util.stream.Collectors;


public class Vertice {
    int dato;
    ArrayList<Vertice> adyacente;
    int ID;
    static int cd;

    public Vertice(int dato) {
        this.dato = dato;
        this.adyacente = new ArrayList<>();
        this.ID = cd++;
        
    }
    public void agregar_adyacente (Vertice v ){
    this.adyacente.add(v);
    
    
    }

    public int getDato() {
        return dato;
    }

    public ArrayList<Vertice> getAdyacente() {
        return adyacente;
    }

    public int getID() {
        return ID;
    }

    public static int getCd() {
        return cd;
    }

    public String toString() {
        return "Vertice{" +
            "dato=" + dato +
            ",adyacentes="+ adyacente.stream().map(Vertice::getDato).map(Object::toString).collect(Collectors.joining(", ")) +
            '}';

    }
    
}
