package Contas;

public class CalcMassa {

    public double peso;

    public double altura;

    public double calcularMassa(){
        return ((0.407 * peso) + (0.267 * altura)) - 19.2;
    }
}
