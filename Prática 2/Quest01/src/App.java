// para Testes
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("OLa mundo!");

        Scanner ler = new Scanner(System.in);
    System.out.println("Anos de vida: ");
    int anos = ler.nextInt();
    System.out.println("Meses de vida: ");
    int meses = ler.nextInt();
    System.out.println("dias de vida: ");
    int dias = ler.nextInt();
    int resultado = anos*365 + meses*30 + dias;
    System.out.println("Total de dias: " + resultado);
    }
    }

