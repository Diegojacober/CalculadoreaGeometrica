package entities;

import java.util.Scanner;

public class Retangulo {
    private Scanner sc = new Scanner(System.in);
    private Double base;
    private Double altura;
    public Double area(){
        return (this.base * this.altura);
    }

    public Double perimetro() {
        return (this.base * 2) + (this.altura * 2);
    }

    public String printDados() {
        return "O perimetro do retângulo é: "+String.format("%.2f",this.perimetro())+
                "\nA área do retângulo é: "+String.format("%.2f",this.area())+"\n";
    }

    public void getDados() {
        Double altura = 0.0;
        Double base = 0.0;

        while (true) {
            System.out.print("Digite qual a altura do retângulo: ");
            String alt = this.sc.next();

            try {
                altura = Double.parseDouble(alt);
            } catch (Exception e) {
                System.out.println("Digite apenas numeros");
                continue;
            }

            if (altura <= 0) {
                System.out.println("A altura deve ser maior que 0");
                continue;
            }
            this.altura = altura;
            break;
        }

        while (true) {
            System.out.print("Digite o tamanho da base do retângulo: ");
            String bas = this.sc.next();

            try{
                base = Double.parseDouble(bas);
            } catch (Exception e) {
                System.out.println("Digite apenas numeros");
                continue;
            }

            if (base <= 0) {
                System.out.println("A altura deve ser maior que 0");
                continue;
            }


            this.base = base;
            break;
        }

    }
}
