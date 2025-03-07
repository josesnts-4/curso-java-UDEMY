package secao5.Exercicios2;
import java.util.Scanner;
public class Ex003 {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
    System.out.println("Insira um numero para saber se é par ou impar");
    int numero = scanner.nextInt();
      
    String resultado = "";
    if (numero % 2 == 0 ) {
        resultado = "par";
        
       }else{
        resultado = "impar";
       }

    System.out.println("O numero é: " + resultado);
    
    scanner.close();
   
}
    
}
