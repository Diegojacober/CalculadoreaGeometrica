package entities;

public class Esfera extends OperacoesEspaciais{
    private Double raio;

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    @Override
    Double volume() {
        return 4 * Math.PI * Math.pow(raio, 2);
    }

    @Override
    Double areaTotal() {
        return 4.0/3.0 * Math.PI * Math.pow(raio, 3);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("----------DADOS DA ESFERA----------");
        sb.append("\nÁrea total: "+String.format("%.2f",this.areaTotal()));
        sb.append("\nVolume: "+String.format("%.2f",this.volume()));
        sb.append("\n------------------------------------");
        return sb.toString();
    }
}
