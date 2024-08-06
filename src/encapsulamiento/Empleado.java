/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamiento;

import java.util.ArrayList;

/**
 *
 * @author ACER
 */
public class Empleado {
     private String nombre;
     private int edad;
     private double salario;
     
     Empleado( String nombre, int edad, double salario){
         this.nombre = nombre ;
         this.edad = edad;
         this.salario = salario;
     }
     
     public String getNombre(){
         return this.nombre;
     }
     
      public void setNombre( String nombre){
          this.nombre = nombre;
      }
      
      public int getEdad(){
          return this.edad;
      }
      
      public void setEdad( int edad){
          if( edad >= 18){
              this.edad = edad;
          }
          
      }
      
      public double getSalario(){
          return this.salario;
      }
      
       public void setSalario( double salario){
           if(salario > 0){
               this.salario = salario;
           }
       }

       public static void main(String[] args) {
        // Crear una instancia de la clase Empleado
        Empleado empleado = new Empleado("Juan", 25, 3000.0);

        // Mostrar los valores iniciales de los atributos
        System.out.println("Nombre: " + empleado.getNombre());
        System.out.println("Edad: " + empleado.getEdad());
        System.out.println("Salario: " + empleado.getSalario());

        // Modificar los valores de los atributos
        empleado.setNombre("Carlos");
        empleado.setEdad(30);
        empleado.setSalario(3500.0);

        // Mostrar los valores modificados de los atributos
        System.out.println("Nombre modificado: " + empleado.getNombre());
        System.out.println("Edad modificada: " + empleado.getEdad());
        System.out.println("Salario modificado: " + empleado.getSalario());
    }
    // public static void main(String[] args) {
//         Empleado emp = new Empleado("Elmer" ,19, 45.2);
//         Empleado emp1 = new Empleado("Elmer" ,19, 45.2);
// Empleado emp2 = new Empleado("Elmer" ,19, 45.2);
//   Empleado emp3 = new Empleado("Elmer" ,19, 45.2);
//    Empleado emp4 = new Empleado("Elmer" ,19, 45.2);
        
//    ArrayList<Empleado> empleados = new ArrayList<Empleado>();
//    empleados.add(emp1);
//    empleados.add(emp2);
//    empleados.add(emp3);
//    empleados.add(emp4);
//         System.out.println(empleados.size());  
    // }
}