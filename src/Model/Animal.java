
package Model;

public abstract class Animal {
    private  String nombre;
    


    public Animal(String nombre) {
        this.nombre = nombre;

    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public abstract String accion_desplazar();
    public abstract String accion_sonido();

}
