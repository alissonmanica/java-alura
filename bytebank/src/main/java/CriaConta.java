public class CriaConta {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;

        primeiraConta.saldo += 100;

        Conta segundaConta = new Conta();
        segundaConta.saldo = 50;
        System.out.println("na primeira conta tem " + primeiraConta.saldo);
        System.out.println("na segunda conta tem " + segundaConta.saldo);

        System.out.println(primeiraConta.agencia);
        System.out.println(primeiraConta.numero);

        System.out.println(segundaConta.agencia);

        segundaConta.agencia = 146;
        System.out.println("agora a segunda conta esta na agencia " + segundaConta.agencia);

        if (primeiraConta == segundaConta) {
            System.out.println("mesma conta");
        } else {
            System.out.println("contas diferentes");
        }
    }
}
