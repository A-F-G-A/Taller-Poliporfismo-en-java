package Ejercicio_4;

public class Main {
    public static void main(String[] args) {
        Vehiculo miVehiculo1 = new Carro();
        Vehiculo miVehiculo2 = new Bicicleta();

        miVehiculo1.mover(); // Salida: El carro se esta moviendo.
        miVehiculo2.mover(); // Salida: La bicicleta se está moviendo.
    }
}