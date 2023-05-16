package entities;

public class Cubo extends OperacoesEspaciais{
    private Double aresta;

    public Double getAresta() {
        return aresta;
    }

    public void setAresta(Double aresta) {
        this.aresta = aresta;
    }

    @Override
    Double volume() {
        return Math.pow(aresta, 3);
    }

    @Override
    Double areaTotal() {
        return Math.pow(aresta, 2)*6;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("----------DADOS DO CUBO----------");
        sb.append("\nÁrea total: "+String.format("%.2f",this.areaTotal()));
        sb.append("\nVolume: "+String.format("%.2f",this.volume()));
        sb.append("\n------------------------------------");
        return sb.toString();
    }
}
