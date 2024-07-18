// Escriba un programa donde se define una clase `Temperatura` con dos
// métodos de acceso (`getFahrenheit` y `getCelsius`) y dos métodos de
// modificación (`setFahrenheit` y `setCelsius`). La temperatura se mantiene
// internamente en grados Fahrenheit. En el método `main`, se pide al usuario
// que introduzca una temperatura en grados Fahrenheit, se establece esa
// temperatura en la clase `Temperatura` y luego se imprime la temperatura
// equivalente en grados Celsius.


package clases_objetos ;


import java.util.Scanner;

public class Temperatura {
    private double fahrenheit;

    public Temperatura(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public double getCelsius() {
        return (fahrenheit - 32) * 5 / 9;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setCelsius(double celsius) {
        this.fahrenheit = celsius * 9 / 5 + 32;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca una temperatura en grados Fahrenheit: ");
        double temperaturaF = scanner.nextDouble();

        Temperatura temperatura = new Temperatura(temperaturaF);

        System.out.println("Temperatura equivalente en grados Celsius: " + temperatura.getCelsius());
    }
}
