import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu saldo");
        double saldo = scanner.nextDouble();

        System.out.println("Digite o numero da conta");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o numero da agência");
        String agencia = scanner.next();

        System.out.println("Digite o nome do Cliente");
        String seuNome = scanner.next();

        System.out.println("Olá " + seuNome + ",obrigado por criar uma conta en nosso banco.");
        System.out.println("Seu numero da conta é " + numeroConta + " ,agencia" + agencia);
        System.out.println(" ,e seu saldo " + saldo + " ,já esta disponível para saque ");

    }

}
