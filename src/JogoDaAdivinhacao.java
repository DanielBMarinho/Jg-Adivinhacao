import java.util.Random;
import java.util.Scanner;

public class JogoDaAdivinhacao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numeroGerado = new Random().nextIntgit(100);
        int tentativas = 0;
        int numeroDigitado = 0;

        while(tentativas <5){
            System.out.println("Digite um número entre 0 e 100: " );
            numeroDigitado = leitor.nextInt();
            tentativas++;

            if (numeroDigitado == numeroGerado ){
                System.out.println("Parabéns você acertou o número em " + tentativas + "tentativas !");
                break;
            } else if (numeroDigitado < numeroGerado) {
                System.out.println("O numero digitado é menor que o numero gerado !");
            } else if (numeroDigitado > numeroGerado) {
                System.out.println("O numero digitado é maior que o numero gerado !");
            }

        }
        if (tentativas == 5 && numeroDigitado != numeroGerado){
            System.out.println("Você não conseguiu acertar o número em 05 tentativas. O número era: " + numeroGerado);
        }
    }
}