package Principal;

import Entidade.Retangulo;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o comprimento do retângulo: ");
        double comprimento = scanner.nextDouble();
        System.out.print("Digite a largura do retângulo: ");
        double largura = scanner.nextDouble();

        Retangulo retangulo = new Retangulo();
        retangulo.comprimento = comprimento;
        retangulo.largura = largura;

        System.out.println("Área do retângulo: " + retangulo.calcularArea());
        System.out.println("Perimetro do retângulo: " + retangulo.calcularPerimetro());
    }
}
