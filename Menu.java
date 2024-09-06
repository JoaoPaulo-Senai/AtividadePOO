package Entidade;

import  Contas.*;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1 - Calcular IMC");
        System.out.println("2 - Calcular Calorias");
        System.out.println("3 - Calcular BF");
        System.out.println("4 - Calcular Massa");
        System.out.println("5 - Sair");


        int opcao = scanner.nextInt();

        System.out.print("Insira o peso (kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Insira a altura (m): ");
        double altura = scanner.nextDouble();

        System.out.print("Insira a idade (anos): ");
        double idade = scanner.nextDouble();

        switch (opcao) {
            case 1:
                CalcIMC imc = new CalcIMC();
                imc.peso = peso;
                imc.altura = altura;

                System.out.println("Seu IMC é: "+ imc.calculateIMC());
                break;
            case 2:
                CalcCalorias calorias = new CalcCalorias();
                calorias.peso = peso;
                calorias.altura = altura;
                calorias.idade = idade;
                break;
            case 3:
                CalcBF calcBF = new CalcBF();
                calcBF.imc = peso / (altura * altura);
                calcBF.peso = peso;
                calcBF.altura = altura;
                calcBF.idade = idade;
                break;
            case 4:
                CalcMassa massa = new CalcMassa();
                massa.peso = peso;
                massa.altura = altura;
                break;
            case 5:
                System.out.println("Saindo...");
                break;
        }

        scanner.close();
    }
}
