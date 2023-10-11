/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.arbol5;

/**
 *
 * @author estudiante
 */
public class Arbol5 {

    private Nodo raiz;

    public Arbol5() {
        raiz = null;
    }

    public void agregar(int dato) {
        Nodo nodo = new Nodo(dato);
        if (this.raiz == null) {
            this.raiz = nodo;
        } else {
            agregarRecursivo(this.raiz, nodo);
        }

    }

    public void agregarRecursivo(Nodo nodo, Nodo nuevoNodo) {
        if (nuevoNodo.dato < nodo.dato) {
            if (nodo.izquierdo == null) {
                nodo.izquierdo = nuevoNodo;
            } else {
                agregarRecursivo(nodo.izquierdo, nuevoNodo);
            }
        } else {
            if (nodo.derecho == null) {
                nodo.derecho = nuevoNodo;
            } else {
                agregarRecursivo(nodo.derecho, nuevoNodo);
            }
        }

    }

    public void imprimir(Nodo nodo, int nivel) {
        if (nodo != null) {
            imprimir(nodo.derecho, nivel + 1);
            for (int i = 0; i <= nivel; i++) {
                System.out.print("      ");
            }
            System.out.println(nodo.dato);
            imprimir(nodo.izquierdo, nivel + 1);
        }
        if (this.raiz == null) {
            System.out.println("El arbol está vacío");
        }

    }

    public void preorden(Nodo nodo) {
        if (nodo == null) {
            return;

        }
        System.out.print(nodo.dato);
        preorden(nodo.izquierdo);
        preorden(nodo.derecho);
    }

    public void inorden(Nodo nodo) {
        if (nodo == null) {
            return;

        }
        inorden(nodo.izquierdo);
        System.out.print(nodo.dato);
        inorden(nodo.derecho);
    }

    public void postorden(Nodo nodo) {
        if (nodo == null) {
            return;

        }
        postorden(nodo.izquierdo);
        
        postorden(nodo.derecho);
        System.out.print(nodo.dato);
    }
    
    public int sumar (Nodo nodo){
        if (nodo == null){
            return 0;
        }
        return nodo.dato + sumar(nodo.izquierdo) + sumar(nodo.derecho);
    }
    
    public boolean buscar(Nodo nodo, int dato){
        if(nodo == null){
            return false;
        }
        if(nodo.dato == dato){
            return true;
        }else{
            if(dato < nodo.dato){
                return buscar(nodo.izquierdo, dato);
            }else{
                return buscar(nodo.derecho, dato);
            }
        } 
    }

    public static void main(String[] args) {
        Arbol5 arb1 = new Arbol5();
        arb1.agregar(8);
        arb1.agregar(3);
        arb1.agregar(1);
        arb1.agregar(20);
        arb1.agregar(10);
        arb1.agregar(5);
        arb1.agregar(4);
        arb1.imprimir(arb1.raiz, 0);
        arb1.preorden(arb1.raiz);
        System.out.println(" ");
        arb1.inorden(arb1.raiz);
        System.out.println(" ");
        arb1.postorden(arb1.raiz);
        int s = arb1.sumar(arb1.raiz);
        System.out.println(" ");
        System.out.println("La suma de todos los elementos es: " + s);
        int valor = 50;
        if(arb1.buscar(arb1.raiz, valor)){
            System.out.println("El valor está encontrado");
        }else{
            System.out.println("El valor no se ha encontrado");
        }
    }

}
