/** 

João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho. 
Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos) 
deve pagar uma multa de R$ 4,00 por quilo excedente. João precisa que você faça um programa que leia a variável peso (peso de peixes) e calcule o excesso. 
Gravar na variável excesso a quantidade de quilos além do limite e na variável multa o valor da multa que João deverá pagar. Imprima os dados do programa com as mensagens adequadas.

**/

package Pratica1;
import java.util.Scanner;

public class Quest14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Programa Calcular Peso Excedente \n");

        System.out.println("Digite o peso dos peixes: ");
        double peso = scanner.nextDouble();
        double excesso = 0;
        double multa = 0;

        scanner.close();

        if(peso <= 50){
            System.out.println(peso +"Kg" + " // peso está nos padrões do estado.");
        } else{
            excesso = peso - 50;
            multa = excesso * 4;
            System.out.printf("Peso dos peixes: %.2f kg \n", peso);
            System.out.printf("Excesso de peso: %.2f kg \n", excesso);
            System.out.printf("O senhor deve pagar: %.2f reais \n", multa);
        }
    }
}
