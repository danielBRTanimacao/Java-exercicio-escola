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
        cpf = cpf.replaceAll("[^0-9]", "");
  
        if (cpf.length() != 11 || cpf.matches("(\\d)\\1{10}")) {
            return false;
        }
  
        int[] digits = new int[11];
        for (int i = 0; i < 11; i++) {
            digits[i] = cpf.charAt(i) - '0';
        }
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            sum += digits[i] * (10 - i);
        }
        int remainder = sum % 11;
        int digit1 = (remainder < 2) ? 0 : (11 - remainder);

        sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += digits[i] * (11 - i);
        }
        remainder = sum % 11;
        int digit2 = (remainder < 2) ? 0 : (11 - remainder);
  
        return (digit1 == digits[9] && digit2 == digits[10]);
    }
}
