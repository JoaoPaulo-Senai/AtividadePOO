package Contas;

public class CalcCalorias {

    public double peso;
    public double altura;

    public double idade;

    public double calcularCalo(){
        return ((13.75*peso)+(5*altura)-(6.76*idade)+66.5);
    }
}
