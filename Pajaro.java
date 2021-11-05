import Interface.Animal;

public class Pajaro extends Animal {

    private double alturaMaxima;

    public Pajaro(int edad, double alturaMaxima) {
        this.edad = edad;
        this.alturaMaxima = alturaMaxima;
    }

    @Override
    public Integer getEdad() {
        return this.edad;

    }

    public double getAlturaMaxima() {
        return alturaMaxima;
    }

    @Override
    public void dormir() {
        System.out.println("El Pajaro esta durmiento");

    }

    @Override
    public void comer() {
        System.out.println("El Pajaro esta comiendo");

    }

}
