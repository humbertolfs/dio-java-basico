import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = sc.nextInt();

        System.out.println("Digite o segundo parâmetro: ");
        int parametroDois = sc.nextInt();

        try {
            Contar(parametroUm, parametroDois);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        sc.close();

    }

    public static void Contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }

        for (int i = parametroUm; i < parametroDois; i++) {
            System.out.println("Imprimindo o número " + (i - parametroUm + 1));
        }
    }
}
