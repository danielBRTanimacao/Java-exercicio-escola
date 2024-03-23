import java.util.Scanner;

public class ExemploLeitorDados {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String enterStr = scan.next();
        System.out.print("Digite sua idade: ");
        int enterInt = scan.nextInt();
        System.out.print("Digite seu peso: ");
        double enterDouble = scan.nextDouble();
        printItens(enterInt, enterStr, enterDouble);
        scan.close();
    }

    public static void printItens(int age, String name, double weight) {
        System.out.printf("Nome: %s\nIdade: %d\nPeso: %d", name, age, weight);
    }
}
