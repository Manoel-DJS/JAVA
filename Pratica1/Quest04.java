/* Nome do Aluno: Manoel Vinicius Silva Souza
* RA: 722315125
* Nome do Programa: Questão 4 
*/

/**
Faça um Programa que peça as 4 notas bimestrais e mostre a média.
**/
package Pratica1;

import java.util.Scanner;

public class Quest04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a nota 1: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a nota 1: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a nota 1: ");
        double nota3 = scanner.nextDouble();
        
        System.out.println("Digite a nota 1: ");
        double nota4 = scanner.nextDouble();
        
        scanner.close();

        double resultado = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A média das 4 notas é: " + resultado);
    }

}
