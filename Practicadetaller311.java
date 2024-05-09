package Practicadetaller311;
public class Practicadetaller311 {
    public static void main(String[] args) {
        // Crear un objeto Empleado
        Empleado empleado1 = new Empleado("Juan", 30, 2500.0);
        // Mostrar información del empleado
        System.out.println("Empleado:");
        System.out.println("Nombre: " + empleado1.getNombre());
        System.out.println("Edad: " + empleado1.getEdad());
        System.out.println("Salario: $" + empleado1.getSalario());

        // Crear un objeto Gerente
        Gerente gerente1 = new Gerente("Maria", 35, 3500.0, "Ventas");
        // Mostrar información del gerente
        System.out.println("\nGerente:");
        System.out.println("Nombre: " + gerente1.getNombre());
        System.out.println("Edad: " + gerente1.getEdad());
        System.out.println("Salario: $" + gerente1.getSalario());
        System.out.println("Departamento: " + gerente1.getDepartamento());
    }
}

// Clase Empleado
class Empleado {
    private String nombre;
    private int edad;
    private double salario;

    // Constructor
    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

// Clase Gerente que hereda de Empleado
class Gerente extends Empleado {
    private String departamento;

    // Constructor
    public Gerente(String nombre, int edad, double salario, String departamento) {
        super(nombre, edad, salario);
        this.departamento = departamento;
    }

    // Getter y setter específico para departamento
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}


