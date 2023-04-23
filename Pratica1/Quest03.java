/** 

Faça um Programa que peça dois números e imprima a soma.

**/

package Pratica1;
import java.util.Scanner;

public class Quest03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Entrada de Dados
        int numeroA = 0;
        int numeroB = 0;
        double soma = 0;

        System.out.println("Digite um número(A): ");
        numeroA = scanner.nextInt();

        System.out.println("Digite outro número(B): ");
        numeroB = scanner.nextInt();

        // Proce
        soma = numeroA + numeroB;


        // saida
        System.out.println("A soma é: " + soma);

        scanner.close();
        

    }

}
