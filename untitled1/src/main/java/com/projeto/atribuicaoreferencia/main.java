package com.projeto.atribuicaoreferencia;
public class main {
    public static void main(String[] args) {
        int intA = 1;
        int intB = intA;
        System.out.println("intA = " +  intA + " int B = " + intB);
        intA = 2;
        System.out.println("intA = " +  intA + " int B = " + intB);

        MeuOBJ objA = new MeuOBJ(1);
        MeuOBJ objB = objA;


        System.out.println("objA =" + objA + "objB" + objB);
        objA.setnum(2);
        System.out.println("objA =" + objA + "objB" + objB);

    }
}
