package secao2;

public class Exercicio2 {
    public static void main(String[] args) {
        
    // ex 001
        int valorOriginal = 10;
        int valorDobrado = valorOriginal * 2;

        System.out.println(valorDobrado);

    // ex 002
    char letra = 'B';
 
    int letra2 = (int) letra;

    System.out.println(letra2);

   // ex 003
   double soma = 15.75;
   double soma2 = 20.40;
   System.out.println(soma + soma2);
   // o que eu fiz
   double n1 = 15.75;
   double n2 = 20.40;

   double soma3 = n1 + n2;
   System.out.println(soma3);
   // o que ele quer

   // ex 004
   long numeroGrande = 2_000_000_000L;

   int valorInt = (int) numeroGrande; 
   System.out.println(valorInt);

   // ex 005
   String aceno = "olá, mundo!";
   String aceno2 = " bem vindo ao java";
   System.out.println(aceno + aceno2);
   // como eu fiz

   String saudacao = "Olá, mundo!";
   String mensagem = saudacao + " Bem-vindo ao java!";
   System.out.println(mensagem);
   // o que ele quer


    }
    
}
