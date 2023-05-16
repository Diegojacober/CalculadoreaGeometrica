package entities;

public class Paralelepipedo extends OperacoesEspaciais{
    private Double arestaA;
    private Double arestaB;
    private Double arestaC;

    public Double getArestaA() {
        return arestaA;
    }

    public void setArestaA(Double arestaA) {
        this.arestaA = arestaA;
    }

    public Double getArestaB() {
        return arestaB;
    }

    public void setArestaB(Double arestaB) {
        this.arestaB = arestaB;
    }

    public Double getArestaC() {
        return arestaC;
    }

    public void setArestaC(Double arestaC) {
        this.arestaC = arestaC;
    }

    @Override
    Double volume() {
        return arestaA*arestaB*arestaC;
    }

    @Override
    Double areaTotal() {
        return 2*(arestaA*arestaB + arestaA*arestaC + arestaB*arestaC);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("----------DADOS DO PARALELEPÍPEDO----------");
        sb.append("\nÁrea total: "+String.format("%.2f",this.areaTotal()));
        sb.append("\nVolume: "+String.format("%.2f",this.volume()));
        sb.append("\n------------------------------------");
        return sb.toString();
    }
}
