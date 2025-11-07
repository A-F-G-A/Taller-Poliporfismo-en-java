package Ejercicio_1;

// Clase Derivada circulo
public class Circulo extends Figura{

    private double radio;
    public Circulo(double radio){
        this.radio = radio;
    }
    @Override
    public void C_Area(){
        double area = Math.PI * radio * radio;
        System.out.println("Area del círculo: " + area);
    }
}
