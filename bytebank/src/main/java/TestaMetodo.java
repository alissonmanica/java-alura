public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaDoAlisson = new Conta();
        contaDoAlisson.saldo = 100;
        contaDoAlisson.deposita(50);
        System.out.println(contaDoAlisson.saldo);

        boolean conseguiuRetirar = contaDoAlisson.saca(20);
        System.out.println(contaDoAlisson.saldo);
        System.out.println(conseguiuRetirar);

        Conta contaDaMarcela = new Conta();
        contaDaMarcela.deposita(1000);

        boolean sucessoTransferencia = contaDaMarcela.transfere(300, contaDoAlisson);
        if (sucessoTransferencia) {
            System.out.println("transferencia com sucesso!");
        } else {
            System.out.println("faltou dinheiro!");
        }
        System.out.println(contaDaMarcela.saldo);
        System.out.println(contaDoAlisson.saldo);

        contaDoAlisson.titular = "alisson manica";
        System.out.println(contaDoAlisson.titular);
    }
}
