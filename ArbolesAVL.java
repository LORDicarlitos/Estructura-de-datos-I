/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arbolesavl;

import java.util.ArrayList;

/**
 *
 * @author katherineospino
 */
public class ArbolesAVL {

    Nodo raiz;

    public ArbolesAVL() {
        this.raiz = null;
    }

    public static int alturaArbol(Nodo nodo) {
        if (nodo == null) {
            return 0;
        }
        return Math.max(alturaArbol(nodo.izquierdo), alturaArbol(nodo.derecho)) + 1;
    }

    //inicio 
    public static int getcol(int h) {
        if (h == 1) {
            return 1;
        }
        return getcol(h - 1) + getcol(h - 1) + 1;
    }

    public static void printTree(int[][] M, Nodo root, int col, int row, int height) {
        if (root == null) {
            return;
        }
        M[row][col] = root.dato;
        printTree(M, root.izquierdo, col - (int) Math.pow(2, height - 2), row + 1, height - 1);
        printTree(M, root.derecho, col + (int) Math.pow(2, height - 2), row + 1, height - 1);
    }

    public void TreePrinter() {
        int h = alturaArbol(this.raiz);
        int col = getcol(h);
        int[][] M = new int[h][col];
        printTree(M, this.raiz, col / 2, 0, h);
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < col; j++) {
                if (M[i][j] == 0) {
                    System.out.print("  ");
                } else {
                    System.out.print(M[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public int alturaNodo(Nodo nodo) {
        if (nodo == null) {
            return 0;
        }
        return nodo.alturaNodo;
    }

    public int calcularFE(Nodo nodo) {
        if (nodo == null) {
            return 0;
        }
        return alturaNodo(nodo.izquierdo) - alturaNodo(nodo.derecho);
    }

    public Nodo rotarDerecha(Nodo y) {
        Nodo x = y.izquierdo;
        Nodo temp = x.derecho;
        x.derecho = y;
        y.izquierdo = temp;
        x.alturaNodo = Math.max(alturaNodo(x.izquierdo), alturaNodo(x.derecho)) + 1;
        y.alturaNodo = Math.max(alturaNodo(y.izquierdo), alturaNodo(y.derecho)) + 1;
        return x;
    }

    public Nodo rotarIzquierda(Nodo x) {
        Nodo y = x.derecho;
        Nodo temp = y.izquierdo;
        y.izquierdo = x;
        x.derecho = temp;
        x.alturaNodo = Math.max(alturaNodo(x.izquierdo), alturaNodo(x.derecho)) + 1;
        y.alturaNodo = Math.max(alturaNodo(y.izquierdo), alturaNodo(y.derecho)) + 1;
        return y;
    }

    public Nodo insertar(Nodo nodo, int dato) {
        if (nodo == null) {
            Nodo nuevoNodo = new Nodo(dato);
            return nuevoNodo;
        }
        //int valorDerecho = nodo.derecho != null?nodo.derecho.dato:0; 
        //int valorIzquierdo = nodo.izquierdo != null?nodo.izquierdo.dato:0;
        //System.out.println(valorDerecho);
        //System.out.println(valorIzquierdo);
        if (dato < nodo.dato) {
            nodo.izquierdo = insertar(nodo.izquierdo, dato);
        } else if (dato > nodo.dato) {
            nodo.derecho = insertar(nodo.derecho, dato);
        } else {
            return nodo;
            
        }
        nodo.alturaNodo = Math.max(alturaNodo(nodo.izquierdo), alturaNodo(nodo.derecho)) + 1;
        int alturaN = alturaNodo(nodo);
        int factorN = calcularFE(nodo);
        if (factorN > 1 && dato < nodo.dato) {
            System.out.println("Rotación derecha");
            return rotarDerecha(nodo);
        }
        if (factorN < -1 && dato > nodo.dato) {
            System.out.println("Rotación izquierda");
            return rotarIzquierda(nodo);
        }
        if (factorN > 1 && dato > nodo.dato) {
            System.out.println("Rotación doble de izquierda a aderecha");
            nodo.izquierdo = rotarIzquierda(nodo.izquierdo);
            return rotarDerecha(nodo.derecho);
        }
        if (factorN < -1 && dato < nodo.dato) {
            System.out.println("Rotación doble de derecha a izquierda");
            nodo.derecho = rotarDerecha(nodo.derecho);
            return rotarIzquierda(nodo.izquierdo);
        }
        return nodo;
    }
    
    public void insertar(int valor){
        this.raiz = insertar(this.raiz, valor);
    }

    public static void main(String[] args) {
        ArbolesAVL arbol = new ArbolesAVL();
        int []valores = {1,2,3,4,5,6,7,15,14,13,12,11,10,9,8};
        for (int valore : valores) {
            arbol.insertar(valore);
            arbol.TreePrinter();
        }
    }

}
