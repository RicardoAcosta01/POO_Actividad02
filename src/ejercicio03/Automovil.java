package ejercicio03;

public class Automovil {
    String marca;
    int modelo;
    int motor;
    
    public enum tipoCom { GASOLINA, BIOETANOL, DIESEL, BIODIESEL, GAS_NATURAL }
    public enum tipoA { CIUDAD, SUBCOMPACTO, COMPACTO, FAMILIAR, EJECUTIVO, SUV }
    public enum tipoColor { BLANCO, NEGRO, ROJO, NARANJA, AMARILLO, VERDE, AZUL, VIOLETA }
    
    tipoCom tipoCombustible;
    tipoA tipoAutomovil;
    int numeroPuertas;
    int cantidadAsientos;
    int velocidadMaxima;
    tipoColor color;
    int velocidadActual = 0;

    public Automovil(String marca, int modelo, int motor, tipoCom tipoCombustible, 
                    tipoA tipoAutomovil, int numeroPuertas, int cantidadAsientos, 
                        int velocidadMaxima, tipoColor color) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tipoCombustible = tipoCombustible;
        this.tipoAutomovil = tipoAutomovil;
        this.numeroPuertas = numeroPuertas;
        this.cantidadAsientos = cantidadAsientos;
        this.velocidadMaxima = velocidadMaxima;
        this.color = color;
    }

    public int getVelocidadActual() { return velocidadActual; }
    public void setVelocidadActual(int velocidadActual) { this.velocidadActual = velocidadActual; }

    public void acelerar(int incremento) {
        if (velocidadActual + incremento > velocidadMaxima) {
            System.out.println("No se puede superar la velocidad máxima permitida.");
        } else {
            velocidadActual += incremento;
        }
    }

    public void desacelerar(int decremento) {
        if (velocidadActual - decremento < 0) {
            System.out.println("No se puede desacelerar a una velocidad negativa.");
        } else {
            velocidadActual -= decremento;
        }
    }

    public void frenar() {
        velocidadActual = 0;
    }

    public double calcularTiempoLlegada(int distancia) {
        return (double) distancia / velocidadActual;
    }

    public void imprimir() {
        System.out.println("Marca = " + marca);
        System.out.println("Modelo = " + modelo);
        System.out.println("Motor = " + motor);
        System.out.println("Tipo de combustible = " + tipoCombustible);
        System.out.println("Tipo de automóvil = " + tipoAutomovil);
        System.out.println("Número de puertas = " + numeroPuertas);
        System.out.println("Cantidad de asientos = " + cantidadAsientos);
        System.out.println("Velocidad máxima = " + velocidadMaxima);
        System.out.println("Color = " + color);
        System.out.println("Velocidad actual = " + velocidadActual);
    }

    public static void main(String[] args) {
        Automovil auto1 = new Automovil("Ford", 2018, 3, tipoCom.GASOLINA, tipoA.COMPACTO, 4, 5, 200, tipoColor.ROJO);
        auto1.imprimir();
        auto1.setVelocidadActual(100);
        System.out.println("Velocidad actual = " + auto1.getVelocidadActual());
        auto1.acelerar(20);
        System.out.println("Velocidad actual = " + auto1.getVelocidadActual());
        auto1.desacelerar(50);
        System.out.println("Velocidad actual = " + auto1.getVelocidadActual());
        auto1.frenar();
        System.out.println("Velocidad actual = " + auto1.getVelocidadActual());
    }
}

