
package Model;

public class Ave extends Animal {

    public Ave(String nombre) {
        super(nombre);
    }

    

    @Override
    public String accion_sonido() {
        return "Canta Canta Canta";
        
    }

    @Override
    public String accion_desplazar() {
        return "Vuela Vuela...";
    }
    
    
}
