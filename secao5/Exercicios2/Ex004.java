package secao5.Exercicios2;
import java.util.Scanner;
public class Ex004 {
    public static void main(String[] args) {
   //Peça ao usuario para inserir um numero.
   // verifique se o numero é par ou impar, e exiba a palavra "par" ou "impar"
   
        Scanner scanner = new Scanner(System.in);
  
        System.out.println("Insira um numero de 1 a 7: ");

   int diaDaSemana = scanner.nextInt();

    switch (diaDaSemana) {
        case 1:
        case 7:
        System.out.println("Final de semana");
        break;
        case 2:
        case 3:
        case 4:
        case 5:
        case 6:
        System.out.println("Dia da semana");
        break;
    default:
System.out.println("Numero inválido");
            break;
    }

    scanner.close();
    }
    
}
