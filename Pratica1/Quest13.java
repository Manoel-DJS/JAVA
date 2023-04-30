/** 

Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:
Para homens: (72.7*h) - 58
Para mulheres: (62.1*h) - 44.7

**/

package Pratica1;

import java.util.Scanner;
public class Quest13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("*Peso ideal Homem ou Mulher* \n");
        
        // Entrada
        System.out.println("Você é homem ou mulher: ");
        String pessoa = scanner.nextLine();
        System.out.println("Digite sua altura: ");
        double h = scanner.nextDouble();

        scanner.close();

        // Processamento no método
        double pesoIdeal = calcularPeso(pessoa,h);

        // Saída
        System.out.printf("\n" + "Peso Ideal para %s é %.2f", pessoa, pesoIdeal);
    }

    private static double calcularPeso(String pessoa, double h) {
        double pesoIdeal = 0;

        if(pessoa.equalsIgnoreCase("HOMEM")){
            pesoIdeal = ((72.7*h) - 58);
        } else if(pessoa.equalsIgnoreCase("MULHER")){
            pesoIdeal = ((62.1*h) - 44.7);
        } else{
            System.out.println("Pessoa Inválida // Digite Somente HOMEM ou MULHER");
        }
        return pesoIdeal;
    }
}
