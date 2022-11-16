import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main.idadeMaiores();
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

    /**
     * Ex3.
     * Faça um algoritmo que permita ao utilizador informar a idade de quantas pessoas ele
     * desejar até o utilizador insira 0.
     * Após isso o algoritmo deve informar a contagem das pessoas maiores de idade e a
     * média de idade das pessoas maiores de idade.
     */

    public static void idadeMaiores(){
        Scanner s = new Scanner(System.in);

        int contador_maiores = 0;
        int somatorio_idades_maiores = 0;

        for(;;){

            System.out.println("Escreva um idade:");
            int idade = s.nextInt();

            //Para o ciclo for infinito
            if(idade <= 0){
                break;
            }

            if( idade >= 18){
                contador_maiores++;
                somatorio_idades_maiores += idade;
            }

        }
        System.out.println("A média dos maiores é: " + (somatorio_idades_maiores/contador_maiores));
    }
}