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

        double litrosTinta = area / 6.0;

        double latasCombinadas = (litrosTinta / 18.0);

        double litrosRestantes = litrosTinta - latasCombinadas * 18.0;
        if(litrosRestantes < 0){
            litrosRestantes += 18;
        }
        double galoesCombinados = (litrosRestantes / 3.6);
        double precoCombinado = latasCombinadas * 80.0 + galoesCombinados * 25.0;
        
        
        System.out.println("Quantidade de latas e galões de tinta necessárias para minimizar o desperdício: " + (int)latasCombinadas + " latas e " + (int)galoesCombinados + " galões");
        System.out.println("Preço total da combinação de latas e galões de tinta: R$ " + precoCombinado);
        
        
/** 

        double litrosRestantes = (litros - lata*18);
        if(litrosRestantes < 0){
            litrosRestantes += 18;
        }

**/

    }

}
