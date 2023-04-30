package entities;

public class Triangulo extends OperacoesPlanas{
    private double base;
    private double altura;
    private double lado;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    Double area() {
        return ((this.base * this.altura) / 2);
    }

    @Override
    Double perimetro() {
        return (this.lado * 3);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("----------DADOS DO TRIÂNGULO----------");
        sb.append("\nÁrea: "+String.format("%.2f",this.area()));
        sb.append("\nPerimetro: "+String.format("%.2f",this.perimetro()));
        sb.append("\n--------------------------------------");
        return sb.toString();
    }
}
