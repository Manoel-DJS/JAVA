/* Nome do Aluno: Manoel Vinicius Silva Souza
* RA: 722315125
* Nome do Programa: Questão 7
* Data: 30 / 04 / 2023
*/

/** 

Escreva um programa que, dada a carga máxima de um elevador e
a quantidade máxima de pessoas digitadas pelo usuário, leia o
peso de cada pessoa, também digitada pelo usuário, que entra
no elevador até que a carga máxima seja atingida ou o número
máximo de pessoas seja atingido (utilize do / while).

**/

package Pratica3;
import java.util.Scanner;

public class Quest07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cargaMaxima, quantidadeMaxima, pessoas = 0; 
        double cargaAtual, peso = 0;

        System.out.println("Programa Elevador");
        System.out.println("Digite a carga máxima que o Elevador pode carregar: ");
        cargaMaxima = scanner.nextInt();

        System.out.println("Digite a quantidade máxima de pessoas que o elevador pode carregar: ");
        quantidadeMaxima = scanner.nextInt();

        do{
            System.out.println("Digite o peso da pessoa: ");
            cargaAtual = scanner.nextDouble();
            peso += cargaAtual;
            pessoas += 1;
        } while(peso <= cargaMaxima && pessoas <= quantidadeMaxima -1);

        scanner.close();
        System.out.println("Quantidade de pessoas que entraram no elevador: " + pessoas);
        System.out.println("Peso que o elevado está levando: " + peso);
    }
}
