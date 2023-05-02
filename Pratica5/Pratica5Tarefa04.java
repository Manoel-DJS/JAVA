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
        System.out.println(close10(8, 12));

    }

    public static int close10(int a, int b) {
        int num1 = a - 10;
        int num2 = b - 10;
        num1 = -1*(num1);
        num2 = -1*(num2);
        
        if(num1 == num2){
            return 0;
        } else if(num1 > num2){
            return a;
        } else{
            return b;
        } 
        }
}
