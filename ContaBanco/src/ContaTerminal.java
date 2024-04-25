import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da conta:");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite a agência da conta:");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o nome do cliente da conta:");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o saldo da conta:");
        double saldo = scanner.nextDouble();
        System.out.println(" ");

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo R$ " + saldo + " já está disponível para saque.");
    }
}
