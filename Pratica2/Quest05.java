/* Nome do Aluno: Manoel Vinicius Silva Souza
* RA: 722315125
* Nome do Programa: Questão 5 - Nota Conceito
* Data: 16 / 04 / 2023
*/

package Pratica2;
import java.util.Scanner;

public class Quest05 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        // Entrada de Dados
        System.out.println("Digite sua nota conceito: ");
        int nota = ler.nextInt();

        ler.close();

        // Condição
        if(nota >= 0 && nota <= 49){
            System.out.println("Nota conceito: Insuficiente!");
        } else if( nota > 49 && nota <= 64){
            System.out.println("Nota conceito: Regular!");
        } else if( nota > 64 && nota <= 84){
            System.out.println("Nota conceito: BOM!");
        } else if( nota > 84 && nota <= 100){
            System.out.println("Nota conceito: Ótimo!");
        }
    
    }
}
