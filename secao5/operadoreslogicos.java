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

   // 3 - Precedencia
   boolean a = true;
   boolean b = false;
   boolean c = true;
   // TRUE AND FALSE -> FALSE OR TRUE -> TRUE
   boolean resultado = a && b || c;

   System.out.println(resultado);

   // TRUE OU FALSE -> TRUE AND TRUE -> TRUE
   boolean resultado1 = a || b && c;
   System.out.println(resultado1);

   boolean resultado2 = ! (a || b) && c;
   // NOT (TRUE OU FALSE) => NOT(TRUE) => FALSE AND TRUE => FALSE
   System.out.println(resultado2);
   

   
    }
    
}
