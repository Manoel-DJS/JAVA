/* Nome do Aluno: Manoel Vinicius Silva Souza
* RA: 722315125
* Nome do Programa: Questão 2 - Ordem Crescente
* Data: 16 / 04 / 2023
*/

package Pratica2;
import java.util.Scanner;

public class Quest02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

            // Entrada de Dados
        System.out.println("Digite um número(A): ");
        int a = ler.nextInt();

        System.out.println("Digite um número(B): ");
        int b = ler.nextInt();

        System.out.println("Digite um número(C): ");
        int c = ler.nextInt();

        ler.close();
            // Soluçando 
            if (a <= b && a <= c) {
                System.out.println(a);
                if (b <= c) {
                    System.out.println(b);
                    System.out.println(c);
                } else {
                    System.out.println(c);
                    System.out.println(b);
                }
            } else if (b <= a && b <= c) {
                System.out.println(b);
                if (a <= c) {
                    System.out.println(a);
                    System.out.println(c);
                } else {
                    System.out.println(c);
                    System.out.println(a);
                }
            } else {
                System.out.println(c);
                if (a <= b) {
                    System.out.println(a);
                    System.out.println(b);
                } else {
                    System.out.println(b);
                    System.out.println(a);
                }
            }

    }
}
