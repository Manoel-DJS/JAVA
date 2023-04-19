package Pratica3;
// corrigir
public class Quest08 {
    public static void main(String[] args) {
        int vetor[] = new int[50]; // tamanho do vetor

        for(int c = 0; c <= 50 -1; c++){
            vetor[c] = 0;
        }

        for(int c = 0; c <= 50 -1; c++){
            System.out.println("posição: " + c + " valor " + vetor[c]);
        }

    }
}
