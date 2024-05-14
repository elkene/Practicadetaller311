public abstract class ItemBiblioteca {
    private String titulo;
    private int anioPublicacion;
    private boolean prestado;

    public ItemBiblioteca(String titulo, int anioPublicacion) {
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.prestado = false; 
    }

    public void prestar() {
        if (!this.prestado) {
            System.out.println("El elemento '" + this.titulo + "' ha sido prestado.");
            this.prestado = true;
        } else {
            System.out.println("El elemento '" + this.titulo + "' ya está prestado.");
        }
    }

    public void devolver() {
        if (this.prestado) {
            System.out.println("El elemento '" + this.titulo + "' ha sido devuelto.");
            this.prestado = false;
        } else {
            System.out.println("El elemento '" + this.titulo + "' no está prestado.");
        }
    }

    public boolean estaPrestado() {
        return this.prestado;
    }
}

public interface Prestable {
    void prestar();
    void devolver();
    boolean estaPrestado();
}

public class Libro extends ItemBiblioteca implements Prestable {
    public Libro(String titulo, int anioPublicacion) {
        super(titulo, anioPublicacion);
    }

    public static void main(String[] args) {
        Libro libro = new Libro("Cien años de soledad", 1967);
        libro.prestar();
        libro.devolver();
        libro.devolver(); 
    }
}
