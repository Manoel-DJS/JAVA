/* Nome do Aluno: Manoel Vinicius Silva Souza
* RA: 722315125
* Nome do Programa: Questão 8
* Data: 30 / 04 / 2023
*/

/** 

Faça um programa que preencha com zeros todas as posições de
um vetor de tamanho 50 

**/

package Pratica3;

public class Quest08 {
    public static void main(String[] args) {
        int vetor[] = new int[50]; // tamanho do vetor

        for(int c = 0; c <= 50 -1; c++){
            vetor[c] = 0;
        }

        for(int c = 0; c <= 50 -1; c++){
            System.out.println("Vetor= na posição: " + c + " o valor é: " + vetor[c]);
        }

    }
}
