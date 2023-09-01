import java.util.Scanner;

/**
 * @author Wesley
 * @version 1.0
 * @since 01/09/2023
 */
public class ContaTerminal {
	public static void main(String[] args) throws Exception {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe o numero da agencia:");
		String agencia = scanner.nextLine();

		System.out.println("Informe o numero da conta:");
		int numeroDaConta = scanner.nextInt();

		System.out.println("Informe o nome do cliente:");
		String nomeDoCliente = scanner.nextLine();
		scanner.nextLine();

		System.out.println("Informe o saldo:");
		Double saldo = scanner.nextDouble();

		scanner.close();

		System.out.println("Ola " + nomeDoCliente + ", obrigado por criar uma conta em nosso banco, sua agencia e "
				+ agencia + ", conta " + numeroDaConta + " e seu saldo " + saldo + " ja esta disponivel para saque.");
	}
}
