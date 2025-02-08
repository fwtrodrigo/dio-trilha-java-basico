package com.fwtcompany;

import java.util.Scanner;
import java.util.function.Function;

public class ContaTerminal {
    public static final int AGENCIA_TAMANHO_MINIMO = 1;
    public static final int AGENCIA_TAMANHO_MAXIMO = 5;

    public static final int AGENCIA_DIGITO_TAMANHO = 1;

    public static final int CONTA_TAMANHO_MINIMO = 1;
    public static final int CONTA_TAMANHO_MAXIMO = 12;

    public static final int TITULAR_TAMANHO_MINIMO = 3;
    public static final int TITULAR_TAMANHO_MAXIMO = 256;

    private final String agencia;
    private final int conta;
    private final String titular;
    private final double saldo;

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            ContaTerminal conta = ContaTerminal.criar(scanner);
            System.out.println(conta);
        }
    }
    private ContaTerminal(String agencia, int conta, String titular, Double saldo) {
        this.agencia = agencia;
        this.conta = conta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public static ContaTerminal criar(Scanner scanner) {
        String agencia = obterAgencia(scanner);
        int conta = obterConta(scanner);
        String titular = obterTitular(scanner);
        Double saldo = obterSaldo(scanner);

        return new ContaTerminal(agencia, conta, titular, saldo);
    }

    private static <T> T obterEntrada(Scanner scanner, String mensagem, Function<String, T> conversor) {
        while (true) {
            try {
                System.out.print(mensagem);
                String entrada = scanner.nextLine().trim();
                return conversor.apply(entrada);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static String obterAgencia(Scanner scanner) {
        String campo = "Agencia";

        return obterEntrada(scanner, "Por favor, digite o número da " + campo + ": ", entrada -> {
            if (entrada.isEmpty()) {
                throw new IllegalArgumentException("O campo " + campo + " não pode ser vazio !.");
            }
            if (!entrada.matches("^\\d{" + AGENCIA_TAMANHO_MINIMO + "," + AGENCIA_TAMANHO_MAXIMO + "}-\\d{" + AGENCIA_DIGITO_TAMANHO + "}$")) {
                throw new IllegalArgumentException("O campo " + campo + " deve conter entre  " + AGENCIA_TAMANHO_MINIMO + " e " + AGENCIA_TAMANHO_MAXIMO + " números, seguido de hífen e dígito da agencia. Exemplo: '123-4'.");
            }

            return entrada;
        });
    }

    private static int obterConta(Scanner scanner) {
        String campo = "Conta";

        return obterEntrada(scanner, "Por favor, digite o número da " + campo + ": ", entrada -> {
            if (entrada.isEmpty()) {
                throw new IllegalArgumentException("O campo " + campo + " não pode ser vazio !.");
            }
            if (!entrada.matches("^\\d{" + CONTA_TAMANHO_MINIMO + "," + CONTA_TAMANHO_MAXIMO + "}$")) {
                throw new IllegalArgumentException("O campo " + campo + " deve conter entre  " + CONTA_TAMANHO_MINIMO + " e " + CONTA_TAMANHO_MAXIMO + " digitos e ser compostos apenas de números.");
            }

            return Integer.parseInt(entrada);
        });
    }

    private static String obterTitular(Scanner scanner) {
        String campo = "Titular";

        return obterEntrada(scanner, "Por favor, digite o nome do " + campo + ": ", entrada -> {
            if (entrada.isEmpty()) {
                throw new IllegalArgumentException("O campo " + campo + " não pode ser vazio !.");
            }
            if (!entrada.matches("^.{" + TITULAR_TAMANHO_MINIMO + "," + TITULAR_TAMANHO_MAXIMO + "}$")) {
                throw new IllegalArgumentException("O campo " + campo + " deve conter entre " + TITULAR_TAMANHO_MINIMO + " e " + TITULAR_TAMANHO_MAXIMO + " caracteres.");
            }

            return entrada;
        });
    }

    private static double obterSaldo(Scanner scanner) {
        String campo = "Saldo";

        return obterEntrada(scanner, "Por favor, digite o " + campo + " inicial: ", entrada -> {
            if (entrada.isEmpty()) {
                throw new IllegalArgumentException("O campo " + campo + " não pode ser vazio !.");
            }
            if (!entrada.trim().matches("^\\d+(,\\d{1,2})?$")) {
                throw new IllegalArgumentException("O campo " + campo + " aceita apenas números de '0 a 9' e ',' (virgula) com até duas casas decimais. Exemplo: 123,45");
            }
            entrada = entrada.replace(",", ".");
            return Double.parseDouble(entrada);
        });
    }

    @Override
    public String toString() {
        return String.format("Olá %s, obrigado por criar uma conta em nosso banco! Sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque.", titular, agencia, conta, saldo);
    }
}
