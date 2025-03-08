package secao5;
import java.util.Scanner;
public class CalculadoraIMC {
    public static void main(String[] args) {
     
        Scanner calculadora = new Scanner(System.in);
       
        System.out.println("Qual o seu peso? ");
         double peso = calculadora.nextDouble();
        
         System.out.println("Qual a sua altura: ");
         double altura = calculadora.nextDouble();

         double imc = peso / (altura * altura);

  if (imc < 18.5) {
    System.out.println("Seu imc é: " + imc + ". Classificação: Abaixo do peso");
    }else if (imc >= 18.5 && imc <= 24.9) {
    System.out.println("Seu imc é: " + imc + ". Classificação: Peso normal");
    }else if (imc >= 25 && imc < 29.9) {
        System.out.println("Seu imc é: " + imc + ". Classificação: Sobrepeso");
    }else{
        System.out.println("Seu imc é: " + imc + ". Classificação: Obesidade");
    }
  
calculadora.close();
}
    
}
