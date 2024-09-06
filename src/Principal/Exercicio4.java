package Principal;

import Entidade.Cilindro;

import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o raio do cilindro: ");
        double raio = scanner.nextDouble();
        System.out.print("Digite a altura do cilindro: ");
        double altura = scanner.nextDouble();

        Cilindro cilindro = new Cilindro();
        cilindro.raio = raio;
        cilindro.altura = altura;
        cilindro.raioElevado2 = Math.pow(raio, 2);

        System.out.println("Volume do cilindro: " + cilindro.calcularVolume());
        System.out.println("Área da base do cilindro: " + cilindro.calcularArea());
    }
}
