package entities;

public class Pentagono extends OperacoesPlanas{
    private Double apotema;
    private Double lado;

    public Double getApotema() {
        return apotema;
    }

    public void setApotema(Double apotema) {
        this.apotema = apotema;
    }

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }

    @Override
    Double area() {
        return ((this.perimetro() * this.getApotema())/ 2);
    }

    @Override
    Double perimetro() {
        return (this.getLado() * 5);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("----------DADOS DO PENTAGONO----------");
        sb.append("\nÁrea: "+String.format("%.2f",this.area()));
        sb.append("\nPerimetro: "+String.format("%.2f",this.perimetro()));
        sb.append("\n--------------------------------------");
        return sb.toString();
    }
}
