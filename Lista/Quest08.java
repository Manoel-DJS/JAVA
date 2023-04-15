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

        System.out.println("____________________________________________________________");
        System.out.println("A vista, digite AVISTA (10% de desconto): ");
        System.out.println("Venda a Prazo 30 dias, digite PRAZO30 (5% de desconto): ");
        System.out.println("Venda a Prazo 60 dias, digite PRAZO60 (Mesmo preço): ");
        System.out.println("Venda a Prazo 90 dias, digite PRAZO90 (5% a mais): ");
        System.out.println("Venda com cartão de débito, digite CARTDEB (8% de desconto): ");
        System.out.println("Venda com cartão de crédito, digite CARTCRE (7% de desconto): ");
        System.out.println("____________________________________________________________");


**/
package Lista;
import java.util.Scanner;

public class Quest08 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float desconto = 0;
        // Entrada de dados
        System.out.println("Valor do produto: ");
        float valor = ler.nextFloat();
  

        System.out.println("Valor do produto: ");
        String valors = ler.nextLine();




    }
}
