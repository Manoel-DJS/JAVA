/** 

Faça um programa que solicite ao usuário que digite um número
até que ele digite um número menor que 0 (utilize while)


**/

package Pratica3;

import java.util.Scanner;

public class Quest04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 1;

        while(numero >= 0){
            System.out.println("Digite um número: ");
            numero = scanner.nextInt();
        }

        scanner.close();
    }
}
