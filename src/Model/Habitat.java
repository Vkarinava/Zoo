
package Model;

import java.util.ArrayList;

public class Habitat {
    private String Nombre;    
    private String Descripcion;        
    private String tamano;    
    
    public ArrayList<Ave> Lista_Aves = new ArrayList<Ave>();       
    public ArrayList<Mamifero> Lista_Mamiferos = new ArrayList<Mamifero>();           

    public Habitat() {
    }

    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }
    
}
