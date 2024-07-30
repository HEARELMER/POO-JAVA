/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobrecarga;

/**
 *
 * @author ACER
 */
public class Empleado {
    
    private String nombre;
    private String apellido;
    private String cargo;

    public Empleado( String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public Empleado( String nombre, String apellido, String cargo){
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
    }

    public static void main(String[] args){
        Empleado empleado1= new Empleado("Elmer", "Rios");
        Empleado empleado2 = new Empleado("Elmer", "Rios", "estdiante");
        System.out.println(empleado1);
        System.out.println(empleado2);
    }
}
