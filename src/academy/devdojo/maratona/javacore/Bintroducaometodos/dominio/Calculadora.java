package academy.devdojo.maratona.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    public void Soma() {
        System.out.printf("Soma: ");
        System.out.println(10+10);
    }

    public void Subtracao (){
        System.out.printf("Subtração: ");
        System.out.println(10-20);
    }

    public void Multiplicacao(int num, int num2) {
        System.out.printf("Multiplicação: ");
        System.out.println(num*num2);
    }

    public double Divisao(double num, double num2 ) {
        return (num/num2);
    }

    public void alteraDoisNumeros(int num1, int num2) {
num1 = 99;
num2 = 90;
        return;
    }

    public void somaArray(int[] numeros) {
        int soma = 0;
        for (int num: numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int ... numeros) {
        int soma = 0;
        for (int num: numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

}
