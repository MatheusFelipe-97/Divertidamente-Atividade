import java.util.Scanner;

public class divertidamente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amizades;
        int pontosalegria = 0;
        int pontostristeza = 0;

        System.out.println("\nRiley fez novas amizades? ( 1 - SIM | 2 - NÃO )");
        int resposta = scanner.nextInt();

        if (resposta == 1) {
            System.out.println("Quantas amizades Riley fez?");
            amizades = scanner.nextInt();

            pontosalegria = amizades * 10;

            System.out.println("A emoção alegria recebeu " +pontosalegria+ " pontos");
        } else{
            pontostristeza = 30;

            System.out.println("A emoção tristeza recebeu " +pontostristeza+ " pontos");
        }
        scanner.close();


    }
}