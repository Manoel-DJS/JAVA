/** 

Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
    o produto do dobro do primeiro com metade do segundo .
    a soma do triplo do primeiro com o terceiro.
    o terceiro elevado ao cubo.

**/

package Pratica1;

import java.util.Scanner;
public class Quest11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de Dados
        System.out.println("Digite um número inteiro(1): ");
        int num1 = scanner.nextInt();

        System.out.println("Digite um número inteiro(2): ");
        int num2 = scanner.nextInt();

        System.out.println("Digite um número real: " );
        double numReal = scanner.nextDouble();

        scanner.close();

        int letraA = (num1*2) + (num2/2);
        int letraB = (num1*3) + num2;
        double letraC = Math.pow(numReal, 3);

        // Saida
        System.out.println("Resposta: ");
        System.out.println("O produto do dobro do primeiro com metade do segundo: " + letraA);
        System.out.println("A soma do triplo do primeiro com o terceiro: " + letraB);
        System.out.println("O terceiro elevado ao cubo: " + letraC);

    }
}
