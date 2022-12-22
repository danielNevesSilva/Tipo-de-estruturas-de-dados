package testes;

import javax.swing.*;
import java.util.Scanner;

public interface Tela {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome");
        String nome = sc.nextLine();

        JOptionPane.showMessageDialog(this, "Aperte");
    }
}
