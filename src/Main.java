import entities.*;

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
                    case 2:
                        Retangulo retangulo = new Retangulo();
                        retangulo.getDados();
                        System.out.println(retangulo.printDados());
                        break;
                    case 3:
                        Triangulo triangulo = new Triangulo();
                        Double baseTriangulo = getDouble("Digite a base do triângulo: ");
                        Double alturaTriangulo = getDouble("Digite a altura do triângulo: ");
                        Double ladoTriangulo = getDouble("Digite o tamanho dos lados do triângulo: ");
                        triangulo.setBase(baseTriangulo);
                        triangulo.setAltura(alturaTriangulo);
                        triangulo.setLado(ladoTriangulo);
                        System.out.println(triangulo.toString());
                        break;
                    case 4:
                        Trapezio trapezio = new Trapezio();
                        Double baseMaior = getDouble("Digite o tamanho da base maior: ");
                        Double baseMenor = getDouble("Digite o tamanho da base menor: ");
                        Double ladoTrapezio = getDouble("Digite o tamanho dos lados: ");
                        Double alturaTrapezio = getDouble("Digite o tamanho da altura: ");
                        trapezio.setAltura(alturaTrapezio);
                        trapezio.setBaseMaior(baseMaior);
                        trapezio.setLado(ladoTrapezio);
                        trapezio.setBaseMenor(baseMenor);

                        System.out.println(trapezio.toString());
                        break;
                    case 5:
                        Circulo circulo = new Circulo();
                        Double raio = getDouble("Digite o tamanho do raio do circulo: ");
                        circulo.setRaio(raio);
                        System.out.println(circulo.toString());
                        break;
                    case 6:
                        Pentagono pentagono = new Pentagono();
                        Double apotema = getDouble("Digite o tamanho do apotema do Pentagono: ");
                        Double ladoPentagono = getDouble("Digite o tamanho do lado do Pentagano: ");
                        pentagono.setApotema(apotema);
                        pentagono.setLado(ladoPentagono);
                        System.out.println(pentagono.toString());
                        break;

                    case 7:
                        Parelelogramo parelelogramo = new Parelelogramo();
                        Double baseParelelogramo = getDouble("Digite o tamanho da base do Parelelogramo: ");
                        Double alturaParelelogramo = getDouble("Digite o tamanho da altura do Parelelogramo: ");
                        parelelogramo.setAltura(alturaParelelogramo);
                        parelelogramo.setBase(baseParelelogramo);
                        System.out.println(parelelogramo.toString());
                        break;
                }
            } else if (opcaoPlanaEspacial.equals("ESPACIAL")) {
                int opcaoFormaEspacial = getFormaEspacial();

                switch (opcaoFormaEspacial) {

                    case 1:
                        //cone
                        Cone cone = new Cone();
                        Double geratrizCone = getDouble("Digite o tamanho da geratriz do cone: ");
                        Double alturaCone = getDouble("Digite o tamanho da altura do cone: ");
                        Double raioCone = getDouble("Digite o tamanho do raio do cone: ");
                        cone.setGeratriz(geratrizCone);
                        cone.setRaio(raioCone);
                        cone.setAltura(alturaCone);
                        System.out.println(cone.toString());
                        break;
                    case 2:
                        Esfera esfera = new Esfera();
                        Double raioEsfera = getDouble("Digite o tamanho do raio da esfera: ");
                        esfera.setRaio(raioEsfera);
                        System.out.println(esfera.toString());
                        break;
                    case 3:
                        Piramide piramide = new Piramide();
                        Double alturaPiramide = getDouble("Digite a altura da pirâmide: ");
                        Double ladoBasePiramide = getDouble("Digite o tamanho da base lateral da pirâmide: ");
                        piramide.setAltura(alturaPiramide);
                        piramide.setLadoBase(ladoBasePiramide);
                        System.out.println(piramide.toString());
                        break;
                    case 4:
                        Cubo cubo = new Cubo();
                        Double arestaCubo = getDouble("Digite o tamanho da aresta do cubo: ");
                        cubo.setAresta(arestaCubo);
                        System.out.println(cubo.toString());
                        break;
                    case 5:
                        Paralelepipedo paralelepipedo = new Paralelepipedo();
                        Double arestaA = getDouble("Digite o tamanho da aresta A: ");
                        Double arestaB = getDouble("Digite o tamanho da aresta B: ");
                        Double arestaC = getDouble("Digite o tamanho da aresta C: ");
                        paralelepipedo.setArestaA(arestaA);
                        paralelepipedo.setArestaB(arestaB);
                        paralelepipedo.setArestaC(arestaC);
                        System.out.println(paralelepipedo.toString());
                        break;
                    case 6:
                        Cilindro cilindro = new Cilindro();
                        Double raioCilindro = getDouble("Digite o tamanho do raio: ");
                        Double alturaCilindro = getDouble("Digite o tamanho da altura: ");
                        cilindro.setAltura(alturaCilindro);
                        cilindro.setRaio(raioCilindro);
                        System.out.println(cilindro.toString());
                        break;
                }
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
                    "\n\t [7] Parelelogramo\n\nSua opção: ");
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
                    "\n\t [6] Cilindro\n\nSua opção: ");
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

    public static Double getDouble(String msg) {
        while (true) {
            Double valor = 0.0;
            System.out.print(msg);
            String val = sc.next();

            try {
                valor = Double.parseDouble(val);
            } catch (Exception e) {
                System.out.println("Digite apenas números!");
                continue;
            }

            if (valor < 0) {
                System.out.println("O valor deve ser maior que 0");
                continue;
            }

            return valor;
        }
    }


}