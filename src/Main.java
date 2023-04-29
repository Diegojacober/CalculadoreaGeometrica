import entities.Quadrado;

import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Olá seja bem vindo a calculadora geométrica!!");

        while (true) {
            String opcaoPlanaEspacial = getOption();

            if (opcaoPlanaEspacial.equals("PLANA")) {
                int opcaoFormaPlana = getFormaPlana();

                switch (opcaoFormaPlana){
                    case 1:
                        Quadrado quadrado = new Quadrado();
                        quadrado.getLado();
                        Double areaQuadrado = quadrado.area();
                        Double perimetroQuadrado = quadrado.perimetro();
                        System.out.println("O perimetro do quadrado é: "+String.format(" %.2f",perimetroQuadrado)
                                +" e a área é: "+String.format("%.2f",areaQuadrado));
                        break;

                        
                }
            } else if (opcaoPlanaEspacial.equals("ESPACIAL")) {
                int opcaoFormaEspacial = getFormaEspacial();

                System.out.println(opcaoFormaEspacial);
            }
        }

    }

    public static String getOption() {
        /*
        * Função que retorna uma string com os valores PLANA ou ESPACIAL
        */
        System.out.println("Você deseja calcular os dados uma forma plana ou espacial?");

        while (true) {
            String opc = sc.nextLine().toUpperCase();
            if (opc.equals("PLANA") || opc.equals("ESPACIAL")) {
                return opc;
            } else {
                System.out.println("Digite apenas 'plana' ou 'espacial'");
            }
        }
    }

    public static int getFormaPlana() {
        while (true) {
            int opcao = 0;

            System.out.print("Qual forma plana você deseja calcular a area e perimetro? " +
                    "\nOpções:" +
                    "\n\t [1] Quadrado" +
                    "\n\t [2] Retângulo" +
                    "\n\t [3] Triângulo" +
                    "\n\t [4] Trapezio" +
                    "\n\t [5] Circulo" +
                    "\n\t [6] Pentagono" +
                    "\n\t [7] Parelelograma\n\nSua opção: ");
            String opc = sc.nextLine();
            try {
                opcao = Integer.parseInt(opc);
            } catch (Exception e) {
                System.out.println("Digite apenas números");
                continue;
            }
            if (opcao > 7 || opcao <= 0) {
                System.out.println("Digite apenas valores entre 1 e 7");
            } else {
                return opcao;
            }
        }

    }

    public static int getFormaEspacial() {
        while (true) {
            int opcao = 0;

            System.out.print("Qual forma espacial você deseja calcular o volume e area total? " +
                    "\nOpções:" +
                    "\n\t [1] Cone" +
                    "\n\t [2] Esfera" +
                    "\n\t [3] Pirâmide" +
                    "\n\t [4] Cubo" +
                    "\n\t [5] Paralelepípedo" +
                    "\n\t [6] Prismas" +
                    "\n\t [7] Cilindro\n\nSua opção: ");
            String opc = sc.nextLine();
            try {
                opcao = Integer.parseInt(opc);
            } catch (Exception e) {
                System.out.println("Digite apenas números");
                continue;
            }
            if (opcao > 7 || opcao <= 0) {
                System.out.println("Digite apenas valores entre 1 e 7");
            } else {
                return opcao;
            }
        }

    }


}