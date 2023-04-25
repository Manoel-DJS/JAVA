/** 

Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.

A = pi(3,14)R^2
**/

package Pratica1;
import java.util.Scanner;

public class Quest06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();

        scanner.close();
        double area = (3.14) * (Math.pow(raio, 2));
        System.out.println("A área do círculo é: " + area);
    }
}
