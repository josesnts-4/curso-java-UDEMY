package secao2;

public class Variavel {
    
    public static void main(String[] args) {
        
//1 - O que são variaveis aula 1
// tipo -> nome  -> atribuir valor;
String nome = "Emmanuela";

// nome => "Jose"
System.out.println(nome);

// 2 - Atribuição de variavel com outra
String teste = "teste";

String testando = teste;

System.out.println(testando);

long  numeroGrande = 999999999999999L;

//int numeroGrandeDois = numeroGrande;
   
System.out.println(numeroGrande);

// 3 - comentario

/*
comentario linha 1
linha 2
linha 3
 */
/**
 * isso é para saber como comentar em java
 * linha 3
 * linha 4
 * 
 */
 
// 4 - Strings


String firstName = "Jose";
String lastName = "Ramos";

System.out.println(firstName + " " + lastName);

System.out.println("o nome dele é: " + firstName);

String fullName = firstName + " " + lastName;

// concatenação = operador + nas strings, para uni-las
System.out.println(fullName);

// 5 - Char



char letra = 'A';
System.out.println(letra);

String letra2 = "A";

System.out.println(letra2);

char simbolo = '@';

System.out.println(simbolo);

/*quando achar que um unico caracte pode resolver um
 problema, utilizar o char. economiza espaço
 */

// 6 - int


 int n = 42;

 System.out.println(n);

 System.out.println(n + 5); 

 System.out.println(n * 10);

 System.out.println(n / 5);

int soma = n + 12;

System.out.println(soma);

// 7 - long

long populacaoMundial = 810000000000000L;

System.out.println(populacaoMundial);

long grandeNumero = 1_000_000L;

System.out.println(grandeNumero + 1);


long minhaCasa = 450000000;

System.out.println(minhaCasa);

long minhaCasa2 = 4599377777777L;

System.out.println(minhaCasa2);


// 8 - Double

 double preco = 19.99;

System.out.println(preco);

System.out.println(preco - 12);

System.out.println(preco / 8);

double pi = 3.141_592_123;

System.out.println(pi);

double valorComD = 12.3D;

System.out.println(valorComD);

// 9 - operadores aritméticos

int soma2 = 12 + 5;

System.out.println(soma2);

System.out.println(22 + 4);

System.out.println(10 - 5);

System.out.println(10 * 5);

System.out.println(10.0 / 2.5);

// para ter o resultado quebrado (1.5), pelo menos 1 numero da divisao tem que ser double

System.out.println(10 / 3);

System.out.println(10.0 / 3);

System.out.println(10 % 3);

// 10 - operadores aritmeticos p2

int x = 5;

x++;
x++;
x++;
x++;

System.out.println(x);

int y = 5;

System.out.println(y);

// 11 - type casting

int numero2 = 42;

long numeroLong= numero2;

double numeroDouble = numero2;

System.out.println(numeroLong);

System.out.println(numeroDouble);

// explicito (narrowing)

double valorDouble = 9.78;

int valorInt = (int) valorDouble;

System.out.println(valorInt);

//casting de char para int
char letra3 = 'A'; 

int codigoAscii = (int) letra3;

System.out.println(codigoAscii);

// 12 - constantes 

final int DIAS_DA_SEMANA = 7;
System.out.println("Dias da semana: " + DIAS_DA_SEMANA);

// 13 - var

var z = 10;
System.out.println(z);

z = 5;

var texto2 = "teste";
System.out.println(texto2);

var doubletexto = "2.0";
System.out.println(doubletexto);

//





 }


}
