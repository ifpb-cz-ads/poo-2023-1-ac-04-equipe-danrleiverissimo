import java.util.Scanner;

public class CTquestao1 {
    public static void main(String[] args){
        
        System.out.println("idade do cidadao: ");
        var input = new Scanner(System.in);
        int idade = input.nextInt();
        input.close();

        if( idade >= 18 && idade <= 65){
            System.out.println("Deve votar obrigatoriamente.");
            System.exit(0);
        }
        if( idade >= 16 || idade >65 ){
            System.out.println("Voto facultativo.");
            System.exit(0);
        }
        
        System.out.println("Impedido de votar.");

    }
}
