package secao5;

public class Switch {
    public static void main(String[] args) {
        
       // 11 - switch + break
        int diaDaSemana = 1;

        switch (diaDaSemana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sabado");
                break;
        }

                // default
            // default é o else if do switch
               int n = 10;

                switch (n) {
                    case 1:
                    System.out.println("é 1 ");
                    break;
                        
                    case 2:
                    System.out.println("é dois");
                        break;
                    default:
                    System.out.println("numero não encontrado");
                        break;
                }

        


    }
}
