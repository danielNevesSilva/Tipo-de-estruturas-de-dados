package one.digitalivovaion;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Carro> listaCarro = new ArrayList<>();

        listaCarro.add(new Carro("ford"));
        listaCarro.add(new Carro ("Checrollet"));
        listaCarro.add(new Carro("Tesla"));

        System.out.println(listaCarro.contains(new Carro("Ford")));
        System.out.println(new Carro("Ford1").hashCode());
        System.out.println(new Carro("Ford").hashCode());

        Carro carro1 = new Carro("Forde");
        Carro carro2 = new Carro("Tesla");


        System.out.println(carro1.equals(carro2));
    }
}
