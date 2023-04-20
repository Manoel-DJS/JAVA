/* Nome do Aluno: Manoel Vinicius Silva Souza
* RA: 722315125
* Nome do Programa: Questão 7 - Mês e Estação
* Data: 16 / 04 / 2023
*/

/**

Crie um programa que lê um número entre 1 e 12, correspondendo
a um dos meses do ano onde o mês 1 é Janeiro e 12 é dezembro.
Ao final, o programa deve imprimir uma mensagem identificando,
com base no número digitado, o nome do mês e a estação. 

Exemplo para o mês 1: "Mês: Janeiro – Estação: Verão"
 
**/

package Pratica2;
import java.util.Scanner;
public class Quest07 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        // entrada de dados
        System.out.println("Digite um número de 1 a 12: ");
        int numero = ler.nextInt();
        String mes = "";
        switch(numero){
            case 1: 
            mes = "Mês: Janeiro // Estação: Verão";
            break;

            case 2: 
            mes = "Mês: Fevereiro // Estação: Verão";
            break;
            
            case 3: 
            mes = "Mês: Março // Estação: Outono";
            break;
            
            case 4: 
            mes = "Mês: Abril // Estação: Outono";
            break;
            
            case 5: 
            mes = "Mês: Maio // Estação: Outono";
            break;
            
            case 6: 
            mes = "Mês: Junho // Estação: Inverno";
            break;
            
            case 7: 
            mes = "Mês: Julho // Estação: Inverno";
            break;
            
            case 8: 
            mes = "Mês: Agosto // Estação: Inverno";
            break;
            
            case 9: 
            mes = "Mês: Setembro // Estação: Primavera";
            break;
            
            case 10: 
            mes = "Mês: Outubro // Estação: Primavera";
            break;
            
            case 11: 
            mes = "Mês: Novembro // Estação: Primavera";
            break;
            
            case 12: 
            mes = "Mês: Dezembro // Estação: Verão";
            break;
            
            default:
            mes = "Entrada inválida || Número Inválido";
            break;
        }
        System.out.println("O número: " + numero + " Corresponde ao:");
        System.out.println(mes);

    }
}
