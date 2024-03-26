import java.util.Scanner;

public class ExemploLeitorDados {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String enterStr = scan.next();
        System.out.print("Digite sua idade: ");
        int enterInt = scan.nextInt();
        if (enterInt < 18) {
            System.out.println("Vc não pode se registrar");
        } else {
            System.out.print("Digite seu sexo: ");
            String enterChar = scan.next();
            printItens(enterInt, enterStr, enterChar);
            scan.close();
            // creatPassword();
        }
    }

    public static void printItens(int age, String name, String sex) {
        System.out.printf("Nome: %s\nIdade: %d\nSexo: %s", name, age, sex);
    }


}
