package Principal;

import Entidade.Esfera;

import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o raio da esfera: ");
        double raio = scanner.nextDouble();

        Esfera esfera = new Esfera();
        esfera.raio = raio;
        esfera.raioElevado3 = Math.pow(raio, 3);
        esfera.raioElevado2 = Math.pow(raio, 2);

        System.out.println("Volume da esfera: " + esfera.calcularVolume());
        System.out.println("A area da esfera: " + esfera.calcularArea());
    }
}
