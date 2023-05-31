/* Nome do Aluno: Manoel Vinicius Silva Souza
* RA: 722315125
* Nome do Programa: Questão 12 
*/

/** 
Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58

**/

package Pratica1;
import java.util.Scanner;

public class Quest12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Programa Peso Ideal \n");
        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();
        
        scanner.close();

        double pesoIdeal = ((72.7*altura) - 58);

        System.out.println("O seu peso ideal seria: " + pesoIdeal);
        
    }
}
