import Interface.Animal;

public class Leon extends Animal {
    private double peso;

    public Leon(int edad, double peso) {
        this.edad = edad;
        this.peso = peso;

    }

    @Override
    public Integer getEdad() {
        return this.edad;

    }

    public double getPeso() {
        return peso;
    }

    @Override
    public void dormir() {
        System.out.println("El Leon esta durmiento");

    }

    @Override
    public void comer() {
        System.out.println("El Leon esta comiendo");

    }

}
