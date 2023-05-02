package AulaTeste;

public class Pratica5Tarefa01 {
    public static void main(String[] args) {
        boolean resultado = lastDigit(6,17);
        System.out.println(resultado);
    }

    public static boolean lastDigit(int a, int b) {
        int restoA = a % 10;
        int restoB = b % 10;
        if (restoA == restoB){
            return true;
        } else{
            return false;
        }
        
    }
}
