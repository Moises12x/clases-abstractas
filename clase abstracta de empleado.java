public class Main {
    // Clase abstracta 
public abstract class Empleado {
    private String nombre;
    private int edad;

    public Empleado(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public abstract double calcularSalario();
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Salario: $" + calcularSalario());
    }
   
class Gerente extends Empleado {
    private double salarioBase;
    private double bono;

    public Gerente(String nombre, int edad, double salarioBase, double bono) {
        super(nombre, edad);
        this.salarioBase = salarioBase;
        this.bono = bono;
    }

    public double calcularSalario() {
        return salarioBase + bono;
    }
}
class Vendedor extends Empleado {
    private double salarioBase;
    private double comision;
    private int ventas;

    public Vendedor(String nombre, int edad, double salarioBase, double comision, int ventas) {
        super(nombre, edad);
        this.salarioBase = salarioBase;
        this.comision = comision;
        this.ventas = ventas;
    }
    public double calcularSalario() {
        return salarioBase + (comision * ventas);
    }
}
public class Main {
    public static void main(String[] args) {
        Empleado gerente = new Gerente("Ana", 45, 5000, 1500);
        Empleado vendedor = new Vendedor("Carlos", 30, 3000, 200, 15);

        gerente.mostrarDetalles();
        System.out.println();
        vendedor.mostrarDetalles();
    }
}
}
}