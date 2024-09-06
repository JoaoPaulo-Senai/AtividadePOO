package Entidade;

public class Retangulo {
    public double comprimento;
    public double largura;

    public double calcularArea(){
        return comprimento*largura;
    }

    public double calcularPerimetro(){
        return 2*(comprimento+largura);
    }
}
