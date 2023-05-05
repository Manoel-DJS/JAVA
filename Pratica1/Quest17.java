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
        
        // Entrada de dados
        System.out.println("Digite o tamanho da área que será pintada: ");
        double areaPintada = scanner.nextDouble();

        scanner.close();

        double litros = areaPintada / 6;

        double lata = 0;
        for (int c = 0; c < litros; c +=18){
            lata += 1;
        }
        double preçoLatas = lata * 80;

        double galoes = litros / 3.6;
        if(galoes % 3.6 != 0){
            galoes += 1;
        }


        double preçoGaloes = galoes*25; //

        double misturaLata =  litros/18; //

        double litrosRestantes = (litros - lata*18);
        if(litrosRestantes < 0){
            litrosRestantes += 18;
        }

        galoes = litrosRestantes / 3.6;

        

        double preçoTotal = galoes * 25 + lata * 80;

        System.out.println("Litros: " + litros);
        System.out.println("Lata: " + lata);
        System.out.println("Galoes: " + galoes);
        System.out.println(litrosRestantes);
        System.out.printf("Preço total: R$%.2f", preçoTotal);

        }

}
