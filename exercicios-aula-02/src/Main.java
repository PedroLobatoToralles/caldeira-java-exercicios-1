import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //--------------- Exercício 1 ---------------//

        //Esse exercicio ta na pasta a2e1

        //--------------- Exercício 4 ---------------//

        /*
        System.out.println("Bem-vindo a calculadora do Pedro lindo, primeiro comece com um número:");
        double n1 = scanner.nextDouble();
        System.out.println("Agora digite o segundo número:");
        double n2 = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("Agora digite a operação desejada (+,-,*,/):");
        String operacao = scanner.nextLine();
        double resultado;

        switch(operacao){
            case "+" -> {
                resultado = n1 + n2;
                System.out.println(n1 + " + " + n2 + " = " + resultado);
            }
            case "-" ->{
                resultado = n1 - n2;
                System.out.println(n1 + " - " + n2 + " = " + resultado);
            }
            case "*" ->{
                resultado = n1 * n2;
                System.out.println(n1 + " * " + n2 + " = " + resultado);
            }
            case "/" -> {
                if(n2 != 0){
                    resultado = n1 / n2;
                    System.out.println(n1 + " / " + n2 + " = " + resultado);
                }else{
                    System.out.println("Erro: Divisão por 0 detectada.");
                }
            }
            default -> System.out.println("Opção inválida!");
        }
         */

        //--------------- Exercício 5 ---------------//

        /*
        System.out.println("Digite uma palavra/frase e imprimiremos só a primeira metade dela:");
        String texto = scanner.nextLine();

        String metade = texto.substring(0, (texto.length() / 2));

        if(texto.length() % 2 == 0){
            System.out.println("Seu texto é: " + texto);
            System.out.println("A metade dele é: " + metade);
        }else{
            System.out.println("Seu texto não pode ser dividido em partes iguais.");
            System.out.println("Metade aproximada: " + metade);
        }

        scanner.close();
         */

        //--------------- Exercício 6 ---------------//

        //Exercicio separado na pasta a2e6

        //--------------- Exercício 7 ---------------//


        int i = 0;
        while(i <= 5) {
            System.out.println("Os espartanos estão indo para a guerra em menor número, tente adivinhar quantos soldados eles vão enfrentar:");
            int chute = scanner.nextInt();

            if (chute < 300000) {
                System.out.println("Um pouco mais!");
                i++;
            } else if(chute > 300000) {
                System.out.println("Um pouco menos!");
                i++;
            }
            if(chute == 300000) {
                System.out.println("VOCÊ ACERTOU");
                break;
            }
        }

    }
}
