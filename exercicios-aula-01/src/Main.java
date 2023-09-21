import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //--------------- Exercício 1 ---------------//

        /*

        /*System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();
        System.out.println("Seu nome é "+ nome);

         */

        //--------------- Exercício 2 ---------------//

        /*

        System.out.println("Digite um número:");
        int numero1 = scanner.nextInt();
        System.out.println("Digite outro número:");
        int numero2 = scanner.nextInt();
        System.out.println("Seus números escolhidos são "+ numero1+ " e "+ numero2);

         */

        //--------------- Exercício 3 ---------------//

        /*

        double n1, n2, n3, nmax, nmin, arit;

        System.out.println("Digite um primeiro número:");
        n1 = scanner.nextDouble();

        System.out.println("Digite um segundo número:");
        n2 = scanner.nextDouble();

        System.out.println("Digite um terceiro número:");
        n3 = scanner.nextDouble();

        if(n1 > n2) {
            if(n1 > n3){
                nmax = n1;
            }else{
                nmax = n3;
            }
        }else{
            if(n2 > n3){
                nmax = n2;
            }else{
                nmax = n3;
            }
        }

        if(n1 < n2){
            if(n1 < n3){
                nmin = n1;
            }else{
                nmin = n3;
            }
        }else{
            if(n2 < n3){
                nmin = n2;
            }else{
                nmin = n3;
            }
        }

        arit = (n1 + n2 + n3) / 3;

        System.out.println("O maior número é: " + nmax);
        System.out.println("O menor número é: " + nmin);
        System.out.println("A média aritmética é: " + arit);

         */

        //--------------- Exercício 4 ---------------//

        /*

        int smin = 1320;
        System.out.println("Informe seu salário: ");
        double salario = scanner.nextInt();

        double resultado = salario / smin;

        if(resultado <= 1)
            System.out.println("Seu salário equivale a " + resultado + " Salário mínimo.");

        if(resultado > 1)
            System.out.println("Seu salário equivale a " + resultado + " Salários mínimos.");

         */

        //--------------- Exercício 5 ---------------//

        /*

        System.out.println("Digite uma hora:");
        int h = scanner.nextInt();
        System.out.println("Digite um minuto:");
        int m = scanner.nextInt();
        System.out.println("Digite segundos:");
        int s = scanner.nextInt();

        int stotal = s + (m*60) + (h*3600);

        int falta = 86400 - stotal;

        System.out.println("Se passaram " + stotal + " segundos desde a meia-noite");
        System.out.println("Faltam " + falta + " segundos para a meia-noite");

         */

        //--------------- Exercício 6 ---------------//

        /*

        System.out.println("Digite a sua idade:");
        int idade = scanner.nextInt();

        if(idade < 16)
            System.out.println("Você nao pode votar!");
        if(idade == 16 || idade == 17 || idade > 65)
            System.out.println("O voto é facultativo!");
        if(idade >= 18 && idade <= 65)
            System.out.println("Você é OBRIGADO a votar!");

        */

        //--------------- Exercício 7 ---------------//

        /*

        System.out.println("Digite sua idade:");
        int age = scanner.nextInt();
        System.out.println("Digite seu salário:");
        double sal =  scanner.nextDouble();

        if(sal > 2000 && age >= 18){
            System.out.println("Você pode comprar um carro!");
        }else{
            System.out.println("Você não pode comprar um carro!");
        }

         */

        //--------------- Exercício 8 ---------------//

        /*

        System.out.println("Você é Gestante, Idoso, PCD ou Nenhuma das alternativas (n)?");
        String fila = scanner.nextLine();

        if(fila.equals("Gestante") || fila.equals("gestante") || fila.equals("Idoso") || fila.equals("Idosa") || fila.equals("idoso") || fila.equals("idosa") || fila.equals("PCD") || fila.equals("pcd")) {
            System.out.println("Você tem direito a fila prioritária!");
        }else{
            System.out.println("Você NÃO tem direito a fila prioritária!!!");
        }

        */

        //--------------- Exercício 9 ---------------//

        /*

        System.out.println("Em que ano você nasceu?");
        int ano = scanner.nextInt();
        System.out.println("Digite o ano atual:");
        int anoatual = scanner.nextInt();

        int totalidade = anoatual - ano;

        System.out.println("Você fará "+ totalidade +" anos nesse ano.");

         */

        //--------------- Exercício 10 ---------------//

        /*

        System.out.println("Bem-vindo ao conversor de temperatura de Celsius para Fahrenheit, digite uma temperatura em celsius:");
        int cel = scanner.nextInt();

        double far = (cel*9/5) + 32;

        System.out.println("O resultado é " + far + " F");

        */

        //--------------- Exercício 11 ---------------//

        /*

        System.out.println("Digite uma palavra e/ou frase e contaremos as vogais");
        String frase = scanner.nextLine().toLowerCase();

        int vogais = 0;

        for(int i = 0;i < frase.length(); i++){
            char letra = frase.charAt(i);
            if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                vogais++;
            }
        }
        if(vogais == 1) {
            System.out.println("Existe " + vogais + " vogal na sua palavra/frase.");
        }else{
            System.out.println("Existem " + vogais + " vogais na sua palavra/frase.");
        }

        */

        //--------------- Exercício 12 ---------------//

        /*
        System.out.println("Bem-vindo ao conversor de moeda do Pedro lindão, digite um valor em dólar e vamos converter para reais:");
        double dolar = scanner.nextDouble();

        double reais = Math.round(dolar*4.91568);
        System.out.println("Isso da R$" + reais);
        */

        //--------------- Exercício 13 ---------------//

        System.out.println("Digite um número não negativo e informaremos o fatorial:");
        int num = scanner.nextInt();

        if(num >= 0) {
            long fatorial = 1;

            for(int i = 1; i <= num; i++){
                fatorial *= i;
            }
            System.out.println("O fatorial de " + num + " é " + fatorial);
        }else{
            System.out.println("Eu falei sem número negativo seu animal.");
        }
    }
}