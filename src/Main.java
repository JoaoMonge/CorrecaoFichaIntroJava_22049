import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main.tabuadaIntervalo();
    }

    /*
    Ex1.
    * public - Acesso em qualquer parte do programa
    * static - O método pertence à classe e não às instâncias dela
    * void   - Não têm retorno
    * tabuada- Nome do método
    **/
    public static void tabuada(){

        Scanner s = new Scanner(System.in);
        System.out.println("Escreva um número:");
        int num = s.nextInt();


        for(int i = 1; i < 11; i++){
            System.out.println( num + " x " + i + " = " + (i*num));
        }

    }

    /**
     * Ex. Extra - Feito em aula não esta na ficha.
     * Imprimir as tabuadas todas do 1 ao 10
     */
    public static void tabuadaExtra() {
        for(int j = 1; j < 11; j++) {
            for(int i = 1; i < 11; i++) {
                System.out.println(j + " x " + i + " = " + (i * j));
            }
        }
    }

    /**
     * Ex2
     */
    public static void tabuadaIntervalo(){

        Scanner s = new Scanner(System.in);
        System.out.println("Escreva um número:");
        int num = s.nextInt();

        System.out.println("Escreva o minimo do intervalo:");
        int minimo = s.nextInt();
        System.out.println("Escreva o máximo do intervalo:");
        int maximo = s.nextInt();


        for(int i = minimo; i <= maximo; i++){
            System.out.println( num + " x " + i + " = " + (i*num));
        }

    }
}