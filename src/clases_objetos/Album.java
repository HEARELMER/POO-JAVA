package clases_objetos ;

public class Album {
    //atributos
    private String nombre;
    private String artista;
    private Double precio;
    //método constructor
    public Album(String nombre, String artista , Double precio){
        this.nombre = nombre;
        this.artista= artista;
        this.precio= precio;
    }
    
  
    //getters
    public String getNombre(){
        return this.nombre;
    }
    
    public String getArtista(){
        return this.artista;
    }
     public Double getPrecio(){
        return this.precio;
    }
     //setters
     
     public void setNombre(String nombre){
         this.nombre = nombre;
     }
       public void setArtista(String artista){
         this.artista = artista;
     }
       public void setPrecio(Double precio){
         this.precio = precio;
     }
       // método
       public Double calcularPrecio( int cantidad){
           return (this.precio * cantidad);
       }
       
    
}
   
