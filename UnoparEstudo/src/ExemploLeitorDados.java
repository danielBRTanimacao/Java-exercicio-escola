import java.util.Scanner;

public class ExemploLeitorDados {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String enterStr = scan.next();
        System.out.print("Digite sua idade: ");
        int enterInt = scan.nextInt();
        printItens(enterInt, enterStr);
        scan.close();
    }

    public static void printItens(int age, String name) {
        System.out.printf("Nome: %s\nIdade: %d", name, age);
    }
}
