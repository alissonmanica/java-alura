public class Conta {
    double saldo;
    int agencia = 42;
    int numero;
    String titular;

    public void deposita(double valor) {
        this.saldo += valor;
    }
}
