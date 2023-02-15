public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaDoAlisson = new Conta();
        contaDoAlisson.saldo = 100;
        contaDoAlisson.deposita(50);
        System.out.println(contaDoAlisson.saldo);
    }
}
