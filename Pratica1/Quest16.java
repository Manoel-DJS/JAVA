/** 

Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. 
Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00. 
Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total.

**/
package Pratica1;
import java.util.Scanner;

public class Quest16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o Tamanho da área a ser pintada? Digite em metros(^2)");
        double metrosQuadrados = scanner.nextDouble();

        scanner.close();
        double litros = metrosQuadrados / 3;
        System.out.println("Litros de tinta: " + litros);

        System.out.println("Litros: " + litros);

        double lata = 0;
        for (int c = 0; c < litros; c +=18){
            lata += 1;
        }
        double preçoTotal = lata * 80;

        
        System.out.printf("Para pintar uma área de %.1f metros quadrados, é necessário comprar %.1f latas de tinta \n", metrosQuadrados, lata);
        System.out.printf("Preço das latas: R$%.2f \n",preçoTotal);

    }
}
