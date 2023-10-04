package grafodirigidoconpeso;

public class Arista {
    
    int peso;
    Vertice destino;
    
    //Constructor
    public Arista(Vertice destino, int peso) {
        this.peso = peso;
        this.destino = destino;
    }

    public int getPeso() {
        return peso;
    }

    public Vertice getDestino() {
        return destino;
    }   
}
