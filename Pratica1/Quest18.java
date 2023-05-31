/* Nome do Aluno: Manoel Vinicius Silva Souza
* RA: 722315125
* Nome do Programa: Questão 18 
*/
/**
Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de um link de Internet (em Mbps), 
calcule e informe o tempo aproximado de download do arquivo usando este link (em minutos).

**/
package Pratica1;
import java.util.Scanner;
public class Quest18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.println("Digite o tamanho do Arquivo(em MB): ");
        double tamanhoArquivo = scanner.nextDouble();

        System.out.println("Digite a velocidade do Link de Internet(em Mbps): ");
        double velocidadeInternet = scanner.nextDouble();

        scanner.close();

        double tempoAproximado = (tamanhoArquivo / velocidadeInternet) / 60;

        System.out.printf("Tempo Médio para concluir o download: %.1f minutos", tempoAproximado);
    }
}
