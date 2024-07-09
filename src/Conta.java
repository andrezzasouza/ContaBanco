public class Conta {
  int numero;
  String agencia;
  String nomeCliente;
  double saldo;

  public Conta(int numero, String agencia, String nomeCliente, double saldo) {
    this.numero = numero;
    this.agencia = agencia;
    this.nomeCliente = nomeCliente;
    this.saldo = saldo;
  }

  public void criarConta() {
    String numeroComoString = String.valueOf(this.numero);
    String saldoComoString = String.valueOf(this.saldo);

    String mensagemTerminal = "\nOlá ".concat(this.nomeCliente)
        .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
        .concat(this.agencia)
        .concat(", conta ")
        .concat(numeroComoString)
        .concat(" e seu saldo ")
        .concat(saldoComoString)
        .concat(" já está disponível para saque.");

    System.out.println(mensagemTerminal);
  }
}
