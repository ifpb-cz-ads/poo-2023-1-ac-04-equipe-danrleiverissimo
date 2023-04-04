import java.util.Scanner;
public class Q05_BM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário
        System.out.print("Digite um número de 1 a 7: ");
        int dia = scanner.nextInt();
        // Usa uma instrução switch para imprimir o dia da semana correspondente ao número digitado
        switch(dia) {
            case 1:
                System.out.println("Domingo");break;
            case 2:
                System.out.println("Segunda-feira");break;
            case 3:
                System.out.println("Terça-feira");break;
            case 4:
                System.out.println("Quarta-feira");break;
            case 5:
                System.out.println("Quinta-feira");break;
            case 6:
                System.out.println("Sexta-feira");break;
            case 7:
                System.out.println("Sábado");break;
            default: // Se o número não estiver no intervalo de 1 a 7, exibe uma mensagem de erro
                System.out.println("Número inválido. Digite um número de 1 a 7.");
        }
    }
}
