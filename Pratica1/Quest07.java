/* Nome do Aluno: Manoel Vinicius Silva Souza
* RA: 722315125
* Nome do Programa: Questão 7 
*/

/**
Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.

**/ 
package Pratica1;

import java.util.Scanner;

public class Quest07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o lado do quadrado: ");
        double ladoQuadrado = scanner.nextDouble();

        scanner.close();
        double areaQuadrado = Math.pow(ladoQuadrado, 2);
        // saida
    
        System.out.println("A área do quadrado é: " + areaQuadrado);
        System.out.println("O dobro da área do quadrado: " + (areaQuadrado*2));
    
    }
}
