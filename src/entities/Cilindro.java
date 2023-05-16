package entities;

public class Cilindro  extends OperacoesEspaciais{
    private Double raio;
    private Double altura;

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    Double volume() {
        return (Math.PI * Math.pow(raio, 2)) * altura;
    }

    @Override
    Double areaTotal() {
        return (2 * (Math.PI * Math.pow(raio, 2))) + (2 * Math.PI * raio * altura);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("----------DADOS DO CILINDRO----------");
        sb.append("\nÁrea total: "+String.format("%.2f",this.areaTotal()));
        sb.append("\nVolume: "+String.format("%.2f",this.volume()));
        sb.append("\n------------------------------------");
        return sb.toString();
    }
}
