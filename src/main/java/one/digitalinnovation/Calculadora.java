package one.digitalinnovation;

public final class Calculadora {

    public int soma(int a, int b){ return a+b;}

    public int subtracao(int a, int b){
        if(a<b){return b-a;}
        else{return a-b;}
    }

    public long multiplicacao(int a, int b){return a*b;}

    public double divisao(double a, double b) {
        if (a < b) {
            return b / a;
        } else {
            return a / b;
        }
    }
}
