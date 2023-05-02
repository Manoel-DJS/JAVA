/**

Tarefa 3. Dados três números inteiros retorne o maior número entre eles

intMax(1, 2, 3) → 3
intMax(1, 3, 2) → 3
intMax(3, 2, 1) → 3

public int intMax(int a, int b, int c) {
  
}

**/
 
package Pratica5;


public class Pratica5Tarefa03 {
    public static void main(String[] args) {
        int resultado1 = intMax(1, 2, 3);
        int resultado2 = intMax(1, 3, 2);
        int resultado3 = intMax(3, 2, 1);

        System.out.println(resultado1);
        System.out.println(resultado2);
        System.out.println(resultado3);
        System.out.println(intMax(5, 10, 1));
    }

    public static int intMax(int a, int b, int c) {
        if (a >= b && a >= c){
            return a;
        } else if (b >= a && b >= c) {
            return  b;
        } else if(c >= a && c >= a) {
            return c;
        }
        return 0;
    }
}
