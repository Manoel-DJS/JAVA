// Faça um programa que some os números de 1 a 100 e imprima somente o valor total da soma



package Pratica3;

public class Quest03 {
    public static void main(String[] args) {
        int soma = 0;
        for(int c = 1 ; c <= 100 ; c++){
            soma += c;
        }
        System.out.println("Valor dos números somados: " + soma);
    }
}
