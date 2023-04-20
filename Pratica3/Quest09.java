/* Nome do Aluno: Manoel Vinicius Silva Souza
* RA: 722315125
* Nome do Programa: Questão 9
* Data: 30 / 04 / 2023
*/

/** 

Faça um programa que preencha com zeros todas as posições de
uma matriz com 10 linha e 10 colunas

**/

package Pratica3;

public class Quest09 {
    public static void main(String[] args) {
        int matriz[][] = new int[10][10];

        for(int l = 0;  l < 10 ; l++){
            for(int c = 0; c < 10 ; c++){
                matriz[l][c]=0;
            }
        }

        for(int l = 0;  l < 10 ; l++){
            System.out.println("Espaço");
            for(int c = 0; c < 10 ; c++){
                System.out.println(" A posição da Linha: " + l + " A posição da coluna: "+ c + " O valor na Matriz é: " + matriz[l][c]); 
            }
        }
    
    }
}
