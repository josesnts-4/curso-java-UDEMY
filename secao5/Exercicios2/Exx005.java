package secao5.Exercicios2;
import java.util.Scanner;
public class Exx005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("insira um numero");
        int intervalo = scanner.nextInt();

        if (intervalo >= 10 && intervalo <= 20 ) {
            System.out.println("Dentro do intervalo ");
            
        }else {
            System.out.println("Fora do intervalo ");
            
        }
    scanner.close();
    }
    
}
