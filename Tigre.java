import Interface.Animal;

public class Tigre extends Animal {

    private String color; /* Oscuro o Claro */

    public Tigre(int edad, String color) {
        this.edad = edad;
        this.color = color;
    }

    @Override
    public Integer getEdad() {
        return this.edad;

    }

    public String getColor() {
        return color;
    }

    @Override
    public void dormir() {
        System.out.println("El Tigre esta durmiendo");

    }

    @Override
    public void comer() {
        System.out.println("El Tigre esta comiendo");

    }

}
