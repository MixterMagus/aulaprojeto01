package one.digitalinnovation;

import java.util.Scanner;
import java.io.IOException;

public class MenuCalculadora {

    public void getMenu()throws IOException, InterruptedException{
        Scanner ler = new Scanner(System.in);
        Calculadora calc1 = new Calculadora();
        int op;
        System.out.println("Vamos calcular !");
        System.out.println("Selecione uma Opção: ");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("5 - Sair");
        op = ler.nextInt();


        switch (op){
            case 1:
                int a,b;
                System.out.println("Dê o valor de A: ");
                a=ler.nextInt();
                System.out.println("Dê o valor de B: ");
                b=ler.nextInt();
                System.out.println("Resultado: "+calc1.soma(a,b));
                    break;
            case 2:
                int c,d;
                System.out.println("O maior valor será subtraído pelo menor!");
                System.out.println("Dê o valor de A: ");
                c=ler.nextInt();
                System.out.println("Dê o valor de B: ");
                d=ler.nextInt();
                System.out.println("Resultado: "+calc1.subtracao(c,d));
                    break;
            case 3:
                int e,f;
                System.out.println("Dê o valor de A: ");
                e=ler.nextInt();
                System.out.println("Dê o valor de B: ");
                f=ler.nextInt();
                System.out.println("Resultado: "+calc1.multiplicacao(e,f));
                    break;
            case 4:
                int g,h;
                System.out.println("O maior valor será dividido pelo menor!");
                System.out.println("Dê o valor de A: ");
                g=ler.nextInt();
                System.out.println("Dê o valor de B: ");
                h=ler.nextInt();
                System.out.println("Resultado: "+calc1.divisao(g,h));
                    break;
            case 5:
                System.out.println("Exit");
                System.exit(0);
                    break;
            default:
                if (System.getProperty("os.name").contains("Windows"))
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                else
                    Runtime.getRuntime().exec("clear");
                System.out.println("Selecione uma opção válida! ");
                getMenu();

        }



    }
}
