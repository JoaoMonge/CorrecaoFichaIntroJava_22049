import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Main.tabuadaExtra();
    }

    /*
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

    public static void tabuadaExtra() {
        for(int j = 1; j < 11; j++) {
            for(int i = 1; i < 11; i++) {
                System.out.println(j + " x " + i + " = " + (i * j));
            }
        }
    }

}