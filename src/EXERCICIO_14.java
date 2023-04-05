import java.util.Scanner;

public class EXERCICIO_14 {

    //EXERCICIO_14 - CRIE UM PROGRAMA QUE LEIA DO USUÁRIO OS SEGUINTES DADOS:
    // 1 - DADOS DO EMPREGADO
    //      - MATRICULA - NOME - CARGO - SALARIO - NUMERO DE FILHOS - HORAS EXTRAS
    // 2 - CALCULAR SALARIO
    // 3 - EXIBIR DADOS
    // 4 - SAIRR
    // O SALARIO FINAL DO EMPREGADO É DADOS POR: SALARIO + QUANTIDADE DE FILHOS*250 + HORAS EXTRAS*100


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int matricula = 0;
        String nome = null;
        String cargo = null;
        double salario = 0;
        int nFilhos = 0;
        float horas = 0;


        int opcao = 0;
        while (opcao != 4) {
            System.out.println("Escolha uma opção:");

            System.out.println("1 - Cadastrar funcioário.");
            System.out.println("2 - Calcular salário.");
            System.out.println("3 - Exibir dados.");
            System.out.println("4 - Sair.");
            System.out.println(" ");
            opcao = entrada.nextInt();

            if (opcao == 1) {
                System.out.println("Cadastrar funcionário.");
                System.out.println("Digite sua matrícula:");
                matricula = (Integer.parseInt(entrada.next()));
                System.out.println("Digite seu nome:");
                nome = entrada.next();
                System.out.println("Digite seu cargo.");
                cargo = entrada.next();
                System.out.println("Digite o salário base.");
                salario = (Double.parseDouble(entrada.next()));
                System.out.println("Digite a quantidade de horas extras.");
                horas = (Float.parseFloat(entrada.next()));
                System.out.println("Digite o numero de filhos.");
                nFilhos = (Integer.parseInt(entrada.next()));

            } else if (opcao == 2) {
                double salarioBase = 0;
                salarioBase = ((salario / 160) * horas) + (nFilhos * 250);
                salario = salario + salarioBase;
                System.out.println("horas"+horas+ "salario base"+salarioBase);
                System.out.println("O sálario mais horas extras e bolsa família é: R$" + salario);
            } else if (opcao == 3) {
                System.out.println("Exibir dador:");
                System.out.println("Matricula:" + matricula);
                System.out.println("Nome:"+nome);
                System.out.println("Cargo:" + cargo);
                System.out.println("Salario base:" + salario);
                System.out.println("Numero de filhos:" + nFilhos);
                System.out.println("Quantidade de horas extras"+horas);
            } else if (opcao == 4) {
                System.out.println("Sair.");
            } else {
                System.out.println("Opção inválida.");
            }


        }
    }
}
