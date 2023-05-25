/** 

Tarefa 2. Dado dois valores inteiros, retornar a sua soma. 
A menos que os dois valores sejam os mesmos, então retorne o dobro de sua soma.

sumDouble(1, 2) → 3
sumDouble(3, 2) → 5
sumDouble(2, 2) → 8

public int sumDouble(int a, int b) {
  
}

**/
package AulaTeste;

public class Pratica5Tarefa02 {
    public static void main(String[] args) {
        double resultado = sumDouble(7,5);
        System.out.println(resultado);
    }

    private static double sumDouble(int num1, int num2) {
        if(num1==num2){
            return (num1 + num2)*2;
        } else{
            return num1 + num2;
        }
        
    }
}
