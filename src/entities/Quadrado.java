package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quadrado extends OperacoesPlanas{

    private Scanner sc = new Scanner(System.in);
    private List<Double> lados = new ArrayList<>();

    public List<Double> getLados() {
        return lados;
    }

    public void addLado(Double lado) {
        if (this.lados.size() < 4) {
            this.lados.add(lado);
        }
    }

    public Double area(){
        Double area = this.lados.get(0) * this.lados.get(0);
        return area;
    }


    public Double perimetro() {
        Double perimetro = 0.0;

        for(Double lado:this.lados) {
            perimetro += lado;
        }

        return perimetro;
    }

    public void getLado() {

        while (true) {
            System.out.println("Digite qual vai ser o valor para os lados do quadrado");
            String lado = sc.next();
            Double ladoQuadrado;

            try {
                ladoQuadrado = Double.parseDouble(lado);
            } catch (Exception e) {
                System.out.println("Digite apenas numeros");
                continue;
            }

            if(ladoQuadrado <= 0) {
                System.out.println("O lado do quadrado deve ser maior que 0");
                continue;
            }

            for (int i = 0; i < 4; i++) {
                this.addLado(ladoQuadrado);
            }

            break;
        }
    }


}
