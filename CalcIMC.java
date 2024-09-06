package Contas;

public class CalcIMC {
    public double peso;
    public double altura;

    public double calculateIMC(){
        return peso/(altura*altura);
    }
}
