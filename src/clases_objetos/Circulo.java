// Escribe un programa que calcule el área de una región circular (el área
// sombreada en el diagrama), dado los radios del círculo interior y el círculo
// exterior, ri y ro, respectivamente.
// Calculamos el área de la región circular restando el
// área del círculo interior del área del círculo exterior.
// Define una clase Circulo que tenga métodos para
// calcular el área y la circunferencia. Estableces el radio
// del círculo con el método setRadio o a través de un
// constructor.

package clases_objetos ;

public class Circulo {
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2); // el pow es para elevar al cuadrado
    }

    public double calcularCircunferencia() {
        return 2 * Math.PI * radio;
    }

    public static void main(String[] args) {
        Circulo circuloExterior = new Circulo(10.0); 
        Circulo circuloInterior = new Circulo(5.0);  

        double area= circuloExterior.calcularArea() - circuloInterior.calcularArea();

        System.out.println("El área de la región circular es: " + area);
    }
}
