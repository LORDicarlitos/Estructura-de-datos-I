

package grafodirigidoconpeso;

import java.util.ArrayList;

/**
 *
 * @author katherineospino
 */
public class Vertice {
    String dato;
    ArrayList<Arista> arista;

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
