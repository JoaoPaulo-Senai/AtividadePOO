package Entidade;

public class Cilindro {

    public double raio;
    public double altura;

    public double raioElevado2 = raio*raio;
    public double calcularVolume(){
        return (3.14*raioElevado2)*altura;
    }

    public double calcularArea(){
        return 2*3.14*raio*(raio+altura);
    }
}
