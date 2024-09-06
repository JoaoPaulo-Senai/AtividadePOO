package Entidade;

public class Piramide {

    public double Abase;
    public double altura;
    public double calcularVolume(){
        return (Abase*altura)/3;
    }

    public double calcularAreaSuperior(){
        return Math.sqrt(Abase*Abase + (altura*altura)/4);
    }
}
