package Ejercicio_1;

// Clase de Prueba
public class Main {
    public static void main(String[] args) {
        Figura figura1 = new Circulo(5);
        figura1.C_Area();// Polimorfismo dinamico: Muestra el área del círculo

        Figura figura2 = new Rectangulo(4, 6);
        figura2.C_Area();// Polimorfismo dinamico: Muestra el área del rectángulo
    }
}