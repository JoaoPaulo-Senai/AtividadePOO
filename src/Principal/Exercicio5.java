package Principal;

import Entidade.Piramide;

import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a base da pirâmide: ");
        double Abase = scanner.nextDouble();
        System.out.print("Digite a altura da pirâmide: ");
        double altura = scanner.nextDouble();

        Piramide piramide = new Piramide();
        piramide.Abase = Abase;
        piramide.altura = altura;


        System.out.println("Volume da pirâmide: " + piramide.calcularVolume());
        System.out.println("Area: " + piramide.calcularAreaSuperior());
    }
}
