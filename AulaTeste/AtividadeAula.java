/** 

Neste exercício, você escreverá métodos que retornam valores para os seguintes cenários:

1.	Converte a temperatura fornecida de Fahrenheit para Celsius.

Fórmula:
C=5/9*(F-32)

**/

package AulaTeste;

import java.util.Scanner;

public class AtividadeAula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de Dados
        System.out.println("Digite um valor (Fahrenheit): ");
        double temperatura = scanner.nextDouble();

        double celsius = calcularTemp(temperatura);

        System.out.println("VAlor convertido: " + celsius);
    }

    private static double calcularTemp(double temp) {
        temp = 5 * ((temp - 32) / 9);;

        return temp;
    }



}
