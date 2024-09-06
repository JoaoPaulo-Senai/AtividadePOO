package Principal;

import Entidade.Cone;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a area da base  do cone: ");
        double areaB = scanner.nextDouble();
        System.out.print("Digite a altura do cone: ");
        double altura = scanner.nextDouble();

        Cone cone = new Cone();
        cone.areaB = areaB;
        cone.altura = altura;

        System.out.println("Volume do cone: " + cone.calcularVolume());
    }
}
