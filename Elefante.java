import Interface.Animal;

public class Elefante extends Animal {

    private double tamanioTrompa;

    public Elefante(int edad, double tamanioTrompa) {
        this.edad = edad;
        this.tamanioTrompa = tamanioTrompa;
    }

    @Override
    public Integer getEdad() {
        return this.edad;

    }

    public double getTamanioTrompa() {
        return tamanioTrompa;
    }

    @Override
    public void dormir() {
        System.out.println("El Elefante esta durmiento");

    }

    @Override
    public void comer() {
        System.out.println("El Elefante esta comiendo");

    }
}
