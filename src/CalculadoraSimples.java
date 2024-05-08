import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Insira o primeiro Numero");
        double numero1 = scanner.nextDouble();

        System.out.println("Insira o Operador (+,-,*,/): ");
        char Operador = scanner.next().charAt(0);

        System.out.println("Insira o segundo Numero");
        double numero2 = scanner.nextDouble();

        double resultado = 0;

        
         switch (Operador) {
                case '+':
                resultado = numero1 + numero2;
                break;

                case '-':
                resultado = numero1 - numero2;
                break;

                case '*':
                resultado = numero1 * numero2;
                break;

                case '/':
                resultado = numero1 * numero2;
                break;
         
         }

         System.out.println("Resultado " + numero1 + Operador + numero2 + "=" + resultado);
        
    }
}
