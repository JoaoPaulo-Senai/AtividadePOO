package Entidade;

import Contas.CalcBF;

import java.util.Scanner;
public class BF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o peso (kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Insira a altura (m): ");
        double altura = scanner.nextDouble();

        System.out.println("Insira sua idade: ");
        double idade = scanner.nextDouble();

        CalcBF calcBF = new CalcBF();
        calcBF.imc = peso / (altura * altura);
        calcBF.peso = peso;
        calcBF.altura = altura;
        calcBF.idade = idade;


        System.out.println("Seu índice de massa corporal é: "+ calcBF.calcularBF());
    }
}
