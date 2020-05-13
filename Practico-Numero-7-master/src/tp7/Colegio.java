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
public class Colegio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Materia materia = new Materia(0, "Biologia", 1);
        Materia materia1 = new Materia(1, "Matematicas", 1);
        Materia materia2 = new Materia(2, "Ingles I", 1);
        
        Alumno alumno = new Alumno(1001, "Lopes", "Pedro");
        Alumno alumno1 = new Alumno(1002, "Martines", "lucia");
        
        alumno.agregarMateria(materia);
        alumno.agregarMateria(materia1);
        alumno.agregarMateria(materia2);
        
        alumno1.agregarMateria(materia);
        alumno1.agregarMateria(materia1);
        alumno1.agregarMateria(materia2);
        
        alumno.agregarMateria(materia);
        alumno.cantidadMaterias();
        alumno1.cantidadMaterias();
    }
    
}
