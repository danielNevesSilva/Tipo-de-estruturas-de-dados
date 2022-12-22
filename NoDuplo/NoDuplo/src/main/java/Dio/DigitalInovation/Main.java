package Dio.DigitalInovation;

public class Main {
    public static void main(String[] args) {

        ListaDuplamenteEncadeada<String> minhalista = new ListaDuplamenteEncadeada<>();

                minhalista.add("C1");
                minhalista.add("C2");
                minhalista.add("C3");
                minhalista.add("C4");
                minhalista.add("C5");
                minhalista.add("C6");
                minhalista.add("C7");
                minhalista.add("C8");

        System.out.println(minhalista);

        minhalista.remove(3);
        minhalista.add(3, "99");
        System.out.println(minhalista);

        System.out.println(minhalista.size());


    }
}
