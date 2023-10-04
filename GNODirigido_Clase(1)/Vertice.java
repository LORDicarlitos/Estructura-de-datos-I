/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grafo_no_dirijido;

import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 *
 * @author estudiante
 */
public class Vertice {

    String dato;
    ArrayList<Vertice> adyacente;
    int ID;
    static int cd;

    public Vertice(String dato) {
        this.dato = dato;
        this.adyacente = new ArrayList<>();
        this.ID = cd++;
        
    }
    public void agregar_adyacente (Vertice v ){
    this.adyacente.add(v);
    
    
    }

    public String getDato() {
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
        return "Vertice{"
                + "dato='" + dato + '\''
                + ",adyacentes="
                + adyacente.stream().map(Vertice::getDato).collect(Collectors.joining(", ")) + 
    '}';
    }
    
}
