package secao5;

public class Condicionais {
    public static void main(String[] args) {
        
        // 1 - o que é boolean?

        boolean isTrue = true;
        boolean isfalse = false;


        System.out.println(isTrue);
        System.out.println(isfalse);

        // 2 - operadores de comparação

        int x = 10;
        System.out.println(x == 10);

        System.out.println(x == 9);

        System.out.println(x != 5);

        System.out.println(x != 10);

        System.out.println(x > 10);

        // x é maior ou igual a 10
        System.out.println(x >= 10);

        // x é menor que 10
        System.out.println(x < 10);

        //x é menor ou igual a 10
        System.out.println(x <= 10);
        
        // 3 - atribuição e comparação
        int n = 5;
        int m = 10;

        System.out.println(n == 12);
        
        System.out.println(n);

        System.out.println(n == m);

        // 4 - comparação de string

        String str1 = "Java";
        String str2 = new String("Java");

        System.out.println(str1);
        System.out.println(str2);

        System.out.println(str1 == str2);

        System.out.println(str1 == "Java");

        System.out.println(str2.equals(str1));
        
        System.out.println(str2.equals("Java"));

        String str3 = "JAVA";

        System.out.println(str1.equals(str3));

        // Java == JAVA (false) > java == java
        System.out.println(str1.equalsIgnoreCase(str3));
        
       // 5 - if
  // baseado em uma comparação, eu executo algo
       int numero = 10;

       if (numero > 5) {

        System.out.println("o numero é maior que 5");

       }

       int numero2 = 6;

       if  (numero2 > 10) { 
        System.out.println("o numero é maior que 10");
        
       }
     // if com strings
       String texto = "teste";
     // se a função retorna um booleano, eu posso usar no if
     if (texto.equals("teste")){
        System.out.println("O texto é: teste");
     }
       // declaração do if (comparação ou retorno de booleano) {o que será executado ...} sintaxe do if

       // 6 - else

       int numero3 = 6;

       if  (numero3 > 10) { 
        System.out.println("o numero é maior que 10");
       
    }else {
        System.out.println("insira outro numero: ");
    }
    // todo else precisa de um if, mas nem todo if precisa de um else

    int valor3 = 50;
    if (valor3 > 20) {
        System.out.println("o valor é maior do que 20 ");
        
    }
    int valor4 = 50;
    if (valor4 > 200) {
        System.out.println("o valor é maior do que 200 ");
        
    }else{
         System.out.println("insira um valor válido: ");
    }
   

    double nota = 5.9;
    if (nota == 10){
        System.out.println("Parabens, você foi aprovado!!!");
    }else if (nota > 6.5){
        System.out.println("Nota acima da média");
    }else if (nota < 6) {
        System.out.println("Nota abaixo da media");
    }
        
        
      

        

        
    
    }
    
}
