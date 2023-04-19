package Pratica3;

import java.util.Scanner;

public class Quest06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double volumeini = scanner.nextDouble();
        double volumefinal = 1000;
        int segundos = 0;
        while(volumeini < volumefinal){
            volumeini = volumeini * 2;
            segundos += 1;
        }
        System.out.print(segundos);
        
    }
}
