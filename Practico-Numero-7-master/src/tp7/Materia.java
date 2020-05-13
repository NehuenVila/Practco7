/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp7;

/**
 *
 * @author pablo
 */
public class Materia {

    private int idMateria;
    private String nombre;
    private int annio;

    public Materia(int idMateria, String nombre, int annio){
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.annio = annio;
    }

    public int getAnnio() {
        return annio;
    }
    public void setAnnio(int annio) {
        this.annio = annio;
    }

    public int getIdMateria() {
        return idMateria;
    }
    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    
}
