package grafo_dirigido;
import java.util.ArrayList;
import java.util.stream.Collectors;


public class Vertice {
    
    String dato;

    //ArrayList<Tipo de objetos que se almacenaran> Nombre de la ArrayList
    ArrayList<Vertice> adyacente;
    int ID;

    //static significa que es una variable que se comparte entre las instancias de la clase. (Es de la clase en si misma)
    //En Java, cuando declaras una variable estática sin asignarle un valor explícito, se inicializa automáticamente con un valor predeterminado según su tipo de datos. (En este caso 0)
    static int cd;

    public Vertice(String dato) {
        this.dato = dato;
        this.adyacente = new ArrayList<>();

        //variable++ significa que se le suma 1 a la varible.
        //varible1 = variable2++ (primero se utiliza el valor actual de la variable en la expresión y luego se incrementa en 1)
        //Variable1 = ++variable2 (primero se incrementa el valor de la variable y luego se utiliza en la expresión)
        this.ID = cd++;

    }

    public void agregar_adyacente(Vertice v) {
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

    //El siguiente metodo reemplaza el valor predeterminado del toString de Java
    public String toString() {
        return "Vertice{" + "dato=" + dato + ",adyacentes=" + adyacente
                //El metodo .stream trabaja con la lista de vértices adyacentes como un flujo (stream) de elementos. (Basicamente sirve para recorrer la ArrayList y realizar operaciones en cada objeto)
                .stream()
                
                //.map se utiliza para aplicar una función a cada elemento y obtener un nuevo stream con los resultados de esa función. Esto es útil para realizar operaciones en los elementos de un stream sin modificar el stream original.
                //Mapea cada vértice en la lista de adyacentes al valor de su campo dato. Esto convierte la lista de vértices adyacentes en una lista de sus datos asociados.
                .map(Vertice::getDato)
                //Mapea cada uno de los datos a sus representaciones de cadena. (Basicamente los convierte en cadena)
                .map(Object::toString)
                
                //El método .joining() es una operación proporcionada por la clase Collectors en Java, específicamente diseñada para concatenar elementos de un stream en una sola cadena de caracteres. Es útil cuando trabajas con streams de objetos y deseas obtener una representación de cadena que combine estos objetos.
                //El método .collect() en Java se utiliza en operaciones de streams para acumular los elementos de un stream en una colección o valor final. En otras palabras, collect() permite tomar los elementos de un stream y agruparlos, transformarlos o resumirlos en una estructura de datos o un valor específico.
                .collect(Collectors.joining(", ")) + '}';

    }

    //Metodo que reemplaza el .stream por un bucle
    public String ToString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vertice{");
        sb.append("dato=");
        sb.append(dato);
        sb.append(",adyacentes=");

        for (int i = 0; i < adyacente.size(); i++) {
            sb.append(adyacente.get(i).getDato());
            if (i < adyacente.size() - 1) {
                sb.append(", ");
            }
        }

        sb.append('}');
        return sb.toString();
    }

}

//Las ArrayList son colecciones. Las colecciones se utilizan para almacenar y manipular conjuntos de objetos y se organizan en el paquete java.util
//Las ArrayList estan diseñada para almacenar objetos (Instancias de una clase predefinida por java o creadas por el usuario).
//Los tipos primitivos no se pueden almacenar directamente en una ArrayList, pero puedes usar clases envolventes (por ejemplo, Integer para int).
//Tipos de datos primitivos en java:
//byte
//short
//int
//long
//float
//double
//boolean
//char

}
