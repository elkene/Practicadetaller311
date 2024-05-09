package Practicadetaller311;

public class Tarea311 {
    public static void main(String[] args) {
        // Crear un objeto Camión
        Camion camion1 = new Camion("Volvo", "FH16", 2022, 150000.0, 20000.0, "Diesel");
        // Mostrar información del camión
        System.out.println("Camión:");
        System.out.println("Marca: " + camion1.getMarca());
        System.out.println("Modelo: " + camion1.getModelo());
        System.out.println("Año: " + camion1.getAnio());
        System.out.println("Precio: $" + camion1.getPrecio());
        System.out.println("Capacidad de Carga: " + camion1.getCapacidadCarga() + " kg");
        System.out.println("Tipo de Combustible: " + camion1.getTipoCombustible());

        // Crear un objeto Vehículo Utilitario
        VehiculoUtilitario utilitario1 = new VehiculoUtilitario("Ford", "Transit", 2021, 30000.0, 5, 10.5);
        // Mostrar información del vehículo utilitario
        System.out.println("\nVehículo Utilitario:");
        System.out.println("Marca: " + utilitario1.getMarca());
        System.out.println("Modelo: " + utilitario1.getModelo());
        System.out.println("Año: " + utilitario1.getAnio());
        System.out.println("Precio: $" + utilitario1.getPrecio());
        System.out.println("Capacidad de Pasajeros: " + utilitario1.getCapacidadPasajeros());
        System.out.println("Volumen de Carga: " + utilitario1.getVolumenCarga() + " m^3");
    }
}

// Clase Padre: Vehículo
class Vehiculo {
    private String marca;
    private String modelo;
    private int anio;
    private double precio;

    // Constructor
    public Vehiculo(String marca, String modelo, int anio, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.precio = precio;
    }

    // Getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnio() {
        return anio;
    }

    public double getPrecio() {
        return precio;
    }
}

// Clase Hijo 1: Camión
class Camion extends Vehiculo {
    private double capacidadCarga;
    private String tipoCombustible;

    // Constructor
    public Camion(String marca, String modelo, int anio, double precio, double capacidadCarga, String tipoCombustible) {
        super(marca, modelo, anio, precio);
        this.capacidadCarga = capacidadCarga;
        this.tipoCombustible = tipoCombustible;
    }

    // Getters específicos
    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }
}

// Clase Hijo 2: Vehículo Utilitario
class VehiculoUtilitario extends Vehiculo {
    private int capacidadPasajeros;
    private double volumenCarga;

    // Constructor
    public VehiculoUtilitario(String marca, String modelo, int anio, double precio, int capacidadPasajeros, double volumenCarga) {
        super(marca, modelo, anio, precio);
        this.capacidadPasajeros = capacidadPasajeros;
        this.volumenCarga = volumenCarga;
    }

    // Getters específicos
    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public double getVolumenCarga() {
        return volumenCarga;
    }
}
