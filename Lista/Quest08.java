/* Nome do Aluno: Manoel Vinicius Silva Souza
* RA: 722315125
* Nome do Programa: Questão 8 - Condição Venda 
* Data: 16 / 04 / 2023
*/

/** 

8) Faça um programa que receba o valor da venda, escolha a
condição de pagamento no menu e mostre o total da venda final
conforme condições a seguir:
Venda a Vista - desconto de 10%
Venda a Prazo 30 dias - desconto de 5%
Venda a Prazo 60 dias - mesmo preço
Venda a Prazo 90 dias - acréscimo de 5%
Venda com cartão de débito - desconto de 8%
Venda com cartão de crédito - desconto de 7%

**/
package Lista;
import java.util.Scanner;

public class Quest08 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        // Entrada de dados
        System.out.println("Valor do produto: ");
        float valor = ler.nextFloat();
  
        System.out.println("____________________________________________________________");
        System.out.println("A vista, digite (1) (10% de desconto): ");
        System.out.println("Venda a Prazo 30 dias, digite (2) (5% de desconto): ");
        System.out.println("Venda a Prazo 60 dias, digite (3) (Mesmo preço): ");
        System.out.println("Venda a Prazo 90 dias, digite (4) (5% a mais): ");
        System.out.println("Venda com cartão de débito, digite (5) (8% de desconto): ");
        System.out.println("Venda com cartão de crédito, digite (6) (7% de desconto): ");
        System.out.println("____________________________________________________________");

        System.out.println("Escolha a forma de pagamento conforme a tabela acima: ");
        int forma = ler.nextInt();

        double valortotal = 0;

        switch(forma){
            case 1:
            valortotal = valor * 0.9;
            System.out.println("Valor da Venda: " + valortotal);
            break;
            
            case 2:
            valortotal = valor * 0.95;
            System.out.println("Valor da Venda: " + valortotal);
            break;
            
            case 3:
            valortotal = valor;
            System.out.println("Valor da Venda: " + valortotal);
            break;
            
            case 4:
            valortotal = valor * 1.05;
            System.out.println("Valor da Venda: " + valortotal);
            break;

            case 5:
            valortotal = valor * 0.92;
            System.out.println("Valor da Venda: " + valortotal);
            break;

            case 6:
            valortotal = valor * 0.93;
            System.out.println("Valor da Venda: " + valortotal);
            break;
            
            default:
            System.out.println("Forma de pagamento inválida // Digite um número de 1 a 6");
            break;
        }
    }
}
