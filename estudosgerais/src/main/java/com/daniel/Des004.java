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
        if (cpf == null) return false;

        cpf = cpf.replaceAll("\\D", "");

        if (cpf.length() != 11 || cpf.matches("^(\\d)\\1{10}$")) {
            return false;
        }

        return checkDigit(cpf, 9) && checkDigit(cpf, 10);
    }

    private static boolean checkDigit(String cpf, int position) {
        int sum = 0;
        for (int i = 0; i < position; i++) {
            sum += (cpf.charAt(i) - '0') * (position + 1 - i);
        }

        int remainder = sum % 11;
        int expectedDigit = (remainder < 2) ? 0 : (11 - remainder);

        return expectedDigit == (cpf.charAt(position) - '0');
    }
}
