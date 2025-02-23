package com.daniel;

public class Des004 {
    public static void main(String[] args) {
        // pegar os 9 primeiros valores e fazer vezes de 10x a 2x
        // depois soma todos os valores
        // divide por 11
        // se o resto da divisão for menor que 2 o penultimo digito e igual a = 0
        // se o resto for mair que 2 a 10 e so fazer menos (11 - valorsubtração)
        // para calcular o ultimo numero e so fazer cada um ate 11x a 2x
        // e so fazer o mesmo pra descobrir o ultimo

        String cpf = "132.297.514-00";
        System.out.println("O CPF " + cpf + " e valido? " + validateCpf(cpf));
    }

    public static boolean validateCpf(String cpf) {
        return true;
    }

    public static String formaterCPF(String cpf) {
        String cpfFormated = cpf.replaceAll("[^0-9]", "");
        return cpfFormated.replaceAll("(\\\\d{3})(\\\\d{3})(\\\\d{3})(\\\\d{2})", "$1.$2.$3-$4");
    }
}
