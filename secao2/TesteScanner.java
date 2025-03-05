package secao2;

import java.util.Scanner;



public class TesteScanner {
    

    public static void main(String[] args) {
        
// 1 - testano scanner

Scanner scanner = new Scanner(System.in);

//mensagem para o usuario entender o que precisa digitar
System.out.println("Digite o seu nome: ");

// resgata o valor do terminal
String nome = scanner.nextLine();

// exibe o valor
System.out.println("olá " + nome + "!");

System.out.println("digite a sua idade");

int idade = scanner.nextInt();

System.out.println("voce tem " + idade + " anos");

// problema do nextline

System.out.println("Digite um numero: ");

int n = scanner.nextInt();
/*
 * sempre que tiver algum metodo scanner que pega um numero, lembre-se
 * de colocar um 'nextline' vazio para absorver esse enter extra
 * é meio que um bug do java e ele vai suprimir o nosso proximo nextline.
 */

 /*
  * só vai ocorrer esse problema se pegar mais algum dado depois
  se não tivesse isso, não precisaria desse cara aqui.
  */
scanner.nextLine();

System.out.println("digite um texto");

String txt = scanner.nextLine();

System.out.println("os dados são, n = " + n + " e txt = " + txt);



// fechamento do scanner, para evitar memory leak
scanner.close();



    }
}
