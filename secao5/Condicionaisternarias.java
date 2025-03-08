package secao5;

public class Condicionaisternarias {
    public static void main(String[] args) {
        // 1 - condicionais ternárias

        int numero = 10;
      
        String resultado = (numero % 2 == 0) ? "par" : "impar";
        System.out.println(resultado);
     
        // CONDIÇÃO x > 5 ? EXPRESSÃO SE É TRUE "Ok" : EXPRESSÃO SE É FALSE "Não Ok"

        // 2 - if encadeado

        int idade = 19;
        boolean temCarteira = true;

        if (idade >= 18) {
           
            if (temCarteira) {
                System.out.println("Pode dirigir!");
                
            }else{
                System.out.println("Você precisa de ter habilitação para dirigir!");
            }
            
        } else { 
            System.out.println("Você não pode dirigir ainda!");
        }

    }
}
