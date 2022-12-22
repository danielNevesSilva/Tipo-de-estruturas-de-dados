package Dio.DigitalInovation;

public class Main {
    public static void main(String[] args) {
        ListaCircular minhaLista = new ListaCircular();

        minhaLista.add("C1");
        minhaLista.add("C2");
        minhaLista.add("C3");
        minhaLista.add("C4");
        minhaLista.add("C5");

        System.out.println(minhaLista);

//        System.out.println(minhaLista.get(1));
//        System.out.println(minhaLista.get(2));
//        System.out.println(minhaLista.get(3));
//        System.out.println(minhaLista.get(4));
//        System.out.println(minhaLista.get(5));
//        System.out.println(minhaLista.get(6));

        for (int i = 1; i > 0; i++){
            System.out.println(minhaLista.get(i));
        }

            }
}
