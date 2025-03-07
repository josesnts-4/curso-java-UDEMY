package secao5.Exercicios2;
import java.util.Scanner;
public class Ex001 {
    public static void main(String[] args) {
        // Exercicio 1: Verificação de categoria de preço
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("insira o valor de um produto: ");

        double valor = scanner.nextDouble();

   
        if (valor < 50) {

            System.out.println("Barato ");
    }else if (valor >= 50 && valor <= 100 ) {
        System.out.println("Médio");
        
    } else {
        System.out.println("Caro: ");
        
    }
   scanner.close();

}
}
