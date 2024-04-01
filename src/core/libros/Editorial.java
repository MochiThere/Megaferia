
package core.libros;

import core.megaferia.Stand;
import core.personas.Gerente;
import java.util.ArrayList;

public class Editorial {
    private String nit;
    private String nombre;
    private String direccion;
    private Gerente gerente;
    private ArrayList<Libro> libros;
    private ArrayList<Stand> stands;

    public Editorial(String nit, String nombre, String direccion, Gerente gerente, ArrayList<Libro> libros, ArrayList<Stand> stands) {
        this.nit = nit;
        this.nombre = nombre;
        this.direccion = direccion;
        this.gerente = gerente;
        this.libros = libros;
        this.stands = stands;
    }
    
    
    
}
