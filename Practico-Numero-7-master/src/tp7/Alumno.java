/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp7;

import java.util.HashSet;

/**
 *
 * @author pablo
 */
public class Alumno {
    
//    Atributos
    private int legajo;
    private String apellido;
    private String nombre;
    HashSet materias = new HashSet<>();
    

    public Alumno (int legajo, String apellido, String nombre){
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
    }
   
    public int getLegajo() {
        return legajo;
    }
    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void agregarMateria(Materia materia){
        materias.add(materia);
    }
        
    
    public int cantidadMaterias(){
        System.out.println(apellido + " " + "esta inscripto a" + " " + materias.size() + " materias.");
        return materias.size();
    }
    
    




}
