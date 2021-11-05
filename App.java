import java.util.ArrayList;
import java.util.List;

import Interface.*;

public class App {

    public static void main(String[] args) throws Exception {
        List<Animal> animales = new ArrayList<Animal>();

        animales.add(new Leon(10, 500));
        animales.add(new Leon(15, 450));
        animales.add(new Leon(17, 460));
        animales.add(new Tigre(12, "Oscuro"));
        animales.add(new Tigre(13, "Claro"));

        animales.add(new Pajaro(3, 10.0));
        animales.add(new Pajaro(2, 50));
        animales.add(new Pajaro(4, 15));
        animales.add(new Pajaro(36, 345));
        animales.add(new Elefante(60, 2));

        System.out.println("********Orden Original*********");

        for (Animal animal : animales) {

            System.out.println(animal.getEdad());

        }

        System.out.println("*******Orden Ascendente*********");

        animales.sort((a1, a2) -> a1.getEdad().compareTo(a2.getEdad()));

        for (Animal animal : animales) {

            System.out.println(animal.getEdad());

        }

        System.out.println("*****Orden Descendente***********");

        animales.sort((a1, a2) -> a2.getEdad().compareTo(a1.getEdad()));

        for (Animal animal : animales) {

            System.out.println(animal.getEdad());

        }

        System.out.println("*Obtener los leones que pesen más de 200 kilos.");

        animales.stream().filter((a) -> a instanceof Leon && ((Leon) a).getPeso() > 200)
                .forEach((a) -> System.out.println(a + ": " + a.getEdad()));

        /*
         * for (Animal animal : animales) { if (animal instanceof Leon && ((Leon)
         * animal).getPeso() > 200) {
         * 
         * }
         * 
         * }
         */

        System.out.println("*Obtener los tigres que tienen un color de pelo oscuro.");

        animales.stream().filter((a) -> a instanceof Tigre && ((Tigre) a).getColor().equalsIgnoreCase("oscuro"))
                .forEach((a) -> System.out.println(a + ": " + a.getEdad()));

        System.out.println(
                "*Obtener los pájaros que vuelen a una altura mayor a 200 metros y que tengan más de 35 años.");

        animales.stream().filter(
                (a) -> a instanceof Pajaro && ((Pajaro) a).getAlturaMaxima() > 200 && ((Pajaro) a).getEdad() > 35)
                .forEach((a) -> System.out.println(a + ": " + a.getEdad()));

        System.out.println("*Obtener los elefantes cuya trompa sea igual a 2 metros.");

        animales.stream().filter((a) -> a instanceof Elefante && ((Elefante) a).getTamanioTrompa() == 2)
                .forEach((a) -> System.out.println(a + ": " + a.getEdad()));

    }// Main

}
