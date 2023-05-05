/** 

Tarefa 4. Dados dois números inteiros quaisquer, 
retorne o número mais próximo a 10
close10(8, 13) → 8
close10(13, 8) → 8
close10(13, 7) → 0

public int close10(int a, int b) {
  
}

**/

package Pratica5;

public class Pratica5Tarefa04 {
    public static void main(String[] args) {
        System.out.println(close10(8, 13));
        System.out.println(close10(13, 8));
        System.out.println(close10(13, 7));
    }

    public static int close10(int a, int b) {
        int distanciaA = a - 10;
        int distanciaB = b - 10;

        if(a < 10){
            distanciaA = -1*(distanciaA);
        }
        if(b < 10){
            distanciaB = -1*(distanciaB);
        }

        if(distanciaA > distanciaB){
            return b;
        } else if (distanciaB > distanciaA){
            return a;
        } else{
            return 0;
        }

        }
}



