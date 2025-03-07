package secao5;

public class operadoreslogicos {
    public static void main(String[] args) {
        // 8 - AND
    int idade = 18;

    boolean temCnh = true;
    System.out.println(idade >= 18 && temCnh);
    // true && true = resultado certo
    boolean cnhVencida = false;
    System.out.println(temCnh && cnhVencida);

    // 9 - OR
   boolean compra = true;
   boolean venda = false;

   System.out.println(compra || venda);
 
   int idade2 = 15;
   boolean ehMembro = true;

   // O usuario pode participar do clube
   // Precisa ter 16 anos ou ser membro
   if (idade2 > 15 || ehMembro){
    System.out.println("voce pode entrar");
   }else{
    System.out.println("acesso negado");
   }

   
    }
    
}
