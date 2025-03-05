package secao2;

public class Exercicios {
    
public static void main(String[] args) {
  
    // Ex 1
  int valor = 10;

    int valorDobrado = valor * 2;

    System.out.println(valorDobrado);

    // Ex 2
    char letraB  = 'B';
    int codigoAscii = letraB;

    System.out.println(codigoAscii);

    //Ex 3
    double n1 = 15.75;
    double n2 = 20.40;

    double soma = n1 + n2;

    System.out.println(soma);

    // Ex 4
    long valorLong = 2_000_000_000;

    int valorInt = (int) valorLong;

    System.out.println(valorInt);

    //Ex 5
    String saudacao = "olá, mundo!";
    String mensagem = saudacao + " Bem-vindo ao Java!";
    System.out.println(mensagem);

}



}