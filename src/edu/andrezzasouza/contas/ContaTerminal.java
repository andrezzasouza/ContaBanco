package edu.andrezzasouza.contas;
import java.util.Scanner;

public class ContaTerminal {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);

    System.out.println("\nPor favor, digite número da conta e aperte 'ENTER' no seu teclado.");
    int numero = scanner.nextInt();

    scanner.nextLine();

    System.out.println("\nPor favor, digite a agência e aperte 'ENTER' no seu teclado.");
    String agencia = scanner.nextLine();

    System.out.println("\nPor favor, digite o nome do cliente e aperte 'ENTER' no seu teclado.");
    String nomeCliente = scanner.nextLine();

    System.out.println("\nPor favor, digite o saldo e aperte 'ENTER' no seu teclado.");
    double saldo = scanner.nextDouble();

    Conta conta = new Conta(numero, agencia, nomeCliente, saldo);

    scanner.close();

    conta.criarConta();
  }
}
