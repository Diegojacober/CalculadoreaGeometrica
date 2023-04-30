package entities;

public class Circulo extends OperacoesPlanas{
    private final Double PI = Math.PI;

    private Double raio;

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }


    @Override
    Double area() {
        return (this.PI * Math.pow(this.getRaio(),2));
    }

    @Override
    Double perimetro() {
        /* Circunferencia */
        return (this.PI * (this.getRaio() * 2));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("----------DADOS DO CIRCULO----------");
        sb.append("\nÁrea: "+String.format("%.2f",this.area()));
        sb.append("\nCircunferencia: "+String.format("%.2f",this.perimetro()));
        sb.append("\n------------------------------------");
        return sb.toString();
    }
}
