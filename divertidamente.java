import java.util.Scanner;

public class divertidamente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pontosAlegria = 0;
        int pontosTristeza = 0;

        // PARTE 1 - Amizades
        System.out.println("Riley fez novas amizades? (1 - Sim / 2 - Não)");
        int resposta = scanner.nextInt();

        if (resposta == 1) {
            System.out.println("Quantas amizades Riley fez?");
            int amizades = scanner.nextInt();

            pontosAlegria += amizades * 10;
        } else {
            pontosTristeza += 30;
        }

        // PARTE 2 - Provas
        System.out.println("\nDigite a nota da prova A1:");
        double A1 = scanner.nextDouble();

        System.out.println("Digite a nota da prova A2:");
        double A2 = scanner.nextDouble();

        System.out.println("Digite a nota da prova A3:");
        double A3 = scanner.nextDouble();

        double media = (A1 + A2 + A3) / 3;

        if (media >= 7) {
            pontosAlegria += 50;
        } else {
            pontosTristeza += 50;
        }

        // PARTE 3 - Exercícios
        System.out.println("\nQuantos exercícios Riley fez (0 a 10)?");
        int exercicios = scanner.nextInt();

        pontosAlegria += exercicios * 10;
        pontosTristeza += (10 - exercicios) * 10;

        // RESULTADO FINAL
        System.out.println("\nPontos da Alegria: " + pontosAlegria);
        System.out.println("Pontos da Tristeza: " + pontosTristeza);

        if (pontosAlegria > pontosTristeza) {
            System.out.println("\nA mudança para a nova cidade foi uma experiência incrível para a Riley.");
        } else if (pontosTristeza > pontosAlegria) {
            System.out.println("\nA mudança para a nova cidade foi uma experiência desagradável para a Riley.");
        } else {
            System.out.println("\nA Riley teve uma experiência neutra.");
        }

        scanner.close();
    }
}
