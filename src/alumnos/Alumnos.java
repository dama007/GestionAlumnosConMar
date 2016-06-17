/*
 Evaluaciones no
 */
package alumnos;

import java.util.ArrayList;
import utilidades.EntradaDatos;

/**
 *
 * @author usu21
 */
public class Alumnos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Alumno> aula = new ArrayList<>();
        int opcion;
        do {
            menu();
            opcion = EntradaDatos.pedirEntero("Escoge una opción");
            switch (opcion) {
                case 1:
                    Alumno a = crearAlumno();
                    aula.add(a);
                    System.out.println("Alumno dado de alta.");
                    break;
                case 2:
                    if (aula.isEmpty()) {
                        System.out.println("No hay alumnos dados de alta");
                    }else {
                        listarAlumnos(aula);
                    }
                    break;
                case 3:
                    if (aula.isEmpty()) {
                        System.out.println("No hay alumnos dados de alta.");
                    } else {
                        maxAlumno(aula);
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opción incorrecta!");
            }
        }while (opcion != 0);
        
       
    }
    public static void maxAlumno(ArrayList<Alumno> aula) {
     Alumno maximo = aula.get(0);
     for (Alumno actual : aula) {
         if (actual.getNota() > maximo.getNota()) {
             maximo = actual;
         }
     }
        System.out.println("El alumno" + maximo.getNombre());
        System.out.println("Tiene la nota más alta: " + maximo.getNota());
    }
        
        public static void listarAlumnos(ArrayList<Alumno> aula) {
            System.out.println("Listado de alumnos");
            for (Alumno a : aula) {
                System.out.println(a.getNombre() + ":" +a.getNota());  
            }
            System.out.println("Hay" + aula.size() + "alumnos en total.");
        }
    
    public static Alumno crearAlumno() {
        String nombre = EntradaDatos.pedirCadena("Introduce el nombre del alumno");
        double nota;
        do {
        nota = EntradaDatos.pedirDouble("Introduce la nota.");
        if (nota < 0 || nota > 10) {
            System.out.println("Nota incorrecta. Debe estar entre 0 y 10.");
        }
    }while (nota < 0 || nota > 10);
        Alumno a = new Alumno(nombre, nota);
        return a;
    }
    
    public static void menu() {
            System.out.println("Gestión de alumnos");
            System.out.println("1. Alta alumno");
            System.out.println("2. Ver listado de alumnos");
            System.out.println("3. Alumno con la nota más alta");
            System.out.println("0. Salir");
    }
    
}
