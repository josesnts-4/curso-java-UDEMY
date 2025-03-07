package secao5.Exercicios2;
import java.util.Scanner;
public class Ex002 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("insira seu nome de usuario: ");
   
    String usuario = scanner.next();
   
    System.out.println("Insira a senha");
   
    String senha = scanner.next();

     if (usuario.equals ("admim") && senha.equals ("1234")) {
        System.out.println("Acesso permitido ");
        
    }else{
        System.out.println("Acesso negado");
    }
   scanner.close();
   
}
}
