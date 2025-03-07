package secao5;
import java.util.Scanner;
public class Exercicios {
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
   

    System.out.println("insira seu nome de usuario: ");
   
    String usuario = scanner.next();
   
    System.out.println("Insira a senha");
   
    String senha = scanner.next();

     if (usuario.equals ("admim") && senha.equals ("1234")) {
        System.out.println("Acesso permitido ");
        
    }else{
        System.out.println("Acesso negado");
    }


    System.out.println("Insira um numero para saber se é par ou impar");
    int numero = scanner.nextInt();
      
    String resultado = "";
    if (numero % 2 == 0 ) {
        resultado = "par";
        
       }else{
        resultado = "impar";
       }

    System.out.println("O numero é: " + resultado);

    System.out.println("Insira um numero de 1 a 7: ");

    int diaDaSemana = scanner.nextInt();

    switch (diaDaSemana) {
        case 1:
        System.out.println("Final de semana: Domingo");
        break;
        case 2:
        System.out.println("Segunda-feira");
        break;
        case 3:
        System.out.println("Terça-feira");
        break;
        case 4:
        System.out.println("Quarta-feira");
        break;
        case 5:
        System.out.println("Quinta-feira");
        break;
        case 6:
        System.out.println("Sexta-feira");
        break;
        case 7:
        System.out.println("Sábado");
        break;
    
        default:
            break;
    }

    scanner.close();

}




}
