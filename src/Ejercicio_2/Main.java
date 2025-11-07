package Ejercicio_2;

public class Main {
    public static void main(String[] args) {
        Persona estudiante = new Estudiante("Frank");
        Persona profesor = new Profesor("Ian");
        
        estudiante.presentarse();
        profesor.presentarse();
    }
}