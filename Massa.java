package Entidade;

import Contas.CalcMassa;

import java.util.Scanner;
public class Massa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o peso (kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Insira a altura (m): ");
        double altura = scanner.nextDouble();

        CalcMassa massa = new CalcMassa();
        massa.peso = peso;
        massa.altura = altura;


        System.out.println("sua massa magra é: "+ massa.calcularMassa());
    }
}
