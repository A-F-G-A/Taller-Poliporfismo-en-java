package Ejercicio_2;

public class Estudiante extends Persona {
    private String nombre;
    public Estudiante(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public void presentarse() {
        System.out.println("Hola, soy el estudiante " + nombre + ".");
    }
    
}