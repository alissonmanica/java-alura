public class TestaBanco {
    public static void main(String[] args) {
        Cliente alisson = new Cliente();
        alisson.nome = "Alisson Manica";
        alisson.cpf = "222.222.222-22";
        alisson.profissao = "desenvolvedor";

        Conta contaDoAlisson = new Conta();
        contaDoAlisson.deposita(100);
        
        contaDoAlisson.titular = alisson;
        System.out.println(contaDoAlisson.titular.nome);
    }
}
