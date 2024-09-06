package Entidade;

import Contas.CalcCalorias;

import java.util.Scanner;

public class Calorias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o peso (kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Insira a altura (cm): ");
        double altura = scanner.nextDouble();

        System.out.print("Insira a idade (anos): ");
        double idade = scanner.nextDouble();

        CalcCalorias calorias = new CalcCalorias();
        calorias.peso = peso;
        calorias.altura = altura;
        calorias.idade = idade;


        System.out.println("Você precisa de: "+ calorias.calcularCalo() + " Calorias por dia");
    }
}
