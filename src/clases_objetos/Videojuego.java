package clases_objetos ;

public class Videojuego {
    //atributos
    private String titulo;
    private String plataforma;
    private Double precio;

    //constructor
    public Videojuego(String titulo, String plataforma, Double precio) {
        this.titulo = titulo;
        this.plataforma = plataforma;
        this.precio = precio;
    }

    //getters y setters
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getPlataforma() {
        return plataforma;
    }
    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
    public Double getPrecio() {
        return precio;
    }
    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    //método
    public Double calcularPrecio(int cantidad) {
        return (this.precio * cantidad);
    }
    
}
