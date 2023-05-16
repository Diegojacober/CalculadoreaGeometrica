package entities;

public class Cone extends  OperacoesEspaciais{
    private Double raio;
    private Double altura;
    private Double geratriz;

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

    public Double getGeratriz() {
        return geratriz;
    }

    public void setGeratriz(Double geratriz) {
        this.geratriz = geratriz;
    }

    @Override
    Double volume() {
        return (1.0/3.0 * (Math.PI * Math.pow(raio, 2))) * altura;
    }

    @Override
    Double areaTotal() {
        return (Math.PI * Math.pow(raio, 2)) + (Math.PI * raio * geratriz);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("----------DADOS DO CONE----------");
        sb.append("\nÁrea total: "+String.format("%.2f",this.areaTotal()));
        sb.append("\nVolume: "+String.format("%.2f",this.volume()));
        sb.append("\n------------------------------------");
        return sb.toString();
    }
}
