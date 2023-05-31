/* Nome do Aluno: Manoel Vinicius Silva Souza
* RA: 722315125
* Nome do Programa: Questão 2 
*/
package Pratica1;
import java.util.Scanner;

public class Quest02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        System.out.printf("O número digitado foi %d", numero);
        scanner.close();
    }
}
