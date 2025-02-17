import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {

        System.out.println("Bem vindos a calculadora!");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o primeiro valor: ");

        Double num1 = scanner.nextDouble();

        System.out.print("Insira o segundo valor: ");

        Double num2 = scanner.nextDouble();

        System.out.print("Agora, insira o operador: ");

        char operador = scanner.next().charAt(0);

        scanner.close();

        double result = 0;

        boolean repetir = true;

        while (repetir) {

            switch (operador) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;

                case '*':

                    result = num1 * num2;

                case '/':

                    result = num1 / num2;

                default:
                    System.out.println("Sinal inválido, tente novamente!");

                    scanner.close();
                    break;

            }

            System.out.println(num1 + " " + operador + " " + num2 + ": " + result);
            break;
        }

    }
}
