/* Nome do Aluno: Manoel Vinicius Silva Souza
* RA: 722315125
* Nome do Programa: Questão 6 - Hospedagem de Hotel
* Data: 16 / 04 / 2023
*/

/** 

Faça um programa calcula o total de uma hospedagem em um hotel. Ele cobra R$ 60.00 a diária e mais uma taxa de serviço:
R$ 5.50 por diária, se o número de diárias for maior que 15;
R$ 6.00 por diária, se o número de diárias for igual a 15;
R$ 8.00 por diária, se o número de diárias for menor que 15.

**/

package Pratica2;
import java.util.Scanner;
public class Quest06 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int diaria = 60; // valor fixo
        float taxa = 0;

        // entrada de dados
        System.out.println("Digite quantos dias você ficará em nosso hotel: ");
        int dias = ler.nextInt();

        ler.close();

        // condições
        if(dias > 15){
            taxa = (float) 5.50;
            System.out.println("taxa de R$5.50");
            System.out.println("Valor da Hospedagem: R$" + ((diaria * dias) + (taxa * dias)) );
        } else if(dias == 15){
            taxa = (float) 6;
            System.out.println("taxa de R$6.00");
            System.out.println("Valor da Hospedagem: R$" + ((diaria * dias) + (taxa * dias)) );
        } else{
            taxa = (float) 8;
            System.out.println("taxa de R$8.00");
            System.out.println("Valor da Hospedagem: R$" + ((diaria * dias) + (taxa * dias)) );
        }




    }
}
