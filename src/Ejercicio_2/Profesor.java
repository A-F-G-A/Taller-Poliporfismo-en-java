package Ejercicio_2;

public  class Profesor extends Persona {
    private String nombre;
    public Profesor(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public void presentarse() {
        System.out.println("Hola, soy el profesor " + nombre + ".");
    }
}