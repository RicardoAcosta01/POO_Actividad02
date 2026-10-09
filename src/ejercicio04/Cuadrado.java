package ejercicio04;

public class Cuadrado {
    int lado;

    public Cuadrado(int lado) {
        this.lado = lado;
    }

    public double calcularArea() {
        return lado * lado;
    }

    public double calcularPerimetro() {
        return 4 * lado;
    }
}

