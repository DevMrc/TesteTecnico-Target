import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número para verificar na sequência de Fibonacci:");

        int numero = scanner.nextInt();
        scanner.close();

        int antes = 0;
        int depois = 1;

        while (antes < numero) {
            int sum = antes + depois;
            antes = depois;
            depois = sum;
        }

        if (antes == numero) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }
    }
}

