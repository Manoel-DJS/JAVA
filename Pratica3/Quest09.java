package Pratica3;

public class Quest09 {
    public static void main(String[] args) {
        int matriz[][] = new int[10][10];

        for(int l = 0;  l < 10 ; l++){
            for(int c = 0; c < 10 ; c++){
                matriz[l][c]=0;
            }
        }

        for(int l = 0;  l < 10 ; l++){
            System.out.println("Espaço");
            for(int c = 0; c < 10 ; c++){
                System.out.println(" A posição da Linha: " + l + " A posição da coluna: "+ c + " Matriz: " + matriz[l][c]); 
            }
        }
    
    }
}
