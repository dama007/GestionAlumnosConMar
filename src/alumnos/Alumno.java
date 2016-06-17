/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumnos;

/**
 *
 * @author usu21
 */
public class Alumno {
    
    private String nombre;
     private double nota;

    public Alumno(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }
     public Alumno(String nombre) {
        this.nombre = nombre;
        this.nota = -1;
    }
   

    public Alumno(double nota) {
        this.nota = nota;
    }
    

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
