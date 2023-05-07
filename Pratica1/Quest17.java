/** 

Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. 
Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00.
Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações:
comprar apenas latas de 18 litros;
comprar apenas galões de 3,6 litros;
misturar latas e galões, de forma que o desperdício de tinta seja menor. Acrescente 10% de folga e sempre arredonde os valores para cima, isto é, considere latas cheias.

**/

package Pratica1;
import java.util.Scanner;

public class Quest17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe o tamanho da área a ser pintada em metros quadrados: ");
        double area = scanner.nextDouble();
     
        scanner.close();

        double latas = (area/6) / 18;
        if((area/6) % 18 != 0){
            latas +=1 ;
        }

        double galoes = (area/6) / 3.6;
        if((area/6) % 3.6 != 0){
            galoes += 1;
        }

        double latasMisturadas = area / (18 * 6); // quantidade máxima de latas necessárias
        double galoesMisturados = 0;
        double areaRestante = area % (18 * 6);
        if (areaRestante != 0) {    // se há área restante, adicionar um galão para cobri-la
            galoesMisturados = areaRestante / (3.6 * 6);
            if (areaRestante % (3.6 * 6) != 0) {
            galoesMisturados++;     // acrescenta 1 galão para cobrir a área restante
            }
        }

        // acrescentar 10% de folga em todas as opções
        latas = (int) Math.ceil(latas * 1.1);
        galoes = (int) Math.ceil(galoes * 1.1);
        latasMisturadas = (int) Math.ceil(latasMisturadas * 1.1);
        galoesMisturados = (int) Math.ceil(galoesMisturados * 1.1);

            // calcular o preço total em cada opção
        double precoLatas = latas * 80.0;
        double precoGaloes = galoes * 25.0;
        double precoMisturado = (latasMisturadas * 80.0) + (galoesMisturados * 25.0);

        System.out.println("Quantidade de latas de tinta necessárias: " + latas);
        System.out.println("Preço total das latas de tinta: R$ " + precoLatas);
        System.out.println("Quantidade de galões de tinta necessários: " + galoes);
        System.out.println("Preço total dos galões de tinta: R$ " + precoGaloes);
        System.out.println("Quantidade de latas e galões de tinta necessárias para minimizar o desperdício: " + (int)latas + " latas e " + (int)galoes + " galões");
        System.out.println("Preço total da combinação de latas e galões de tinta: R$ " + precoMisturado);
        
    }

}
