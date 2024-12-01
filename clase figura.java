public class Main {
abstract class Figura {
    public abstract double calcularArea();
}
class Circulo extends Figura {
    private double radio;
    
    public Circulo(double radio) {
        this.radio = radio;
    }
// Implementacion
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }
}
class Rectangulo extends Figura {
    private double largo;
    private double ancho;

    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    public double calcularArea() {
        return largo * ancho;
    }
}

// Clase para probar las clases Figura, Circulo y Rectangulo
public class Main {
    public static void main(String[] args) {
        // Crear un circulo de radio 5
        Figura circulo = new Circulo(5);
        System.out.println("Área del círculo: " + circulo.calcularArea());

        // Crear un rectangulo de largo 4 y ancho 7
        Figura rectangulo = new Rectangulo(4, 7);
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
    }
}

}
