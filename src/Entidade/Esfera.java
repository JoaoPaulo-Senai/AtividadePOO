package Entidade;

public class Esfera {

    public double raio;

    public double raioElevado3 = raio*raio*raio;

    public double raioElevado2 = raio*raio;

    public double calcularVolume(){
        return 4*3.14*(raioElevado3/3);
    }

    public double calcularArea() {
        return 4 * 3.14 * raioElevado2;
    }
}
