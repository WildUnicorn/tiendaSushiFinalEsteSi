
package model;

/**
 *
 * @author Piaa FernanDaa
 */
public class Tipo {
    private int id;
    private String nombreTipo;

    public Tipo(int id, String nombreTipo) {
        this.id = id;
        this.nombreTipo = nombreTipo;
    }

    public Tipo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreTipo() {
        return nombreTipo;
    }

    public void setNombre(String nombreTipo) {
        this.nombreTipo = nombreTipo;
    }
    
        @Override
    public String toString() {
        return id+"-"+nombreTipo;
    }
}
