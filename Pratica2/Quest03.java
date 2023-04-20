/* Nome do Aluno: Manoel Vinicius Silva Souza
* RA: 722315125
* Nome do Programa: Questão 3 - Par ou Ímpar
* Data: 16 / 04 / 2023
*/

package Pratica2;
import java.util.Scanner;

public class Quest03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        // Entrada de dados
        System.out.println("Digite um número: ");
        int numero = ler.nextInt();

        // Condição
        if(numero % 2 == 0){
            System.out.println("Número é par.");
        } else{
            System.out.println("É ímpar");
        }

        ler.close();
    }
}
