import java.util.Scanner;

public class Quiz {
    private static final String[] perguntas = {
        "1. Qual é a capital do Brasil?",
        "2. Quem é o autor de 'Dom Quixote'?",
        "3. Qual é o maior planeta do sistema solar?",
        "4. Quem pintou a 'Mona Lisa'?",
        "5. Qual é o valor de π (pi)?",
        "6. Quem escreveu 'Hamlet'?",
        "7. Qual é o país mais populoso do mundo?",
        "8. Quem foi o primeiro presidente do Brasil?",
        "9. Em que ano ocorreu a independência do Brasil?",
        "10. Qual é o elemento químico com símbolo 'O'?",
        "11. Quem descobriu a penicilina?",
        "12. Qual é a capital da França?",
        "13. Quem foi o criador da Teoria da Relatividade?",
        "14. Qual é o maior oceano da Terra?",
        "15. Quem foi o fundador da Microsoft?"
    };

    private static final String[] respostas = {
        "a", "b", "c", "a", "b",
        "a", "c", "b", "c", "a",
        "b", "c", "a", "b", "c"
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int pontuacao = 0;

            System.out.println("Bem-vindo ao Quiz!\n");

            for (int i = 0; i < perguntas.length; i++) {
                System.out.println(perguntas[i]);
                System.out.println("a) Opção A");
                System.out.println("b) Opção B");
                System.out.println("c) Opção C");

                System.out.print("Escolha a opção correta: ");
                String respostaUsuario = scanner.next().toLowerCase();

                if (respostaUsuario.equals(respostas[i])) {
                    System.out.println("Resposta correta!\n");
                    pontuacao++;
                } else {
                    System.out.println("Resposta incorreta. Reiniciando o quiz...\n");
                    break;
                }
            }

            System.out.println("Pontuação final: " + pontuacao);

            System.out.print("Deseja reiniciar o quiz? (s/n): ");
            String reiniciar = scanner.next().toLowerCase();

            if (!reiniciar.equals("s")) {
                System.out.println("Quiz encerrado. Obrigado por jogar!");
                break;
            }
        }

        scanner.close();
    }
}