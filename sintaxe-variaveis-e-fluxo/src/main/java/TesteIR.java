public class TesteIR {
    public static void main(String[] args) {

        double salario = 3300.0;

        boolean opcao1 = salario >= 1900.0 && salario <= 2800.0;
        boolean opcao2 = salario >= 2800.01 && salario <= 3751.0;
        boolean opcao3 = salario >= 3751.01 && salario <= 4664.00;

        if (opcao1) {
            System.out.println("A sua alíquota é de 7.5%");
            System.out.println("Você deverá deduzir o valor de R$ 142");
        }

        if (opcao2) {
            System.out.println("A sua alíquota é de 15%");
            System.out.println("Você deverá deduzir o valor de R$ 350");
        }

        if (opcao3) {
            System.out.println("A sua alíquota é de 22.5%");
            System.out.println("Você deverá deduzir o valor de R$ 636");
        }
    }
}
