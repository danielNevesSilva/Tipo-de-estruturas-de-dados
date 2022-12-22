package com.projetono;

public class Main {

    public static void main(String[] args) {

        No<String> no1 = new No<>("conteudo no1");

        No<String> no2 = new No<>( "conteudo n2");
        no1.setProximonNo(no2);

        No<String> no3 = new No<>( "conteudo n3");

        no2.setProximonNo(no3);

        No<String> no4 = new No<>("Conteudo no4");
        no3.setProximonNo(no4);


        //No1-> no2-> no3 ->no4->nullS

        System.out.println(no1);
        System.out.println(no1.getProximonNo());
        System.out.println(no2);

        System.out.println(no1);
        System.out.println(no1.getProximonNo());
        System.out.println(no1.getProximonNo().getProximonNo());
        System.out.println(no1.getProximonNo().getProximonNo().getProximonNo());
        System.out.println(no1.getProximonNo().getProximonNo().getProximonNo().getProximonNo());

    }
}
