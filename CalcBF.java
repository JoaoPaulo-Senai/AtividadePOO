package Contas;

public class CalcBF {
    public double peso;
    public double altura;
    public double idade;
    public double imc = peso / (altura * altura);

    public double calcularBF(){
        return ((1.20 * imc) + (0.23 * idade) - 16.2);
    }}
