package entities;

public class Trapezio extends OperacoesPlanas{

    private Double baseMaior;
    private Double baseMenor;
    private Double lado;
    private Double altura;

    public Double getBaseMaior() {
        return baseMaior;
    }

    public void setBaseMaior(Double baseMaior) {
        this.baseMaior = baseMaior;
    }

    public Double getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(Double baseMenor) {
        this.baseMenor = baseMenor;
    }

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    Double area() {
        Double area = ((this.getAltura() * ( this.getBaseMenor() * this.getBaseMaior())) / 2);
        return area;
    }

    @Override
    Double perimetro() {
        Double perimetro = (this.getBaseMaior() + this.getBaseMenor() + (this.getLado() * 2));
        return perimetro;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("----------DADOS DO TRAPÉZIO----------");
        sb.append("\nÁrea: "+String.format("%.2f",this.area()));
        sb.append("\nPerimetro: "+String.format("%.2f",this.perimetro()));
        sb.append("\n-------------------------------------");
        return sb.toString();
    }
}
