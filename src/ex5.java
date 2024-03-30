import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string para inverter: ");

        String palavraOrdenada = scanner.nextLine();
        scanner.close();

        String palavraInvertida = "";
        for (int i = palavraOrdenada.length() - 1; i >= 0; i--) {
            palavraInvertida += palavraOrdenada.charAt(i);
        }

        System.out.println("String original: " + palavraOrdenada);
        System.out.println("String invertida: " + palavraInvertida);
    }
}

