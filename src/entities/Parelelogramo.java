package entities;

public class Parelelogramo extends OperacoesPlanas{

    private Double base;
    private Double altura;

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("----------DADOS DO PARALELOGRAMO----------");
        sb.append("\nÁrea: "+String.format("%.2f",this.area()));
        sb.append("\nPerimetro: "+String.format("%.2f",this.perimetro()));
        sb.append("\n------------------------------------------");
        return sb.toString();
    }

    @Override
    Double area() {
        return this.getAltura() * this.getBase();
    }

    @Override
    Double perimetro() {
        return ((this.getBase() * 2) + (this.getAltura() * 2));
    }
}
