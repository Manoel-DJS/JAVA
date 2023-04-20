/* Nome do Aluno: Manoel Vinicius Silva Souza
* RA: 722315125
* Nome do Programa: Questão 1 - Número Maior
* Data: 16 / 04 / 2023
*/

package Pratica2;
import java.util.Scanner;

public class Quest01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        // Entrada de Dados
        System.out.println("Digite um número(A): ");
        int numA = ler.nextInt();

        System.out.println("Digite um número(B): ");
        int numB = ler.nextInt();
        
        // Soluçando
        if(numA > numB){
            System.out.println("Valor A: " + numA);
        } else if(numB > numA){
            System.out.println("Valor B: " + numB);
        }
    }
}
