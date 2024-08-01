
package Model;

public class Mamifero extends Animal{

    
    public Mamifero(String nombre) {
        super(nombre);
    }

    @Override
    public String accion_sonido() {
        return "Ruge Ruge";
    }

    @Override
    public String accion_desplazar() {
        return "Corren";
    }
}
