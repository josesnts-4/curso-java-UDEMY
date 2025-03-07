package secao5.Exercicios2;
import java.util.Scanner;
public class Ex006 {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
       
System.out.println("insira uma letra: ");
  // para considerar letras de caixa alta pode fazer o:
//equalsIgnoreCase OU ToLowerCase 
// para ignorar os demias caracteries e trabalhar só com os primeiros
// eu utilizo o charAt()    
char letras = scanner.next().toLowerCase().charAt(0);

switch (letras) {
    case 'a':
    case 'e':
    case 'i':
    case 'o':
    case 'u':
        System.out.println("Vogal");
        break;

    default:
    System.out.println("Consoante");
        break;
}
scanner.close();    
}
}
