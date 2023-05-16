package entities;

public class Piramide extends  OperacoesEspaciais{

    private Double ladoBase;
    private Double altura;

    private double geratriz;
    private double areaBase;
    private double areaLateral;
    public void getData() {
        this.geratriz = Math.pow(((ladoBase*ladoBase) + (altura*altura)),1.0/2.0);
        this.areaBase = ladoBase*ladoBase;
        this.areaLateral = (ladoBase*geratriz) / 3;
    }



    public Double getLadoBase() {
        return ladoBase;
    }

    public void setLadoBase(Double ladoBase) {
        this.ladoBase = ladoBase;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    Double volume() {
        getData();
        return (1.0/3.0)*(areaBase*altura);
    }

    @Override
    Double areaTotal() {
        getData();
        return areaBase+(areaLateral*4);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("----------DADOS DA PIRÂMIDE----------");
        sb.append("\nÁrea total: "+String.format("%.2f",this.areaTotal()));
        sb.append("\nVolume: "+String.format("%.2f",this.volume()));
        sb.append("\n------------------------------------");
        return sb.toString();
    }
}
