/** 

Tarefa 2. Dado dois valores inteiros, retornar a sua soma. 
A menos que os dois valores sejam os mesmos, então retorne o dobro de sua soma.

sumDouble(1, 2) → 3
sumDouble(3, 2) → 5
sumDouble(2, 2) → 8

public int sumDouble(int a, int b) {
  
}

**/
package Pratica5;

public class Pratica5Tarefa02 {
    public static void main(String[] args) {
        double resultado1 = sumDouble(1,2);
        double resultado2 = sumDouble(3,2);
        double resultado3 = sumDouble(2,2);
        
        System.out.println(resultado1);
        System.out.println(resultado2);
        System.out.println(resultado3);
    }

    private static double sumDouble(int num1, int num2) {
        double resultado;
        if(num1==num2){
            return resultado = (num1 + num2)*2;
        } else{
            return resultado = num1 + num2;
        }
        
        
    }
}
