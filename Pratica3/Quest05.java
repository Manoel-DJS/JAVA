/* Nome do Aluno: Manoel Vinicius Silva Souza
* RA: 722315125
* Nome do Programa: Questão 5
* Data: 30 / 04 / 2023
*/

/**

Faça um programa que determine o fatorial de um número. Para
este problema, tem-se como entrada o valor do número do qual
se deseja calcular o fatorial. O fatorial de 0 é igual a 1. O
fatorial de um número N (N!) é definido conforme a seguir
(utilize for):
i. N! = 1 * 2 * 3 * 4 * ... * (N-1) * N

Para quem não sabe, fatorial é a multiplicação de todos os números de 1 até ao número que se está calculando. Por exemplo: Fatorial de 5 (5!) = 1 * 2 * 3 * 4 * 5 = 120.

**/

package Pratica3;
import java.util.Scanner;


public class Quest05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();
        int fatorial = 1;

        for ( int c = numero ; c > 1 ; c-- ) {
            fatorial = c * fatorial; 
        }

        scanner.close();
        System.out.println("Resultado do Fatorial é: " + fatorial);
        
    }
    
}
